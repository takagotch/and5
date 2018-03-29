//
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

