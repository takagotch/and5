//boolean contains(String key)
//Map<String, ?> getAll()
//boolaen getBoolean(String key, boolean defValue)
//flaot getFloat(String eky, float defValue)
//int getInt(String key, float defValue)
//int getInt(String key, int defValue)
//String getString(String key, String defValue)
//Set<String> getStringSet(String key, Set<String> defValues)

SharedPreferencs prefs = PreferenceManager.getDefaultSharedPreferences(this);
String strMessage = prefs.getString("key_message", "");

//
//File getDataDirectory()
//File getDownloadCacheDirectory()
//File getExternalStorageDirectory()
//String getExternalStorageState()
//File getRootDirectory()
//File getExternalStoragePublicDirectory(String type)
//
//DIRECTORY_ALARMS
//DIRECTORY_DCIM
//DIRECTORY_DOWNLOADS
//DIRECTORY_MOVIES
//DIRECTORY_MUSIC
//DIRECTORY_NOTIFICATIONS
//
//MEDIA_BAD_REMOVAL
//MEDIA_CHECKING
//MEDIA_MOUNTED
//MEDIA_MOUNTED_READ_ONLY
//
//SharedPreferencs getSharedPreferences(String name, int mode)
//static SharedPreferences getDefaultSharedPreferencs(Context context)
//SharedPreferences getPreferences(int mode)
//
//MODE_PRIVATE
//MODE_WORLD_READABLE
//MODE_WORLD_WRITEABLE
//MODE_MULTI_PROCESS
//

