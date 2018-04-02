/*
<application
  android:allowBackup="true"
  android:icon=""
  android:label=""
  android:theme="" >

  <activity
    android:uiOptions="splitActionBarWhenNarrow">
*/

//ActionBar getSupportActionBar()

ActionBar actionBar = getSupportActionBar();


//void show()
//void hide()
//boolean isShowing()

ActionBar actionBar = getSupportActionBar();
if(actionBar.isShowing()){
  actionBar.hide();
} else {
  action.show();
}

//void setDisplayHomeAsUpEnabled(boolean showHomeAsUp)
//void setHomeButtonEnabled(boolean enabled)
//android.R.id.home

@Override
protected void onCreate(Bundle savedInstanceState){
  ActionBar actionBar = getSupportActionBar();
  actionBar.setDisplayHomeAsUpEnabled(true);
}

@Override
public boolean onOptionsItemSelected(MenuItem item){
  switch(item.getItemId()){
	  case android.R.id.home:
		  Toast.makeText(this, "SELECT", Toast.LENGTH_SHORT).show();
		  break;
	  default:
		  break;
  }
  return super.onOptionsItemSelected(item);
}

//void setShowAsAction(MenuItem item, int actionEnum)
//SHOW_AS_ACTION_ALWAYS
//SHOW_AS_ACTION_IF_ROOM
//SHOW_AS_ACTION_NAVER

@Override
public boolean onCreateOptionMenu(Menu menu){
  getMenuInflater().inflate(R.menu.main, menu);

  MenuItem item = menu.add(Menu.NONE, MENU_SAMPLE, 200, "MENU");
  MenuItemCompat.set(ShowAsAction(item, MenuItemCompat.SHOW_AS_ACTION_IF_ROOM));

  return true;
}

//int getNavigationMode()
//void setNavigationMode(int mode)
//
//NAVIGATION_MODE_STANDARD
//NAVIGATION_MODE_LIST
//NAVIGATION_MODE_TABS

ActionBar actionBar = getSupportActionBar();

actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);

//ActionBar.Tab newTab()
//void addTab(ActionBar.Tab tab)
//
//ActionBar.Tab setText(int resId)
//ActionBar.Tab setText(CharSequence text)

ActionBar actionBar = getSupportActionBar();

actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

actionBar.addTab(actionBar.newTab().setText("TAB1")
		.setTabListener(mTabListener));
actionBar.addTab(actionBar.newTab().setText("TAB2")
		.setTabListener(mTabListener));



