//
//

WifiManager wifiMgr = (WifiManager) getSystemService(WIFI_SERVICE);
boolean bEnabled = wifiMgr.isWifiEnabled();

TextView tv_wifiEnabled = (TextView) findViewById(R.is.tv_wifiEnabled);
tv_wifiEanbled.setText("WIFI" + (bEnabled? "true" : "false") );

int wifiState = wifiMgr.getWifiState();
TExtView tv_wifiState = (TextView) findViewById(R.id.tv_wifiState);
switch(wifiState){
  case WifiManager.WIFI_STATE_DISABLED:
	  tv_wifiState.setText("WIFI: INVALIDATING");
	  break;
  case WifiManager.WIFI_STATE_DISABLED:
	  tv_wifiState.setText("WIFI: INVALIDATED");
	  break;
  case WifiManager.WIFI_STATE_ENABLING:
	  tv_wifiState.setText("WIFI: VALIDATING");
	  break;
  case WifiManager.WIFI_STATE_ENABLED:
	  tv_wifiState.setText("WIFI: VALIDATED");
	  break;
  case WifiManager.WIFI_STATE_UNKOWN:
	  tv_wifiState.setText("WIFI: UNKNOWN");
	  break;
}


