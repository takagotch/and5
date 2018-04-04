//ProgressDialog(Context context)
//ProgressDialog(Context context, int theme)
//void setMessage(CharSwquence message)
//void setIndeterminate(boolean indeterminate)
//void setProgressStyle(int style)
//int getMax()
//void setMax(int max)
//int getProgress()
//void setProgress(int value)
//void incrementProgressBy(int value)
//void incrementSecondaryProgressBy(int diff)
//boolean isIndeterminate()
//static ProgressDialog show(Context context, CharSequence title, CharSequence message)
//static ProgressDialog show(Context context, CharSequence title, CharSequence message, boolean indeterminate, Boolean cancelable)
//static ProgressDialog show(Context context, CharSequence title, CharSequence message, boolean indeterminate, OnCancelListener cancelListener)
//static ProgressDialog show(Context context, CharSequence title, CharSequence message message, boolean indeterminate)
//void setTitle(CharSequence title)
//void setCancelable(boolean flag)
//void show()
//STYLE_HORIZONTAL
//STYLE_SPINNER

public static class ProgressFragment extends DialogFragment {
  @Override
  public Dialog onCreateDialog(Bundle savedInstanceState){
    ProgressDialog dialog = new ProgressDialog(getActivity());
    dialog.setTitle("ON...");
    dialog.setMessage("WAITING...");
    dialog.setCancelable(true);
    dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);

    return dialog;
  }
}
public void showProgressDialog(View v){
  ProgressFragment newFragment = new ProgressFragment();
  newFragment.show(getSupportFragmentManager(), "showProgressDialog");
}

//NotificationCompat.Builder(Context context)
//NotificationCompat.Builder setWhen(long when)
//Notification build()
//void notify(int id, Notification notification)
//void cancel(int id)

public void sendNotification(View v){
  NotificationCompat.Builder builder = new NotificationCompat.Builder(this);

  builder.setSmallIcon(android.R.drawable.star_big_on);
  builder.setTicker("STATUS");

  builder.setContentTitle("NOTIFY TITLE");
  builder.setContentText("NOTIFY TXT");
  builder.setContentInfo("NOTIFY");

  Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gihyo.co.jp/"));
  PendingIntent contentIntent = PendingIntent.getActivity(
	this, REQUEST_SAMPLE, intent, PendingIntent.FLAG_UPDATE_CURRENT);
  builder.setContentIntent(contentIntent);
  builder.setWhen(System.currentTimeMillis());
  builder.setAutoCancel(true);

  builder.setSound(Uri.withAppendedPath(Audio.Media.INTERNAL_CONTENT_URI, "6"));
  
  NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
  notificationManager.notify(NOTIFY_SAMPLE, builder.build());
}


//NotificationCompat.Builder setSmallIcon(int icon, int level)
//NotificationCompat.Builder setSmallIcon(int icon)
//NotificationCompat.Builder setTicker(CharSequence tickerText, RemoteView views)
//Notification.Builder setTicker(CharSequence tickerText)



//NotificationCompat.Builder setAutoCancel(boolean autoCancel)
//NotificationCompat.Builder setContentIntent(CharSequence intent)
//NotificationCompat.Builder setContentTitle(CharSequence title)
//NotificationCompat.Builder setContentText(CharSequence text)
//NotificationCompat.Builder setContentInfo(CharSequence info)
//NotificationCompat.Builder setContentIcon(Bitmap icon)


//NotificationCompat.Builder setDefaults(int defaults)
//Notification.Builder setSound(Uri sound)
//Notification.Builder setLights(int argb, int onMs, int offMs)
//Notification.Builder setVibrate(long[] pattern)
//
//DEFAULT_ALL
//DEFAULT_SOUND
//DEFAULT_VIBRATE
//DEFAULT_LIGHTS
//
//android.permission.VIBRATE


//flags
//FLAGS_ONGOING_EVENT
//FLAG_NO_CLEAR

