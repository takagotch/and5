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

//NotificationCompat.Builder setContent(RemoteViews views)
//RemoteViews(String packageName, int layoutId)
//void setTextViewText(int viewId, CharSequence text)
//void setImageViewResource(int viewId, int srcId)
//void setTextViewText(int viewId, int units, float size)

public void sendCustomNotification(View v){
  NotificationCompat.Builder builder = new NotificationCompat.Builder(this);

  RemoteViews remoteView = new RemoteViews(getPackageName(), R.layout.notification_layout);
  remoteView.setImageViewResource(R.id.ivIcon, R.drawable.ic_launcher);
  remoteView.setTextViewText(R.id.tvTitle, "TITLE");
  remoteView.setTextViewText(R.id.tvMessage, "TEXT");
  builder.setContent(remoteView);

  builder.setSmallIcon(android.R.drawable.star_big_on);
  builder.setAutoCancel(true);

  NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
  notificationManager.notify(NOTIFY_SAMPLE, builder.build());
}


//NotificationCompat.Builder addAction(int icon, CharSequence title, PendingIntent intent)

public void sendButtonNotification(View v){
  NotificationCompat.Builder builder = new NotificationCompat.Builder(this);

  builder.setSmallicon(android.R.drawable.star_big_on);
  builder.setTicker("SHOW");

  builder.setContentTitle("TITLE");
  builder.setContentText("TEXT");
  builder.setContentInfo("NOTIF");

  Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.co.jp"));
  PendingIntent contentIntent1 = PendingIntent.getActivity(
	this, REQUEST_SAMPLE, intent1, PendingIntent.FLAG_UPDATE_CURRENT);
  builder.addAction(android.R.drawable.star_off, "Google", contentIntent1);
  Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gihyo.co.jp"));
  PendingIntent contentIntent2 = PendingIntent.getActivity(
	this, REQUEST_SAMPLE, intent2, PendingIntent.FLAG_UPDATE_CURRENT);
  builder.addAction(android.R.drawable.star_off, "", contentIntent2);
  Intent intent3 = new Intent(Intentt.ACTION_VIEW, Uri.parse("http;//buildbox.net/"));
  PendingIntent contentIntent3 = PendingIntent.getActivity(
	this, REQUEST_SAMPLE, intent3, PendingIntent.FLAG_UPDATE_CURRENT);
  builder.addAction(android.R.drawable.star_off, "buildbox.net", contentIntent3);

  builder.setWhen(System.currentTimeMillis());
  builder.setAutoCancel(true);

  NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
  notificationManager.notify(NOTIFY_SAMPLE, builder.build());
}

//PopupWindow(Context context)
//void setWindowLayoutMode(int widthSpec, int heightSpec)
//void setContentView(View contentView)
//void showAsDropDown(View anchor)
//void showAsDrop(View anchor, int xoff, int yoff)
//showAtLocation(View parent, int gravity, int x, int y)
//void dismiss()
private PopupWindow mPopup = null;
public void showPopupWindow(View v){
  LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SEVICE);
  View popupView = (View) inflater.inflate(R.layout.popup_layout, null);

  mPopup = new PopupWindow(this);

  mPopup.setWindowLayoutMode(
	ViewGroup.LayoutParams.WRAP_CONTENT,
	ViewGroup.LayoutParams.WRAP_CONTENT);

  mPopup.setContentView(popupView);

  Button btnPopup = (Button) findViewById(R.id.btnPopup);
  mPopup.showAsDropDown(btnPopup);
}

public void onPopup(View v){
  mPopup.dismiss();
}

//ListPopupWindow(Context context)
//void setAdapter(AdapterView adapter)
//void setOnItemClickListener(AdapterView.OnItemClickListener clickListener)
//void setAnchorView(View anchor)
//void setHorizontalOffset(int offset)
//void setVerticalOffset(int offset)
//void setAnimationStyle(int offset)
//void setAnimationStyle(int animationStyle)
//void setBackgroundDrawable(Drawable d)
//void setPromptView(View prompt)
//void setPromptPosition(int position)
//void show()

