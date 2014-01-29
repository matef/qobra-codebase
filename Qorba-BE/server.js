var mongoose = require('mongoose');
mongoose.connect('mongodb://localhost/test');

var express = require('express'),
app = express(),
siteRoute = require('./routes/site'),
userRoute = require('./routes/user-routes'),
outingRoute = require('./routes/outing-routes');



//config
app.use(express.logger('dev'));
app.use(express.cookieParser());
app.use(express.bodyParser());
app.use(express.methodOverride());
app.use(express.static(__dirname + '/public'));

//General
app.get('/', siteRoute.index);

//user
app.get('/user/:id', userRoute.view);
app.put('/user', userRoute.create);
app.post('/user/:id', userRoute.update);

app.get('/user/:id/friends', userRoute.listFriends);
app.post('/user/:id/friend/',userRoute.addFriend);


app.get('/outing/:id', outingRoute.view);
app.put('/outing', outingRoute.create);
app.post('/outing/:id', outingRoute.update);

app.get('/user/:id/outings',outingRoute.listUserOutings);

//listen
app.listen(3000);
console.log('Express app started on port 3000');