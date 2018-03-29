//bollean setWifiEnabled(boolean enabled)
//
//android.permission.CHANGE_WIFI_STATE
//
//device_WifiChange

tbnt_WifiChange.setOnCheckedChangeListener(new CompoundCutton, OnCheckedChangeListener(){
  @Override
  public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
    WifiManager wifiMgr = (WifiManager) getSystemService(WIFI_SERVICE);
    wifiMgr.setWifiEnabled(isChecked);
  }
});

