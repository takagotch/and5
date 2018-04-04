//void updateAppWidget(int appWidgetId, RemoteViews views)

public static class CountService extends Service {
  private static final String ACTION_COUNT = "net.buildbox.pokeri.action.ACTION_COUNT";

  @Override
  public int onStartCommand(Intent intent, int flags, int startId){
    super.onStartCommand(intent, flags, startId);

    Intent clickIntent = new Intent();
    clickIntent.setAction(ACTION_COUNT);
    PendingIntent pendingIntent = PendingIntent.getService(this, 0, clickIntent, 0);
    RemoteViews remoteViews = new RemoteViews(getPackageName(), R.layout.appwidget_main);
    remoteViews.setOnClickPendingIntent(R.id.btnUpdate, pendingIntent);

    if(ACTION_COUNT.equals(intent.getAction())){
      countUp();
      remoteViews.setTextViewText(R.id.tvMessage, "UPDATE" + getCount());
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
    SharedPreferences pref = PreferenceManager.getDefaultShared Preferences(this);
    return pref.getInt(KEY_COUNT, 0);
  }

  private void countUp(){
    ShsredPreferences pref = PreferenceManager.getDefaultShared Preference(this);
    SharedPreferences.Editor eidtor = pref.edit();
    editor.putInt(KEY_COUNT, getCount()+1);
    editor.commit();
  }
}

















