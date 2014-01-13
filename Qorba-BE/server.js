var express = require('express'),
app = express(),
site = require('../utils/site'),
user = require('../model/user'),
outing = require('../model/outing');


//config
app.use(express.logger('dev'));
app.use(express.cookieParser());
app.use(express.bodyParser());
app.use(express.methodOverride());
app.use(express.static(__dirname + '/public'));


//General
app.get('/', site.index);

//user
app.all('/users', user.list);
app.get('/user/:id', user.view);
app.get('/user/:id/view', user.view);
app.put('/user/:id/create', user.create);
app.put('/user/:id/update', user.update);

//outing


//listen
app.listen(3000);
console.log('Express app started on port 3000');