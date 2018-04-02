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
  getMenuInflater().inflate();
}

