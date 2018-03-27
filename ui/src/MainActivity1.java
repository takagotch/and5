//ui_ViewPaget
//
//void setAdapter(PagerAdapter adapter)
//
//FragmentStatePagerAdapter(FragmentManager fm)
//Fragment getItem(int position)
//int getCount()
//CharSequence getPageTitle(int position)
//
//FragmentStatePagerAdapter(int position)
//

private MyFragmentPagerAdapter mPagerAdapter = null;
private viewPager mViewPager null;

@Override
protected void onCreate(Bundle savedInstanceState){
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);

  mPagerAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager());

  mViewPager = (ViewPager) findViewById(R.id.viewPager);
  mViewPager.setAdapter(mPagerAdapter);
}

@Override
public boolean onCreateOptionMenu(Menu menu){
  getMenuInflater().inflate(R.menu.main, menu);
  return true;
}

public class MyFragmentAdapter extends FragmentStatePagerAdapter {
  public MyFragmentPagerAdapter(FragmentManager fm){
    super(fm);
  }

  @Override
  public Fragment getItem(int position){
    switch(positoin){
      case 0:
	      return new FristFragment();
      case 1:
	      return new SecondFragment();
      case 2: 
	      return new ThirdFragment();
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


