//PackageManager getPackageManager()
//boolean hasSystemFeature(String name)
//
//FEATURE_CAMERA
//FEATURE_CAMERA_AUTOFOCUS
//FEATURE_CAMERA_FLASH
//FEATURE_LIVE_WALLPAPER
//FEATURE_SENSOR_LIGHT
//FEATURE_SENSOR_PROXIMITY
//FEATURE_TELEPHONY
//FEATURE_TELEPHONY_COMA
//FEATURE_TELEPHONEY_GSM
//FEATURE_TOUCHSCREEN_MULTITOUCH
//FEATURE_BLUETOOTH
//FEATURE_LOCATION
//FEATURE_LOCATION_GPS
//FEATURE_LOCATION_NETWORK
//FEATURE_MICROPHONE
//FEATURE_SENSOR_ACCELEROMETER
//FEATURE_SENSOR_COMPASS
//FEATURE_TOUCHSCREEN
//FEATURE_TOUCHSCREEN_MULTITOUCH_DISTINCT
//FEATURE_WIFI
//FEATURE_AUDIO_LOW_LATENCY
//FEATURE_CAMERA_FRONT
//FEATURE_NFC
//FEATURE_SENSOR_BAROMETER
//FEATURE_SENSOR_GYROSCOPE
//FEATURE_NFC
//FEATURE_SENSOR_BAROMETER
//FEATURE_SENSOR_GYROSCOPE
//FEATURE_SIP
//FEATURE_SIP_VOIP
//FEATURE_TOUCHSCREEN_MULTITOUCH_JAZZHAND
//FEATUEE_FAKETOUCH
//FEATURE_USB_ACCESSORY
//FEATURE_FAKETOUCH_MULTITOUCH_DISTINCT
//FEATURE_FAKETOUCH_MULTITOUCH_JAZZHAND
//FEATURE_SCREEN_LANDSCAPE
//FEATURE_SCREEN_PORTRAIT
//FEATURE_WIFI_DIRECT
//FEATURE_TELEVISION
//FEATURE_CAMERA_ANY
//
//device_CheckFeature

PackageManager packageManager = getPackageManager();
if(packageManager, hasSystemFeature(PackageManager.FEATURE_CAMERA)){
  Toast.makeText(this, "UNVALIDATED", Toast.LENGTH_SHORT).show();
} else {
  Toast.makeText(this, "UNVALIDATED", Toast.LENGTH_SHORT).show();
}

