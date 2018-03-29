//GroundOverlay addGroundOverlay(GroundOverlayOptions options)
//static CameraUpdate newLatLngZoom(LatLng latLng, float zoom)
//static BitmapDescriptorfromAsset(String assetName)
//static BitmapDescriptorfromBitmap(Bitmap image)
//static BitmapDescriptorfromFile(String fileName)
//static BitmapDescriptorfromPath(String absolutePath)
//static BitmapDescriptorfromResource(int resourceId)
//
//GroundOverlayOptions image(BitmapDescriptor descriptor)
//GroundOverlayOptions anchor(float u, float v)
//GroundOverlayOptions position(LatLng location, float width, float height)
//void setTransparency(float transparency)
//
//maps_Overlay
FragmentManager fragmentManager = getSupportFragmentManager();
SupportMapFragment fragment = (SupportMapFragment)
fragemtnManager.findFragmentById(R.id.fragmentMap);

GoogleMap map = fragment.getMap();

LatLng location = new LatLng(35.681382, 139.766084);
map.moveCamera(CameraUpdateFactory.newLatLngZoom(location, 11));

BitmapDescriptor descriptor = BitmapDescriptorFactory.fromFactory.fromresource(android.R.drawable.sym_def_app_icon);

GroundOverlayOptions options = new GroundOverlayOptions();
options.image(descriptor);
options.anchor(0, 1);
options.position(location, 5000f, 4000f);
GroundOverlay overlay = map.addGroundOverlay(options);
overlay.setTransparency(0.4f);


