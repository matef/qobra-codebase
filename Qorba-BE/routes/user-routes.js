var User = require("../model/user");

exports.listFriends = function(req,res){
	var userid = req.body.userid;
	User.findById(userid,function(err,user){
		if(err){
			console.log('retrieval error');
			throw err;
		}
		console.log('current user is found');
		console.log('current user has '+ user.friends.length +' friends');
		
		User.find({_id: {$in : user.friends}},function(err,users){
			res.set('Content-Type', 'application/json');
			res.json(users);
		});
	});
};
exports.view = function(req,res){
	var userid = req.body.userid;
	User.findById(userid,function(err,user){
		if(err){
			console.log('retrieval error');
			throw err;
		}
		console.log('current user is found');
		res.set('Content-Type', 'application/json');
		res.json(user);
	});
};
exports.update = function(req,res){
	/**
	 * to be implemented
	 */
};
exports.create = function(req,res){
	var requser = req.body;
	var user = new User({
		username : requser.username,
		email : requser.email,
		fullname : requser.fullname,
		profileimg : requser.profileimg
	});
	user.save();
};
exports.addFriend = function(req,res){
	var userid = req.body.userid;
	var friendid = req.body.friendid;
	User.findById(userid,function(err,user){
		if(err){
			console.log('retrieval error');
			throw err;
		}
		console.log('current user is found');
		
		if(user.friends instanceof Array){
			user.friends.push(friendid);
		}
		else{
			user.friends = [friendid];
		}
		res.set('Content-Type', 'application/json');
		res.json('{status:done}');
	});
};