private ListPopupWindow mListPopup = null;
public void showListPopupWindow(View v){
  mListPopup = new ListPopupWindow(this);

  String[] fruits = {"", "", "", ""};
  ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
	android.R.layout.simple_list_item_1, fruits);
  mListPopup.setAdapter(adapter);

  mListPopup.setOnItemClickListener(new AdapterView.OnItemClickListener(){
    @Override
    public void onItemClicck(AdapterView<?> adapter, View v, int position, long id){
      String fruit = (String) adapter.getItemAtPosition(position);
      Toast.makeText(getApplicationContext(), fruit + "", Toast.LENGTH_SHORT).show();
      mListPopup.dismiss();
    }
  });

  Button btnPopup = (Button) findViewById(R.id.btnPopup);
  mListPopup.setAnchorView(btnPopup);

  mListPopup.show();
}

//boolean startDrag(ClipData data, View, DragShadowBuilder shadowBuilder, Object mLocalState, int flags)
//boolean onDragEvent(DragEvent event)
//void setDragListener(View, OnDragListener l)
//int getAction()
//ClipData getClipData()
//ClipDescripton getClipDescription()
//Object getLocalState()
//boolean getResult()
//float getX()
//float getY()
//onDrag(View v, DragEvent event)
//DragShadowBuilder(View v)
//void onDragShadow(Canvas canvas)
//
//ACTION_DRAG_STARTED
//ACTION_DRAG_ENDED
//ACTION_DRAG_ENTERED
//ACTION_DRAG_EXITED
//ACTION_DRAG_LOCATION
//ACTION_DROP

@Override
protected void onCreate(Bundlle savedInstancceState){
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);

  DragView iv_drag = (DragView) findViewById(R.id.iv_drag);
  iv_drag.setOnTouchListener(this);

  ImageView iv_drop = (ImageView) findViewById(R.id.iv_drop);
  iv_drop.setOnDragListener(new View.OnDragListener(){
    @Override
    public boolean onDrag(View v, DragEvent event){
      if(event.getAction() == DragEvent.ACTION_DROP){
        for(int i = 0; i < clipData.getItemCount(); i++){
	  ClipData.Item item = clipData.getItemAt(i);
	  Toast.makeText(getApplicationContext(),
		item.coerceToText(getApplicationContext()),
		Toast.LENGTH_SHORT).show();
	}
      }
      return false;
    }
  });
}

@Override
public boolean onCreateOptionsMenu(Menu menu){
  getMenuInflater().inflate(R.menu.main, menu);
  return true;
}

@Override
public boolean onTouch(View v, MotionEvent event){
  switch(event.getAction()){
  case MotionEvent.ACTION_MODE:
	  ClipData clipData = ClipData.newPlainText("label", "DROP");
	  v.startDrag(clipData, new DragShadowBuilder(v), null, 0);
	  return true;
  }
  return false;
}

//void setOnDateChangeListener(CalendarView.OnDataChangeListener listener)
//void onSelectedDayChange(
//  CalendarView view,
//  int year,
//  int month,
//  int dayOfMonth)
CalendarView calView = (CalendarView) findViewById(R.id.calendarView);
calView.setOnDataChangeListener(new OnDataChangeListener(){
  @Override
  public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth){
    Toast.makeText(
	  view.getContext(),
	    "SELECT " + year + "/" + (month + 1) + "/" + dayOfMonth + " ",
	    Toast.LENGTH_SHORT).show();
  }
});


//void setOnCheckedChangeListener (OnCheckedChange Listener listener)
//void onCheckedChange(CompoundButton buttonView, boolean isChecked)
Switch sw = (Switch) findViewById(R.id.switchState):
sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
  @Override
  public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
    if(isChecked){
      Toast.makeText(buttonView.getContext(), "On", Toast.LENGTH_SHORT).show();
    } else {
      Toast.makeText(buttonView.getContext(), "Off", Toast.LENGTH_SHORT).show();
    }
  }
});

//boolean onCreateOptionMenu(Menu menu)
//boolean onPropareOptionsMenu(Menu menu)
//MenuInflater getMenuInflater()
//void inflate(int menuRes, Menu menu)
//MenuItem add(int groupId, int itemId, int orderId, CharSequence title)
//Item setIcon(int iconRes)
//Item setIcon(Drawable icon)
//
//NONE
//FIRST
private static final int MENU_SAMPLE = Menu.FIRST;

