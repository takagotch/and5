//Polyline addPolyline(PolylineOptions options)
//PolylineOptions add(LatLng point)
//PolylineOptions addAll(Iterable<LatLng> points)
//PolylineOptions geodesic(boolean geobasic)
//PolylineOptions color(int color)
//PolylineOptions width(float width)
//
//maps_Polyline

FragmentManager fragmentManager = getSupportFragmentManager();
SupportMapFragment fragment = (SupportMapFragment) fragmentManager.fidFragmentById(R.id.fragmentMap);

GoogleMap map = fragment.getMap();

PolylineOptions options = new PolylineOptions();
options.add(new LatLng(35.689488, 139.6917035.689488, 139.6917066));
options.add(new LatLng(-14.235004, -51.92528));
options.color(Color.BLUE);
options.width(5);
options.geodesic(true);

map.addPolyline(options);

