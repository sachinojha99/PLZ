package get;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;


public class CheckAppPlugin extends CordovaPlugin {
	
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("get")) {
        callbackContext.success("now its working...");
            return true;
        }
        return false;
    }   
}