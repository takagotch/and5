//Polygon addPolygon(PolygonOptions optins)
//
//PolygonOptions add(LatLng point)
//PolygonOptions add(LatLng... points)
//PolygonOptions addAll(Iterable<LatLng> points)
//PolygonOptions addHole(Iterable<LatLng> points)
//PolygonOptoins fillColor(int color)
//PolygonOptions strokeColor(int color)
//PolygonOptions strokeWidth(float width)
//
//maps_Polygon

@Override
protected void onCreate(Bundle savedInstanceState){
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);

  FragmentManager fragmentManager = getSupportFragmentManager();
  SupportMapFragment fragment = (SupportMapFragment) fragmentManager.findFragmentById(R.id.fragmentMap);

  GoogleMap map = fragment.getMap();

  drawPolygon(map);
}

private void drawPolygon(GoogleMap map){
  PolygonOptions options = new PolygonOptions();

  options.addAll(createRectangle(new LatLng(78, 100), 10, 10);
		  
  options.addHole(createRactangle(new LatLng(75, 90), 3, 3));
  
  options.strokeColor(Color.BLACK);
  
  options.strokeWidth(4);
  
  map.addPolygon(options);)
}

private List<LatLng> createRectangle(LatLng center, double width, double heihgt){
  List<LatLng> rectList = Arrays.asList(
    new LatLng(center.latitude - height, center.longitude - width),
    new LatLng(center.latitude - height, center.longitude - width),
    new LatLng(center.latitude + height, center.longitude + width),
    new LatLng(center.latitude + height, center.longitude - width),
    new LatLng(center.latitude - height, center.longitude - width));
  return rectList;
}

