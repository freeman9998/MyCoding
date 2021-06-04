var express = require('express');
var router = express.Router();
var qr = require('../../comm/query_promise');
var msg = require('../../comm/msg');

router.get('/biz', async function(req, res, next) {
    console.log(req.query)
    
    const result   = await qr.getConn('stsMapper', 'resycmi12m12-biz', req.query)

    return res.json({
        resultCode : 200,
        resutlMsg : 'OK',
        data : result
    });
});

router.get('/order', async function(req, res, next) {
    console.log(req.query)
    
    const result   = await qr.getConn('stsMapper', 'resycmi12m12-order', req.query)

    return res.json({
        resultCode : 200,
        resutlMsg : 'OK',
        data : result
    });
});

router.get('/worldGeoChart', async function(req, res, next) {
    console.log(req.query)
    const resultArr = new Array()
    const resultObject = new Object()

    const tmp = new Array()

    tmp.push('Country')
    tmp.push('인증횟수')
    resultArr.push(tmp)
    
    const result   = await qr.getConn('stsMapper', 'resycmi12m12-worldGeoChart', req.query)
                             .then((res) => {
                                 res.map(rs => {
                                     const tmp = new Array()
                                     tmp.push(rs.location_cd)
                                     tmp.push(rs.cnt)
                                     resultArr.push(tmp)
                                 })
                             })

    return res.json({
        resultCode : 200,
        resutlMsg : 'OK',
        data : resultArr
    });
});

router.get('/countryGeoChart', async function(req, res, next) {
    console.log(req.query)
    
    const result   = await qr.getConn('stsMapper', 'resycmi12m12-countryGeoChart', req.query)

    return res.json({
        resultCode : 200,
        resutlMsg : 'OK',
        data : result
    });
});

router.get('/regionGeoChart', async function(req, res, next) {
    console.log(req.query)
    const resultArr = new Array()
    const resultObject = new Object()

    const tmp = new Array()

    tmp.push('City')
    tmp.push('인증횟수')
    resultArr.push(tmp)
    
    const result   = await qr.getConn('stsMapper', 'resycmi12m12-regionGeoChart', req.query)
                             .then((res) => {
                                 res.map(rs => {
                                     const tmp = new Array()
                                     tmp.push(rs.city)
                                     tmp.push(rs.cnt)
                                     resultArr.push(tmp)
                                 })
                             })

    return res.json({
        resultCode : 200,
        resutlMsg : 'OK',
        data : resultArr
    });
});

router.get('/devicePieChart', async function(req, res, next) {
    console.log(req.query)
    const resultArr = new Array()
    const resultObject = new Object()

    const tmp = new Array()

    tmp.push('Device')
    tmp.push('인증횟수')
    tmp.push('제조사')
    resultArr.push(tmp)
    
    const result   = await qr.getConn('stsMapper', 'resycmi12m12-devicePieChart', req.query)
                             .then((res) => {
                                 res.map(rs => {
                                     const tmp = new Array()
                                     tmp.push(rs.device)
                                     tmp.push(rs.cnt)
                                     tmp.push(rs.manufacture)
                                     resultArr.push(tmp)
                                 })
                             })

    return res.json({
        resultCode : 200,
        resutlMsg : 'OK',
        data : resultArr
    });
});

router.get('/genderPieChart', async function(req, res, next) {
    console.log(req.query)
    const resultArr = new Array()
    const resultObject = new Object()

    const tmp = new Array()

    tmp.push('Gender')
    tmp.push('인증횟수')
    tmp.push('가입유형')
    resultArr.push(tmp)
    
    const result   = await qr.getConn('stsMapper', 'resycmi12m12-genderPieChart', req.query)
                             .then((res) => {
                                 res.map(rs => {
                                     const tmp = new Array()
                                     tmp.push(rs.gender)
                                     tmp.push(rs.cnt)
                                     tmp.push(rs.login_typ_cd)
                                     resultArr.push(tmp)
                                 })
                             })

    return res.json({
        resultCode : 200,
        resutlMsg : 'OK',
        data : resultArr
    });
});


router.get('/', async function(req, res, next) {
    console.log(req.query)
    
    const result   = await qr.getConn('stsMapper', 'resycmi12m12', req.query)

    return res.json({
        resultCode : 200,
        resutlMsg : 'OK',
        data : result
    });
});

module.exports = router;