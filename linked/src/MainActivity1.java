//void onStart(Intent intent, int startId)
//void onStop()
//IBinder onBind(Intent intent)
//
//void startService(Intent intent)
//void stopService()

@Override
public void onReceiver(Context, Intent intetn){
  Log.d(TAG, "call onReceive()");

  intent serviceIntent = new Intent(context, CountService.class);
  context.startService(serviceIntent);

  super.onReceive(context, intent);
}

public static class CountService extends Service{
 private static final String ACTION_COUNT = "net.buildbox.pokeri.action.ACTION_COUNT";

 @Override
 public int onStartCommand(Intent intent, int flags, int startId){
   super.onStartCommand(intent, flags, startId);

   Intent clickintent = new Intent();
   clickIntent.setAction(ACTION_COUNT);
   PendingIntent pendingintent = PendingIntent.getService(this, 8, clickIntent, 0);
   RemoteViews remoteViews = new RemoteView(getPackageName(), R.layout.appwidget_main);
   remoteViews.setOnClickPendingIntent(R.id.btnUpdate.pendingIntent);

   if(ACTION_COUNT.equals(intent.getActoin())){
     countUp();
     remoteViews.setTextViewText(R.id.tvMessage, "UPDATE: " + getCount());
   }

   ComponentName widget = new ComponentName(this, WidgetProvider.class);
   AppWidgetManager widgetManager = AppWidgetManager.getInstance(this);
   widgetManager.updateAppWidget(widget, remoteViews);

   return START_STICKY;
 }

 @Override
 public IBinder onBind(Intent intent){
   return null;
 }

 private int getCount(){
   SharedPreference pref = PreferenceManager.getDefaultSharedPreferences(this);
   return pref.getInt(KEY_COUNT, 0);
 }

 private void countUp(){
   SharedPreferences.pref = PreferenceManager.getDefaultSharedPreferences(this);
   SharedPreferences.Editor editor = pref.edit();
   editor.putInt(KEY_COUNT, getCount()+1);
   editor.commit();
 }
}


