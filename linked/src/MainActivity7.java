//void set(int type, long triggerAtTime, PendingIntent operation)
//void setRepeat(int type, long triggerAtMillis, ong intervalMillis, PendingIntent operation)
//void cancel(PendingIntent operation)
//void setWindow(int type, long windowStartMillis, long windowLengthMillis, PendingIntent operation)
//void setExact(int type, long triggerAtMillis, PendingIntent operation)
//
//ELAPSED_REALTIME
//ELAPSED_REALTIME_WAKEUP
//RTC
//RTC_WAKEUP

@Override
protected void onCreate(Bundle savedInstanceState){
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);

  Intent intent = new Intent(getApplicationContext(), AlarmReceiver.class);
  intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
  PendingIntent sender = PendingIntent.getBroadcast(thid, 0, intent, 0);

  Calendar calendar = Calendar.getInstance();
  calendar.setTimeInMillis(System.currentTimeMillis());
  calendar.add(Calendar.SECOND, 10);

  AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
  alarmManager.set(AlarmManager.RTC_WAKEUP, calendarTimeMillis(), sender);
}

@Override
public boolean onCreateOptionsMenu(Menu menu){
  getMenuInflater().inflate(R.menu.main, menu);
  return true;
}
public static class AlarmReceiver extends BroadcastReceiver {
  @Override
  public void onReciver(Context context, Intent intent){
    Toast.makeText(context, "AlarmManager NOTISE", Toast.LENGTH_SHORT).show();
  }
}


