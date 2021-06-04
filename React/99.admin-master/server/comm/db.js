const log = require('./logger');
const mysql = require('mysql');
const dbconfig = require('../conf/dbconf');
const pool = mysql.createPool(dbconfig);

pool.on('acquire', function(con) {
    log.info(`Connection ${con.threadId} acquire`);
});

pool.on('enqueue', function() {
    log.info(`Waiting for available connection slot`);
});

pool.on('release', function(con) {
    log.info(`Connection ${con.threadId} released`);
});

const getConn = function(callback) {
    pool.getConnection(function(err, con) {
        if(err) {
            throw err;
        }
        
        callback(err, con);
    });
}

module.exports = getConn;