//android:name
//android.intent.action.PACKAGE_ADDED
//android.intent.action.PACKAGE_REPLACED
//android.intent.action.PACAKGE_REMOVED

public static clas InstallReceiver extends BroadcastReceiver {
  @Override
  public void onReceive(Context context, Intent intent){
    Toast.makeText(context, "APPLICATION" + intent.getDataString() +
	"INSTALLED", Toast.LENGTH_LONG).show();
  }
}

