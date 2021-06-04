var express = require('express');
var router = express.Router();
// var qr = require('../../comm/query');
var qr = require('../../comm/query_promise');
var msg = require('../../comm/msg');

router.get('/', async function(req, res, next) {
    var result   = new Array()
    var data_arr = new Array()

    console.log(req.query)
    console.log(req.body)

    // const menu_level = await qr.getConn('commMapper', 'max_menu_level', req.query)
    const top_menu   = await qr.getConn('commMapper', 'top_menu_list', req.query)

    for(const top_data of top_menu) {
        var param = {
            user_id      : req.query.user_id,
            high_menu_id : top_data.menu_id
        };

        const sub_menu1 = await qr.getConn('commMapper', 'sub_menu_list', param);

        for(const sub_data1 of sub_menu1) {
            var param = {
                user_id      : req.query.user_id,
                high_menu_id : sub_data1.menu_id
            };

            const sub_menu2 = await qr.getConn('commMapper', 'sub_menu_list', param);

            for(const sub_data2 of sub_menu2) {
                var param = {
                    user_id      : req.query.user_id,
                    high_menu_id : sub_data2.menu_id
                };
    
                const sub_menu3 = await qr.getConn('commMapper', 'sub_menu_list', param);
                sub_data2.sub = sub_menu3
            }

            sub_data1.sub = sub_menu2
        }
        
        top_data.sub = sub_menu1
        data_arr.push(top_data);
    }

    return res.json({
        resultCode : 200,
        resutlMsg : 'OK',
        data : data_arr
    });

    // return res.json(data_arr);

    // try {
    //     qr.select(req.method, 'commMapper', 'menu_list', req.query, (rs_menu, err, fields) => {
    //         console.log(rs_menu)
            
    //         return res.json({
    //             resultCode : 200,
    //             resutlMsg : 'OK',
    //             data : rs_menu
    //         });
    //     });
    // } catch(error) {
    //     console.error(error);
    // }
});

module.exports = router;