Notification notification = builder.build();
notification.flags += Notification.FLAG_ONGOING_EVENT;

//NotificationCompat.BigPictureStyle()
//NotificationCompat.BigPictureStyle()
//NotificationCompat.BigPictureStyle()
//NotificationCompat.BigPictureStyle()

public void sendBigPictureStyleNotification(View v){
  NotificationCOmpat.Builder builder = new Notif icationCompat.Builder(this);

  builder.setSmalIcon(android.R.drawable.star_big_on);
  builder.setContentTitle("BIG NOTF");
  builder.setContentText("NOTIF");
  builder.setWhen(System.currentTimeMillis());
  builder.setAutoCancel(true);

  NotificationCompat.BigPictureStyle bigPictureNotification =
	  new NotificationCompat.BigPictureStyle(builder);
  Bitmap bigPicture = BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher);
  bigPictureNotification.bigPicture(bigPicture);
  bigPictureNotification.setSummaryText("STYLE bigPictureStyle");

  NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
  notificationManager.norify(NOTIFY_SAMPLE, bigPictureNotification.build());
}


//NotificationCompat.BigTextStyle(NotificationCompat.Builder builder)
//NotificationCompat.BigTextStylebigText(CharSequence cs)
//NotificationCompat.BigTextStylesetBigContentTitle(CharSequence title)
//NotificationCompat.BigTextStylesetSummaryText(CharSequence cs)
public void sendBigTextStyleNotification(View v){
  NotificationCompat.Builder builder = new NotificationCompat.Builder(this);

  builder.setSmallIcon(android.R.layout.star_big_on);
  builder.setContentTitle("BIGTXT");
  builder.setContentText("NOTIF");
  builder.setWhen(System.currentTimeMillis());
  builder.setAutoCancel(true);

  NotificationCompat.BigTextStyle bigTextNotification =
	  new NotificationCompat.BigTextStyle(builder);
  bigTextNotification.bigText("STR BIG");
  bigTextNotification.setSummaryText("STYLE BigTextStyle");

  NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
  notificationManager.notify(NOTIFY_SAMPLE, bigTextNotification.build());
}

//NotificationCompat.InboxStyle (NotificationCompat.Builder builder)
//NotificationComapt.InboxStyleaddLine (CharSequence cs)
//NotificationCompat.InboxStylesetBigContextTitle(CharSequence title)
//NotificationCompat.InboxStylesetSummaryText(CharSequnce cs)

public void sendInboxStyleNotification(View v){
  NotificationCompat.Builder builder = new NotificationCompat.Builder(this);

  builder.setSmallIcon(android.R.drawable.star_big_on);
  builder.setContentTitle("BIGTXT");
  builder.setContentText("NOTIF");
  builder.setWhen(System.currenntTimeMillis());
  builder.setAutoCancel(true);

  NotificationCompat.InboxStyle inboxStyleNotification =
	  new NotificationCompat.InboxStyle(builder);
  inboxStyleNotification.addLine("1LINE");
  inboxStyleNotification.addLine("2LINE");
  inboxStyleNotification.addLine("3LINE");
  inboxStyleNotification.setSummaryText("STYLE BigTextStyle");

  NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATOIN_SERVICE);
  notificationManager.notify(NOTIFY_SAMPLE, InboxStyleNotification.build());
}

//NotificationCompat.Builder setContent()
//RemoteViews()
//void setTextViewText()
//void setImageViewResource()
//void setTextViewText()

public void sendCustomNotification(View v){
  NotificationCompat.Builder builder = new NotificationCompat.Builder(this);

  RemoteViews remoteView = new RemoteViews();
  remoteView.setImageViewResource();
  remoteView.setTextViewText();
  remoteView.setTextViewText();
  builder.setContent();

  builder.setSmallIcon();
  builder.setAutoCancel();

  NotificationManager notificationManager = () getSystemService();
  notificationManager.notify();
}


//








