var express = require('express');
var router = express.Router();
var qr = require('../../comm/query_promise');
var msg = require('../../comm/msg');

router.get('/', async function(req, res, next) {
    console.log(req.query)

    const proc = JSON.parse(req.query.proc)

    if(req.query.option) {
        const resultArr = new Array()

        const result = await qr.getConn(proc.path, proc.action, JSON.parse(req.query.params))
                               .then((data) => {
                                    if(data.length > 0) {
                                        resultArr.push(req.query.option)

                                        data.map(rs => {
                                            const tmp = new Array()

                                            for(var i = 1; i <= req.query.option.length; i++) {
                                                tmp.push(rs['col'+i])
                                            }

                                            resultArr.push(tmp)
                                        })
                                    }
                                })
        if(resultArr.length > 0) {
            return res.json({
                resultCode : 200,
                resutlMsg : 'OK',
                data : resultArr
            });
        } else {
            return res.json({
                resultCode : 200,
                resutlMsg : 'OK',
                data : ''
            });
        }
    } else {
        const result = await qr.getConn(proc.path, proc.action, JSON.parse(req.query.params))

        return res.json({
            resultCode : 200,
            resutlMsg : 'OK',
            data : result
        });
    }
});

router.get('/comboChartList', async function(req, res, next) {
    console.log(req.query)

    const resultArr = new Array()
    const month_names_short = ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']

    const orderList = await qr.getConn('resycmi12m09', 'orderListBySort', JSON.parse(req.query.params))

    const tmp = new Array()

    if(orderList.length > 0) {
        tmp.push('Month')
    } else {
        return res.json({
            resultCode : 200,
            resutlMsg : 'OK',
            data : ''
        })
    }

    for(var i = 0; i < orderList.length; i++) {
        tmp.push(orderList[i].prod_nm)
    }

    resultArr.push(tmp)

    var date = new Date()
    var yy = date.getFullYear()
    var mm = 12

    const j_param = JSON.parse(req.query.params)

    if(j_param.rgst_yy == yy) {
        mm = date.getMonth() + 1
    }

    for(var i = 1; i <= mm; i ++) {
        var month = (i.toString()[1] ? i.toString() : '0' + i.toString()[0])

        var param = {
            biz_id : j_param.biz_id,
            order_seq : j_param.order_seq,
            rgst_ymd : j_param.rgst_yy + month
        }

        const monthlyList = await qr.getConn('resycmi12m09', 'monthlyOrderCnt', param)

        const tmp = new Array()
        // tmp.push(j_param.rgst_yy + '-' + month)
        tmp.push(month_names_short[i-1])

        for(var y = 0; y < monthlyList.length; y++) {
            tmp.push(monthlyList[y].cnt)
        }

        resultArr.push(tmp)
    }

    return res.json({
        resultCode : 200,
        resutlMsg : 'OK',
        data : resultArr
    })
});

module.exports = router;