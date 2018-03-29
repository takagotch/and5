//android:name
//
//device_WifiChange

public class WifiChangeReceiver extends BroadcastReceiver {
  @Overrride
  public void onReceive(Context context, Intent intent){
    String action = intent.getAction();

    if(action.equals(WifiManager.WIFI_STATE_CHANGED_ACTION)){
      int wifiState = intent.getIntExtra(WifiManager. EXTRA_WIFI_STATE, WifiManager.WIFI_STATE_UNKNOWN);
      switch(wifiState){
	      case WifiManager.WIFI_STATE_DISABLING:
		      Toast.makeText(context, "INVALIDATED", Toast.LENGTH_SHORT);
		      break;
	      case WifiManager.WIFI_STATE_DISABLED:
		      Toast.makeText(context, "INVALID", Toast.LENTH_SHORT);
		      break;
	      case WifiManager.WIFI_STATE_ENABLING:
		      Toast.makeText(context, "VALIDATED", Toast.LENGTH_SHORT).show();
		      break;
	      case WifiManager.WIFI_STATE_ENABLED:
		      Toast.makeText(context, "VALID", Toast.LENGTH_SHORT).show();
		      break;
	      case WifiManager.WIFI_STATE_UNKNOWN:
		      Toast.makeText(context, "UNKONW", Toast.LENGTH_SHORT).show();
		      break;
      } 
    }
  }
}


