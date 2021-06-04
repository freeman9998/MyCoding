const dbconfig = require('../conf/dbconf');
const mysql = require('mysql2/promise');
const pool = mysql.createPool(dbconfig);

var mapper = require('mybatis-mapper');
mapper.createMapper(['./mapper/common.xml']);

module.exports = {
    getConn : async (nameSpace, selectId, param) => {
        const connection = await pool.getConnection(async conn => conn);
        const sql = mapper.getStatement(nameSpace, selectId, param, {language: 'sql', indent: '  '});

        const [rows, fields] = await con.query(sql).catch(async (err) => {
            con.connection.release();
            throw err;
        })
        
        con.connection.release();
        // console.log(rows)
        return rows;
    }
}