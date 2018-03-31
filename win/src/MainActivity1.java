//void setRequestedOrientation(int requestedOrientation)
//
//unspecified
//user
//behind
//portrait
//sensor
//nonsensor
//reverseLandscape
//reversePortrait
//sensorLandscape
//sensorPortrait
//fullSensor
//
//SCREEN_ORIENTATION_UNSPECIFIED, SCREEN_ORIENTATION_LANDSCAPE, SCREEN_ORIENTATION_PORTRAIT, SCREEN_ORIENTATION_USER, SCREEN_ORIENTATION_BEHIND, SCREEN_ORIENTATION_SENSOR, SCREEN_ORIENTATION_NOSENSOR
//SCREEN_ORIENTATION_SENSOR_LANDSCAPE, SCREEN_ORIENTATION_SENSOR_PORTRAIT, SCREEN_ORIENTATION_REVERSE_LANDSCAPE, SCREEN_ORIENTATION_REVERSE_PORTRAIT, SCREEN_ORIENTATION_FULL_SENSOR


@Override
public void onCreate(Bundle savedInstanceState){
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);

  setRequestedOrientation(ActivityInfo.
		  SCREEN_ORIENTAION_REVERSE_PORTRAIT);
}