@Override
public boolean onCreateOptionsMenu(Menu menu){
  getMenuInflater().inflate(R.menu.main, menu);
  
  MenuItem item = menu.add(Menu.NONE, MENU_SAMPLE, 600, "MENU");

  item.setIcon(android.R.drawable.ic_menu_camera);
  item.setShowAsAction(MenuItem.SHOW_ACTION_ALWAYS);

  return true;
}


//boolean onOptionItemSelected(MenuItem item)
//int getItemId()
@Override
public boolean onOptionitemSelected(MenuItem item){
  switch (item.getItem.id()){
	  case R.id.menu_item1:
		  Toast.makeText(this, "ITEM SELECT", Toast.LENGTH_SHORT).show();
		  return true;
	  case MENU_SAMPLE:
		  Toast.makeText(this, "SELECT MENU", Toast.LENGTH_SHORT).show();
		  return true;
  }

  return super.onOptionsItemSelected(item);
}


//PopupMenu(Context context, View anchor)
//MenuInflater getMenuInflater()
//Menu getMenu()
//void show()
//
//void inflate()

public void showPopupMenu(View v){
  PopupMenu popupMenu = new PopupMenu(this, v);

  popupMenu.getMenuInflater().inflate(R.menu.popup_main, popupMenu.getMenu());

  popupMenu.show();
}


//void setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener listener)
//boolean onMenuItemClick(MenuItem item)
popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener(){
  @Override
  public boolean onMenuItemClick(MenuItem item){
    switch(item.getItemId()){
    case R.id.menu_item1:
    case R.id.menu_item2:
    case R.id.menu_item3:
    case R.id.menu_item4:
    case R.id.menu_item5:
	    Toast.makeText(
		getApplicationContext(),
		item.getTitle() + " SELECT",
		Toast.LENGTH_SHORT).show();
	    return true;
    default:
	    break;
    }
    return false;
  }
});


//void registerForContextMenu(View view)
//void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuinfo menuInfo)

@Override
protected void onCreate(Bundle savedInstanceState){
  ListView lvFruits = (ListView) findViewById(R.id.lvFruits);
  registerForContextMenu(lvFruits);
}

@Override
public void onCreateContextMenu(ContextMenu menu, View v,
		ContextMenuInfo menuInfo){
  super.onCreateContextMenu(menu, v, menuInfo);

  getMenuInflater().inflate(R.menu.context_menu, menu);
}

//boolean onContextItemSelected(MenuItem item)
@Override
public boolean onContextItemSelected(MenuItem item){
  switch (item.getItemId()){
	  case R.id.menu1:
	  case R.id.menu2:
	  case R.id.menu3:
		  Toast.makeText(this, item.getTitle() + " SELECT", Toast.LENGTH_SHORT).show();
		  return true;
		  break;
  }

  return super.onContextItemSelected(item);
}

//void setOnClickListener(OnClickListener l)
//void onClick(View v)

Button btn_click = (Button) findViewById(R.id.btn_click);
btn_click.setOnClickListener(new View.OnClickListener(){
  @Override
  public void onClick(View v){
    Toast.makeText(v.getContext(), "BTNCLICK", Toast.LENGTH_SHORT).show();
  }
});


//void setOnLongClickListener(OnLongClickListener l)
//boolean onLongClick(View v)
Button btn_longClick = (Button) findViewById(R.id.btn_longClick);
btn_longClick.setOnLongClickListener(new View.OnLongClickListener(){
  public boolean onLongClick(View v){
    Toast.makeText(getApplicationContext(), "LONG EVENT", Toast.LENGTH_SHORT).show();
    return false;
  }
});


//boolean onTouchEvent(NotificationEvent event)
//boolean onTouch(View v, MotionEvent event)

@Override
public boolean onTouchEvent(MotionEvent event){
  int action = event.getAction();
  switch(action){
	  case MotionEvent.ACTION_DOWN:
		  Toast.makeText(getApplicationContext(), "TOUCH:DOWN", Toast.LENGTH_SHORT).show();
	  case MotionEvent.ACTION_UP:
		  Toast.makeText(getApplicationContext(), "TOUCH:DOWN", Toast.LENGTH_SHORT).show();
  }
  return false;
}


