const express = require('express');
const { route } = require('./users');
const router = express.Router();
const multer = require('multer');

//=================================
//             product
//=================================
    var storage = multer.diskStorage({
        destination: function (req, file, cb) {
            cb(null, 'uploads/')
        },
        filename: function (req, file, cb) {

            cb(null, Date.now()+'_'+file.fieldname)
        }
    })

    var upload = multer({ storage: storage }).single("file")

    router.post('/image', ( req,res )=> {
        upload(req, res, err =>{
            if(err) {
                return req.json({message:false, err})
            }
            return res.json({message:true, filePath: res.req.file.path ,fileName: res.req.file.fieldname})
        })

    })





module.exports = router;
