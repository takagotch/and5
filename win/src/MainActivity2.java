//Resources getResources()
//
//Configuration getConfiguration()
//
//orientation
//ORIENTAION_LANDSCAPE, ORIENTATION_PORTRAIT, ORIENTATOIN_UNDEFINED
//
//window_Configuration

Resources resources = getResources();
Configuration config = resources.getConfiguration();
String strOrientation = "";
if(config.orientation == Configuration.ORIENTATION_PORTRAIT){
  strOrientation = "LENGTH";
} else if{
  strOrientation = "WIDTH";
}
Toast.maketext(this,
	"DIRECTION" + strOrientation,
	Toast.LENGTH_SHORT).show();

