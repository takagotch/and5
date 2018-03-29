//void setMapType(int type)
//
//maps_ShowMap

map.setMaptype(GoogleMap.MAP_TYPE_TERRAIN);

//void setOnMapClickListener(GoogleMap, OnMapClickListener listener)
//void setOnMapLongClickListener(GoogleMap.OnMapClickListener listener)
//void setOnCameraChangeListener(GoogleMap.OnCameraChangeListener listener)
//void setOnInfoWindowClickListener(GoogleMap.OnInfoWindowClickListener listener)
//void onMapClick(LatLng point)
//void onMapLongClick(LatLng point)
//void onCameraChange(CameraPosition position)
//onInfowindowClick(Marker marker)
//
//maps_ShowMap

map.setOnMapClickListener(new GoogleMap.OnMapClickListener(){
  @Override
  public void onMapClick(LatLng point){
    Toast.makeText(getApplicationContext(),
		    "CLICK " + point.latitude + ", " + point.longitude, Toast.LENGTH_SHORT).show();
  }
});

map.setOnMapLongClickListener(new GoogleMap.OnMapLongClickListener(){
  @Override
  public void onMapLongClick(LatLng point){
    Toast.makeText(getApplicationContext(),
	"PUSH " + point.latitude + ", " + "
point.longitude, Toast.LENGTH_SHORT).show();
  }
});

map.setOnChangeListener(new GoogleMap.OnCameraChangeListener(){
  @Override
  public void onCameraChange(CameraPosition position){
    LatLng point = position.target;
    Toast.makeText(getApplicationContext(),
	"CAMERA" + point.latitude + ", " + "
point.longitude, Toast.LENGTH_SHORT).show();
  }
});


