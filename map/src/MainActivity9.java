//SupportMapFragment new Instance()
//
//maps_DynamicMap

FragmentManager fragmentManager = getSupportFragmentManager();
SupportMapFragment fragment = (SupportMapFragment)
fragmentManager.findFragmentByTag("GoogleMap");
if(fragment == null){
  fragment = SupportMapFragment.newInstanece();
  FragmentTransaction transaction = fragemntManager.beginTransaction();
  transaction.add(R.id.layoutGoogleMap, fragment, "GoogleMap");
  transaction.commit();
}

