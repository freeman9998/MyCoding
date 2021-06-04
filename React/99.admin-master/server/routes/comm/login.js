var express = require('express');
var router = express.Router();
var qr = require('../../comm/query_promise');
var msg = require('../../comm/msg');

router.get('/', async function(req, res, next) {
    console.log(req.query)

    const user   = await qr.getConn('commMapper', 'login', req.query).then((data) => {

        if(data.length > 0) {
            return res.json({
                resultCode : 200,
                resutlMsg : 'OK',
                data : data[0]
            });
        } else {
            return res.json({
                resultCode : 401,
                resutlMsg : 'OK',
                data : ''
            });
        }
    })

    // return res.json(user);
});

router.get('/demo', async function(req, res, next) {
    console.log(req.query)

    const user   = await qr.getConn('commMapper', 'demo_login', req.query).then((data) => {
console.log(data)
        if(data.length > 0) {
            return res.json({
                resultCode : 200,
                resutlMsg : 'OK',
                data : data[0]
            });
        } else {
            return res.json({
                resultCode : 401,
                resutlMsg : 'OK',
                data : ''
            });
        }
    })

    // return res.json(user);
});

module.exports = router;