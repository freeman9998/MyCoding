const dbconfig = require('../conf/dbconf');
const mysql = require('mysql2/promise');
const pool = mysql.createPool(dbconfig);

var mapper = require('mybatis-mapper');
mapper.createMapper([
    './mapper/KR/common.xml', 
    './mapper/KR/resycmi12m09.xml'
]);

// var mapper = require('mybatis-mapper');
// mapper.createMapper([
//     './mapper/VN/common.xml', 
//     './mapper/VN/resycmi12m09.xml', 
//     './mapper/VN/sts.xml'
// ]);

module.exports = {
    getConn : async (nameSpace, selectId, param) => {
        const con = await pool.getConnection(async conn => conn);
        const sql = mapper.getStatement(nameSpace, selectId, param, {language: 'sql', indent: '  '});
// console.log("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<")
// console.log(sql)
// console.log(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
        const [rows, fields] = await con.query(sql).catch(async (err) => {
            con.connection.release();
            throw err;
        })

        con.connection.release();
        return rows;
    }
}