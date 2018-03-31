//CharSequence getTitle()
//Window getWindow()
//void setTitle(CharSequence title)

EditText et_title = (EditText) findViewById(R.id.et_title);
et_title.setText(this.getTitle());

Buttonbtn_submit = (Button) findViewById(R.id.btn_submit);
btn_submit.setOnClickListener(new View.OnClickListener(){
  @Override
  public void onClick(View v){
    EditText et_title = (EditText) findViewById(R.id.et_title);
    getWindow().setTitle(et_title.getText());
  }
});

//Window getWindow()
//void addFlags(int flags)
//void clearFlags(int flags)
//
//FLAG_FULLSCREEN

Window window = getWindow();
if(isChecked){
  window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
} else {
  window.clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
}

//boolean requestWindowFeature(int featureId)
//
//DEFAULT_FEATURES
//FEATURE_NO_TITLE
//FEATURE_CONTEXT_MENU
//FEATURE_CUSTOM_TITLE
//FEATURE_INDETERMINATE_PROGRESS
//FEATURE_LEFT_ICON
//FEATURE_RIGHT_ICON
//FEATURE_ACTION_BAR
//FEATURE_ACTION_BAR_OVERLAY
//FEATURE_ACTION_MODE_OVERLAY

super.onCreate(savedInstanceState);

requestWindowFeature(Window.FEATURE_NO_TITLE);

setContentView(R.layout.activity_main);

//PowerManager.WakeLock newWakeLock(int levelAndFlags, String tag)
//void aquire()
//void acquire(long timeout)
//void release()
//
//android.permission.WAKE_LOCK
PowerManager powerMgr = (PowerManager) getSystemService(POWER_SERVICE);

PowerManager.WakeLock wakeLock = powerMgr.newWakeLock(
	PowerManager.SCREEN_BRIGHT_WAKE_LOCK, "myTag");

wakeLock acquire();

wakeLock.release();


//FLAG_KEEP_SCREEN_ON
Window.window = getWindow();
if(isChecked){
  window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
} else{
  window.clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
}

//String getString(ContentResolver resolver, String name)
//
//SCREEN_BRIGHTENSS

String strBtigntness = Settings.System.getString(
  getContentResolver(),
  Setting.System.SCREEN_BRIGHTNESS);

TextView tv_brigtness = (TextView) findViewById(R.id.tv_brightness);
tv_brigtness.setText("LIGHT: " + strBrightness);


//WindowManager getWindowManager()
//Display getDefaultDisplay()
//void getMetrics(DisplayMetrics outMetrics)
//
//int widthPixels
//int heightPixels

TextView tv_WindowSize = (TextView) findViewById(R.id.tv_WindowSize);
DisplayMetrics dm = new DisplayMetrics();
getWindowManager().getDefualtDisplay().getMetrics(dm);
tv_WindowSize.setText(
  "WIDTH" + dm.widthPixels
  + "\n"
  + "HEIGHT" + dm.heightPixels);

