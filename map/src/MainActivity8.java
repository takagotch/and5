//CameraPosition.Builder bearing(float bearing)
//CameraPosition.Builder target(LatLng location)
//CameraPosition.Builder tilt(float tilt)
//CameraPosition.Builder zoom(float zoom)
//CameraPosition build()
//
//static CameraUpdate newCameraPosition(CameraPosition cameraPosition)
//
//void moveCamera(CameraUpdate update)
//void animateCamera(CameraUpdate update)

FragmentManager fragmentManager = getSupportFragmentManager();
SupportMapFragment fragment = (SupportMapFragment)
fragmentmanager.findFragmentById(R.id.fragmentMap);

GoogleMap map = fragment.getMap();

LatLng posTokyoStation = new LatLng(35.681382, 139.766084);

CameraPosition.Builder builder = new CameraPosition.Builder();
builder.target(posTokyoStation);
builder.zoom(13.0);
builder.bearing(0);
builder.title(25.0f);
map.moveCamera(CameraUpdateFactory.newCameraPosition(builder.build()));

