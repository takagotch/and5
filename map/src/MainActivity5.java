//UISettings getUISettings()
//boolean isCompassEnabled()
//boolean isMyLocationButionEnabled()
//boolean isRotateGesturesEnabled()
//boolean isScrollGesturesEnabled()
//boolean isTiltGestureEnabled()
//boolean isZoomControlsEnabled()
//boolean isZoomGestureEnabled()
//void setAllGesturesEnabled(boolean enabled)
//void setCompassEnabled(boolean enabled)
//void setRotateGesturesEnabled(boolean enabled)
//void setTiltGesturesEnabled(boolean enabled)
//void setZoomControlsEnabled(boolean enabled)
//void setZoomGesturesEnabled(boolean enabled)

UiSettins uiSettings = mMap.getUISetting();

if(!uiSettings.isCompassEnabled()){
  uiSettings.setCompassEnabled(true);
}

//void setTrafficEnabled(boolean enabled)
//
map.setTrafficEnabled(true);

//
//void setMyLocationEnabled(boolean enabled)

map.setMyLocationEnable(true);