//void setAdapter(PagerAdapter adapter)
//FragmentStatePager Adapter(FragmentManager fm)
//Fragment getItem(int position)
//int getCount()
//CharSequence getPageTitle(int positon)
//FragmentStatePagerAdapter
private MyFragmentPagerAdapter mPagerAdapter = null;
private ViewPager mViewPager = null;

@Override
protected void onCreate(Bundle savedInstanceState){
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);

  mPagerAdapter = new MyFragmentPagerAdapter(SupportFragmentManager());

  mViewPager = (ViewPager) findViewById(R.id.viewPager);
  mViewPager.setAdapter(mPagerAdapter);
}

@Override
public boolean onCreateOptionsMenu(Menu menu){
  getMenuInflater().inflate(R.menu.main, menu);
  return true;
}

public class MyFragmentPagerAdapter extends FragmentStatePagerAdapter {
  public MyFragmentPagerAdapter(FragmentManager fm){
    super(fm);
  }

  @Override
  public Fragment getItem(int position){
    switch(positon){
	    case 0:
		    return new FristFragment();
	    case 1:
		    return new SecondFragment();
	    case 2:
		    return new ThirdFragmetn();
    }
  }

  @Override
  public int getCount(){
    return 3;
  }

  @Override
  public CharSequence getPageTitle(int position){
    return "Page: " + position;
  }
}

//ActionBarDrawerToggle(Activity activity, DrawerLayout drawerLayout, int drawerImageRes, int openDrawerContentDescRes, int closeDrawerContentDescRes)
//void onDrawerOpened(View drawerView)
//void onDrawerClosed(View drawerView)
//void onDrawerSlide(View drawerView, float slideOffset)
//void onDrawerStateChangeed(int newState)
//void setDrawerListener(DrawerListener listener)
//void openDrawer(int gravity)
//void clsoeDrawers()
//
//LEFT
//RIGHT
//START

private static final String TAG = ".MainActivity";

private ActionBarDrawerToggle mDrawerToggle = null;
private DrawerLayout mDrawerLayout = null;

@Override
protected void onCreate(Bundle savedInstanceState){
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);

  mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
  mDrawerToggle = new ActionBarDrawerToggle(this,
	mDrawerLayout, R.drawable.ic_drawer,
	R.string.drawer_open, R.string.drawer_close){
    @Override
    public void onDrawerOpened(View drawerView){
      super.onDrawerOpened(drawerView);
      Log.i(TAG, "call: onDrawerOpened()");
    }

    @Override
    public void onDrawerClosed(View drawerView){
      super.onDrawerClosed(drawerView);
      Log.i(TAG, "call: onDrawerClosed()");
    }

    @Override
    public void onDrawSlide(View drawerView, float slideOffset){
      super.onDrawerSlide(drawerView, slideOffset);
      Log.i(TAG, "call: onDrawSlide()");
    }

    @Override
    public void onDrawStateChannged(View drawerView, float slideOffset){
      super.onDrawerStateChange(newState);
      Log.i(TAG, "call: onDrawerStateChanged()");
    }
  };

  mDrawerLayout.setDrawerListener(mDrawerToggle);

  getSupportActionBar().setDisplayHomeAsUpEnabled(true);
  getSupportActionBar().setHomeButtonEnabled(true);
}

@Override
public boolean onCreateOptionsMenu(Menu menu){
  getMenuIflater().inflate(R.menu.main, menu);
  return true;
}

@Override
protected void onPostCreate(Bundle savedInstanceState){
  super.onPostCreate(savedInstanceState);
  mDrawerToggle.syncState();
}

@Override
public void onConfiguratoinChanged(Configuration newConfig){
  super.onConfigurationChanged(newConfig);
  mDrawerToggle.onConfigurationChanged(newConfig);
}

@Override
public boolean onOptionsItemSelected(MenuItem item){
  if(mDrawerToggle.onOptionItemSelected(item)){
    return true;
  }

  if(item.getItem() == R.id.action_drawer){
    mDrawerLayout.openDrawer(Gravity.LEFT);
  }

  return super.onOptionsItemSelected(item);
}





