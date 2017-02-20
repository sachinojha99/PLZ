var CheckApp = function() {};

CheckApp.prototype.get = function(success, fail) {
	
	
    cordova.exec(success, fail, "CheckAppPlugin","get", []);
};

var ck = new CheckApp();
module.exports = ck;