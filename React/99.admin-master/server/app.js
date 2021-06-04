var express = require('express');
var path = require('path');
var cookieParser = require('cookie-parser');
var morgan = require('morgan');

var menuRouter = require('./routes/comm/menu');
var loginRouter = require('./routes/comm/login');


var resycmi12m09 = require('./routes/sts/resycmi12m09');
var resycmi12m12 = require('./routes/sts/resycmi12m12');

var app = express();

app.use(morgan('dev'));
app.use(express.json());
// app.use(express.urlencoded({ extended: false }));
app.use(express.urlencoded({ extended: true }));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, 'public')));

app.use('/menu', menuRouter);
app.use('/login', loginRouter);


app.use('/resycmi12m09', resycmi12m09);
app.use('/resycmi12m12', resycmi12m12);

module.exports = app;
