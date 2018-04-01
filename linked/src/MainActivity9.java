Button btn_dial = (Button) findViewById(R.id.btn_dial);
btn_dial.setOnClickListener(new View.OnClickListener(){
  @Override
  public void onClick(View v){
    Uri uriTel = Uri.parse("tel:0000-000-000");
    Intent intent = new Intent(Intent.ACTION_DIAL, uriTel);
    startActivity(intent);
  }
});

Button btn_app = (Button) findViewById(R.id.btn_app);
btn_app.setOnClickListener(new View.OnClickListener(){
  @Override
  public void onClick(View v){
    Uri uri = Uri.parse("market://details?id=net.buildbox.app.StepMoney");
    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
    startActivity(intent);
  }
});
Button btn_developer = (Button) findViewById(R.id.btn_developer);
btn_developer.setOnClickListener(new View.OnClickListener(){
  @Override
  public void onClick(View v){
    Uri uri = Uri.parse("market://search?q=net.buildbox.app");
    Intent intent = new intent(Intent.ACTION_VIEW, uri);
    startActivity(intent);
  }
});



public void callSettings(View v){
  Intent intent = new Intent();
  intent.setAction(android.provider.Settings.ACTION_SETTINGS);
  startActivity(intent);
}
public void callAccessBility(View v){
  Intent intent = new Intent();
  intent.setAction(android.provider.Settings.ACTION_ACCESSIBILITY_SETTINGS);
  startActivity(intent);
}
public void callAccount(View v){
  Intent intent = new Intent();
  intent.setAction(android.provider.Settings.ACTION_ADD_ACCOUNT);
  startActivity(intent);
}
public void callAirplaneMode(View v){
  Intent intent = new Intent();
  intent.setAction(android.provider.Settings.ACTION_AIRPLANE_MODE_SETTINGS);
  startActivity(intent);
}
public void callApn(View v){
  Intent intent = new Intent();
  intent.setAction(android.provider.Settings.ACTION_APN_SETTINGS);
  startActivity(intent);
}
public void callApplicationDetail(View v){
  Intent intent = new Intent();
  intent.setAction(android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
  startActivity(intent);
}
public void callApplicationDevelopment(View v){
  Intent intent = new Intent();
  intent.setAction(android.provider.Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS);
  startActivity(intent);
}
public void callApplication(View v){
  Intent intent = new Intent();
  intent.setAction(android.provider.Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS);
  startActivity(intent);
}
public void callBlutooth(View v){
  Intent intent = new Intent();
  intent.setAction(android.provider.Settings.ACTION_APPLICATION_SETTINGS);
  startActivity(intent);
}
public void callDataRoaming(View v){
  Intent intent = new Intent();
  intent.setAction(android.provider.Settings.ACTION_DATA_ROAMING_SETTINGS);
  startActivity(intent);
}
public void callDate(View v){
  Intent intent = new Inttent();
  intent.setAction(android.provider.Settings.ACTION_DATA_SETTINGS);
  startActivity(intent);
}
public void callDeviceInfo(View v){
  Intent intent = new Intent();
  intent.setAction(android.perovider.Settings.ACTION_DEVICE_INFO_SETTINGS);
  startActivity(intent);
}
public void callDisplay(View v){
  Intent intent = new Intent();
  intent.setAction(android.provider.Settings.ACTION_DISPLAY_SETTIGS);
  startActivity(intent);
}
public void callInputMethod(View v){
  Intent intent = new Intent();
  intent.setAction(android.provider.Settings.ACTION_INPUT_METHOD_SETTINGS);
  startActivity(intent);
}
public void callStorage(View v){
  Intent intent = new Intent();
  intent.setAction(android.provider.Settings.ACTION_INTERNAL_STORAGE_SETTINGS);
  startActivity(intent);
}
public void callLocale(View v){
  Intent intent = new Intent();
  intent.setAction(android.provider.Settings.ACTION_LOCALE_SETTINGS);
  startActivity(intent);
}
public void callLocation(View v){
  Intent intent = new Intent();
  intent.setAction(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
  startActivity(intent);
}
public void callAllApplication(View v){
  Intent intent = new Intent();
  intent.setAction(android.provider.Settings.ACTION_MANAGE_ALL_APPLICATIONS_SETTINGS);
  startActivity(intent);
}
public void callDownloadApplication(View v){
  Intent intent = new Intent();
  intent.
}


