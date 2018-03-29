//GoogleMap getMap()
//LatLng(double latitude, double longitude)
//MarkerOptions position(LatLng position)
//MarkerOptions title(String title)
//MarkerOptions snippet(String snippet)
//MarkerOptions icon(BitmapDescriptro icon)
//Marker addMarker(MarkerOptions options)

FragmentManager fragmentManager = getSupportFragmentManager();
SupportMapFragment fragment = (SupportMapFragment)
	fragmentManager.findFragmentById(R.id.fragmentMap);
GoogleMap map = fragment.getMap();

LatLng.posTokyoStation = new LatLng(35.681382, 139.7660884);

MarkerOptions options = new MarkerOptions();
options.potision(posTokyoStation);
options.title("TOKYO ST");

map.addMarker(options);

