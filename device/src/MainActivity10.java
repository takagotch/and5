//EXTRA_STATUS
//EXTRA_PLUGGED
//EXTRA_LEVEL
//EXTRA_SCALE
//EXTRA_TEMPERATURE
//
//BATTERY_STATUS_FULL
//BATTERY_STATUS_CHANGING
//BATTERY_STATUS_DISCHARGING
//BATTERY_STATUS_NOT_CHARGING
//BATTERY_STATUS_UNKNOWN
//
//BATTERY_PLUGGED_AC
//BATTERY_PLUGGED_USB
//
//device_Battery

@Override
protected void onCreate(Bundle savedInstanceState){
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);

  BatteryReceiver receiver = new BatteryReceiver();
  IntentFilter intentFilter = new IntentFilter();
  IntentFilter.addAction(Intent.ACTION_BATTERY_CHANGED);
  registerReceiver(receiver, intentFilter);
}

private classBatteryReceiver extends BroadcastReceiver{
  @Override
  public void onReceive(Context context, Intent intent){
    if(intent.getAction().equals(Intent.ACTION_BATTERY_CHANGED)){
      int status = intent.getExtras().getInt(BatteryManager.EXTRA_STATUS);
      switch(status){
        Toast.makeText(context, "FULL", Toast.LENGTH_SHORT).show();
	break;
      case BatteryManager.BATTERY_STATUS_CHARING:
	Toast.makeText(context, "UNCONNECTED", Toast.LENGTH_SHORT).show();
	break;
      case BatteryManager.BATTERY_STATUS_DISCHARGING:
	Toast.makeText(context, "ON", Toast.LENGTH_SHORT).show();
	break;
      case BatteryManager.BATTERY_STATUS_UNKNOW:
	Toast.makeText(context, "UNKNOWN", Toast.LENGTH_SHORT).show();
	break;
      }
    }
  }
}

