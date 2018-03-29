//Criteria()
//void setAccuracy(int accuracy)
//void setPowerRequirement(int level)
//void setBearingRequest(boolean bearingRequired)
//void setAltitudeRequired(boolean altitudeRequired)
//void setSpeedAccuracy(int accuracy)
//void setVerticalAccuracy(int accuracy)
//
//void onProviderEnabled(String provider)
//void onProviderDisabled(String provider)
//void onLocationChanged(Location location)
//void onStatusChanged(String provider, int status, Bundle extras)
//
//String getBestProvider(Criteria, criteria, Boolean enableOnly)
//void requestLocationUpdates(String provider, long minTime, flaot minDistance, LocationListener listener)
//void removeUpdates(LocationListener listener)
//
//double getLatitude()
//double getLongitude()
//double getAccuracy()
//double getAltitude()
//double getBearing()
//double getSpeed()
//double getTime()
//
//ACCURACY_CODE, ACCURACY_FINE, ACCURACY_HIGH, ACCURACY_LOW, ACCURACY_MEDIUM
//POWER_HIGH, POWER_LOW, POWER_MEDIUM
//AVAILABLE< OUT_OF_SERVICE, TEMPORARILY_UNAVAILABLE
//
//android.permission.ACCESS_FINE_LOCATION
//android.permisison.ACCESS_COARSE_LOCATION
//
//device_Location

public class MainActivity extends Activity implements LocationListener {
  private LocationManager mLocationManager = null;
  private String mProvider = "";

  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Criteria criteria = new Criteria();

    criteria.setAccuracy(Cirteria.ACCURACY_COARSE);

    mLocationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
    mProvider = mLocationManager.getBestProvider(criteria, true);

    Toast.makeText(this, "provider = " + mProvider, Toast.LENGTH_SHORT).show();
  }

  @Override
  protected void onResume(){
    super.onResume();

    mLocationManager.requestLocationUpdates(mProvider, 0, 0, this);
  }

  @Override
  protected void onPause(){
    super.onPause();

    mLocationManager.removeUpdates(this);
  }

  @Override
  public void onLocationChanged(Locatoin location){
    Toast.makeText(this, "Location: " + location.getLatitude)( + ", " + location.getLongitude(),
    Toast.LENGTH_SHORT).show();
  }

  @Override
  public void onProviderEnabled(String provider){}

  @Override
  public void onStatusChanged(String provider, int status, Bundle extras){}

  @Override
  public void onProviderDisabled(String provider){}
}

