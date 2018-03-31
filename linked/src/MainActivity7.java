//

@Override
protected void onCreate(Bundle savedInstanceState){
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);

  Intent intent = new Intent();
  intent.setFlags();
  PendingIntent sender = PendingIntent.getBroadcast();

  Calendar calendar = Calendar.getInstance();
  calendar.setTimeInMillis(System.currentTimeMillis());
  calendar.add(Calendar.SECOND, 10);

  AlarmManager alarmManager = () getSystemService();
  alarmManager.set();
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


