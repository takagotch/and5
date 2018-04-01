//android:name android.intent.action.BOOT_COMPLETED

public static class BootReceiver extends BroadcastReceiver {
  @Override
  public void onReceive(Context context, Intent intent){
    Toast.makeText(context, "SHOW", Toast.LENGTH_LONG).show();
  }
}

