//InputStream open(String fileName)
//InputStream open(String fileName, int accessMode)
//
//ACCESS_UNKOWN
//ACCESS_RANDOM
//ACCESS_STREAMING
//ACCESS_BUFFER
//
//graph_BmpAssets

AssetManager assetMgr = getAssets();
try{
  InputStream is = assetMgr.open("balloons.jpg");
  BufferdInputStream buf = new BufferdInputStream(is);
  Bitmap bmp = BitmapFactory.decodeStream(buf);
} catch(){
}

//AssetManager getAssets()

@Override
public void onCreate(Bundle savedInstanceState){
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);

  AssetManager assetMgr = getAssets();
}

//storage_Preference

SharedPreferences.Editor editor =
PreferenceManager.getDefaultSharedPreferences(this).edit();
eidtor.putString("key_message", strMessage);
editor.commit();

//SharedPreferences.Editor edit()
//SharedPreferences.Editor putBoolean(String key, boolean values)
//SharedPreferences.Editor putFloat(String key, int values)
//SharedPreferences.Editor putLong(String key, long values)
//SharedPreferences.Editor putString(String key, String values)
//SharedPreferences.Editor remove(String key)
//SharedPreferences.Editor clear()
//boolean commit()
//void apply()
//SharedPreferences.Editor putStringSet(String key, Set<String> values)

