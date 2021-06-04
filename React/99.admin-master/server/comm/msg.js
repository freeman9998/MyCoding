var db = require('./db');

module.exports = (msgId, countryCd, callback) => {
    db((error, connection) => {
        connection.query(`SELECT msg_ctt FROM licom_msg WHERE msg_id = ${msgId} AND country_cd = IF(LENGTH('${countryCd}') > 0, '${countryCd}', 'US') LIMIT 1`, (err, rows, fields) => {
            connection.release();
            if(err) throw err;
            callback(rows[0].msg_ctt);
        })
    });
};