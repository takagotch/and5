//List<Sensor> getSensorList(int type)
//boolean registerListener(SensorEventListner listner, Sendor sensor, int rate)
//boolean unregisterListener(SensorEventListener listener)
//
//void onAccuracyChanged(Sensor sensor, int accuracy)
//void onSensorChanged(SensorEvent event)
//
//accuracy
//sensor
//timestamp
//values
//
//TYPE_ACCELEROMETER
//TYPE_ALL
//TYPEGRROSCOPE
//TYPE_LIGHT
//TYPE_PRESSURE
//TYPE_PROXIMITY
//TYPE_TEMPERATURE
//
//SENSOR_DELAY_FASTEST
//SENSOR_DELAY_GAME
//SENSOR_DELAY_NORMAL
//SENSOR_DELAY_UI
//
//sensor_Accelerometer

@Override
protected void onCreate(Bundle savedInstanceState){
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);

  TextView tv_accelerometer = (TextView) findViewById(R.id.tv_accelerometer);

  SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);

  if(sensorManager.getSensorList(Sensor.TYPE_ACCELEROMETER).size() == 0){
    tv_acceletometer.setText("SENSOR UN");
  } else {
    Sensor accelerometer = sensorManager.getSensorList(Sensor.TYPE_ACCELEROMETER).get(0);

    if(!sensorManager.registerListener(this, accelerometer, SensorManager.SENSOR_DELAY_UI)){
      tv_accelerometer.setText("ERR");
    }
  }
}

@Override
public boolean onCreateOptionsMenu(Menu menu){
  getMenuInflater().inflate(R.menu.main, menu);
  return true;
}

@Override
public void onAccuracyChanged(Sensor sensor, int accuracy){
}

@Override
public void onSensorChanged(SensorEvent event){
  TextView tv_accelerometer = (TextView) findViewByI(R.id.tv_accelerometer);
  tv_accelerometer.setText(
	"X: " + event.values[0] +
	", Y: " + event.values[1] +
	", Z: " + event.values[2]);
}


