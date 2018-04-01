//PackageManager getPackageManager()
//String getPackageName()
//PackageInfo getPackageInfo(String packageName, int flags)
//versionCode
//versionName
//
//GET_ACTIVITYES, GET_DISABLED_COMPONENTS, GET_GIDS, GET_INSTRUMENTATION, GET_INNTENT_FILTERS, GET_META_DATA, GET_PERMISSIONS, GET_PROVIDERS, GET_RECEIVERS, GET_RESOLVED_FILTER, GET_SERVICES, GET_SHARED_LIBRARY_FILES, GET_SIGNATURES, GET_URI_PERMISSION_PATTERNS
//
//GET_CONFIGUREATIONS, GET_UNISTALLED_PACKAGES
//GET_DISABLED_UNITIL_USED_COMPONENTS

@Override
protected void onCreate(Bundle savedInstanceState){
  super.onCreate(savedInstanceState);

  int versionCode = 0;
  String versionName = "";

  PackageManager packageMgr = getPackageManager();
  try{
    PackageInfo packageInfo = packageMgr.getPackageInfo(getPackageName(),
	PackageManager.GET_ACTIVITIES);
    versionCode = packageInfo.versionCode;
    versionName = packageInfo.versionName;
  } catch(NameNotFoundException e){
    e.printStackTrace();
  }

  TextView tv_Version = new TextView(this);
  tv_Version.setText("versionCode = " + versionCode + "\n" +
	"versionName = " + versionName);
  setContentView(tv_Version);
}


