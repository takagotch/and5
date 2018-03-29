//void activate(LocationSource.OnLocationChangedListener listener)
//void deactivate()
//
//void onLocationChanged(Location location)
//void setLocationSource(LocationSource source)
//map_Location
@Override
protected onCreate(Bundle savedInstanceState){
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);

  FragmentManager fragmentManager = getSupportFragmentManager();
  SupportMapFragment fragment = (SupportMapFragment) fragmentManager.findFragmentById(R.id.fragmentMap);

  GoogleMap map = fragment.getMap();

  map.setMyLocationEnabled(true);

  map.setLocationSource(new LocationSource());
}

private class LocationSource implements LocationSource{
  @Override
  pubilc void activate(OnLocationChangedListener listener){
    Location loc = new Location("LocalLocation");
    loc.setLatitude(35.632547);
    loc.setLongitude(139.88133);
    loc.setAccuracy(100);
    listener.onLocationChanged(loc);
  }

  @Override
  public void deactivate(){
  }
}

