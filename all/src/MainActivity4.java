//ActionBar.TAb setTabListener(ActionBar.TabListener listener)
//
//void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft)
//void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft)
//void onTabUnselected(ActionBar.Tab tab, FragemntTransaction ft)

ActionBar.TabListener mTabListener = new ActionBar.TabListener(){
  @Override
  public void onTabUnselected(Tab tab, FragmentTransaction ft){
  }
  @Override
  public void onTabSelected(Tab tab, FragmentTransaction ft){
    if(tab.getPosition() == 0){
      Fragment mainFragment = new MainFragment();
      ft.replace(R.id.tab_root, mainFragment);
    } else {
      Fragment subFragment = new SubFragment();
      ft.replace(R.id.tab_root, subFragment);
    }
  }
  @Override
  public void onTabReselected(Tab tab, FragmentTransaction ft){
  }
};

//ActionBar.TAb setSelectedNavigationItem(int position)

actionBar.setSelectedNavigationItem(1);

//static ArrayAdapter<CharSequence> createFromResource(Context context, int textArrayResId, int textViewResId)
//void setListNavigationCallbacks(SpinnerAdapter adapter, ActionBar.OnNavigationListener callback)

@Override
protected void onCreate(Bundle savedInstanceState){
  super.onCreate(saveInstanceState);
  setContentView(R.layout.activity_main);

  ActionBar actionBar = getSupportActionBar();

  actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);

  SpinnerAdapter adapter = ArrayAdapter.createFromResource(
	this,
	R.array.action_list,
	android.R.layout.simple_spinner_dropdown_item);
  actionBar.setListNavationCallbacks(adapter, mOnNavigationListener);
}

//boolean onNavigationItemSelected(int itemPosition, long itemId)

ActionBar.OnNavigationListener mOnNavigationListener = new ActionBar.OnNavigationListener(){
  @Override
  public boolean onNavigationItemSelected(int itemPosition, long itemId){
    switch(itemPosition){
    case 1:
	    Toast.makeText(getApplicationCntext(), "SHOW", Toast.LENGTH_SHORT).show();
	    break;
    case 2:
	    Intent intent = new Intent(Intent.ACTION_VIEW.Uri.parse("http://www.gihyo.co.jp/"));
	    startActivity(intent);
	    break;
    case 3:
	    finish();
	    break;
    }
    return false;
  }
};

//ActionProvider getActionProvider() 
//void setShareHistoryFileName(String sharedHistroyFile)
//void setSharedIntent(Intent sharedIntent)

@Override
public boolean onCreateOptionsMenu(Menu menu){

}


