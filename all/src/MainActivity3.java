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

}


