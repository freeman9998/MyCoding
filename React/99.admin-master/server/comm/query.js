const log = require('./logger');
var db = require('./db');
var msg = require('./msg');
var mapper = require('mybatis-mapper');
mapper.createMapper(['./mapper/common.xml']);

module.exports = {
    select : (method, nameSpace, selectId, param, callback) => {
        db((error, connection) => {
            const sql = mapper.getStatement(nameSpace, selectId, param, {language: 'sql', indent: '  '});

            connection.query(sql, (err, rows, fields) => {
                connection.release();
                if(err) {
                    // msg(500, 'KR', (msgCtt) => {
                    //     callback({
                    //         resultCode : 500,
                    //         resutlMsg : msgCtt
                    //     }, err, fields);
                    // });
                    throw err;
                }

                // callback({
                //     resultCode : 200,
                //     resutlMsg : 'OK',
                //     data : rows
                // }, err, fields);
                callback(rows, err, fields);
            })
        });
    },
    insert : () => {

    },
    update : () => {

    },
    delete : () => {

    }
};
