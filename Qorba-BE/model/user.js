var mongoose = require('mongoose');
var Schema = mongoose.Schema;
var User = new Schema({
	username : String,
	email : String,
	fullname : {first : String , last:String},
	profileimg : String,
	friends : [Schema.Types.ObjectId],
	creationdate : { type: Date, default: Date.now}		
});
module.exports = mongoose.model('User', User);