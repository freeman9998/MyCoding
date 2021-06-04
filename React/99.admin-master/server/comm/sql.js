var mapper = require('mybatis-mapper');
mapper.createMapper(['./mapper/test.xml', './mapper/test2.xml']);

module.exports = {
    getSql : (nameSpace, selectId, param) => {
        const sql = mapper.getStatement(nameSpace, selectId, param, {language: 'sql', indent: '  '});
        return sql;
    }
};