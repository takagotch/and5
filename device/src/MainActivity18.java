//Geocoder(Context context, Locale locale)
//Geocoder(Context context)
//List<Address> getFromLocation(double latitude, double longtitude, int maxResults)
//List<Address> getFromLocationName(String locationName, int maxResults, double lowerLefLatitude, double lowerLeftLongitude, double upperRightLatitude, double upperRightLongitude)
//List<Address> getFromLocationName(String locationName, int maxResult)


Geocoder geocoder = new Geocoder(this, Locale.JAPAN);
try{
  addressList = geocoder.getFormatLocation(35.689488, 139.691706, 1);

  if(!addressList.isEmpty()){
    Address addr = addressList.get(0);
    String strAddress = "", buf = "";
    for(int i = 0; (buf = addr.getAddressLine()) != null; i++){
      strAddress += buf + "\n";
    }
    Toast.makeText(this, "GET ADDRESS: " + strAddress, Toast.LENGTH_SHORT).show();
  }
} catch(IOException e){
  e.printStackTrace();
}



Geocoder geocoder = new Geocode(this, Locale.getDefault());
  List<Address> addressList;
  try{
    addressList = geocoder.getFromLocationName("addr", 1);

    Address addr = addressList.get(0);
    double lat = addr.getLatitude();
    double lng = addr.getLongitude();

    Toast.makeText(this, "LOCALE" + lat + ", " + lng, Toast.LENGTH_SHORT).show();
  } catch(IOException e){
    e.printStackTrace();
  }

