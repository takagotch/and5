//ACTION_HEADET_PLUG
//
//device_Plug

BroadcastReceiver handsetPlug = new BroadcastReceiver(){
  @Override
  public void onreceiver(Context context, Intent intent){
    switch(intent.getIntExtra("state", 0)){
      case 0:
	      Toast.makeText(context, "UNCONNECTED", Toast.LENGTH_SHORT).show();
	      break;
      case 1:
	      Toast.makeText(context, "CONNECTED", Toast.LENGTH_SHORT).show();
	      break;
    }
  }
};

registerReciver(handsetPlug, new IntentFilter(Intent.ACTION_HEADSET_PLUG));


