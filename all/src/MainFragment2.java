//FragmentTransaction add(int containerViewid, Fragment fragment)
//FragmentTransaction add(Fragment fragment, String tag)
//FragmentTransaction add(int containerViewId, Fragment fragment, String tag)
//FragmentTransaction attach(Fragment fragment)
//int commit()
//FragmentTransaction detach(Fragment fragment)
//FragmentTransaction hide(Fragment fragment)
//FragmentTransaction show(Fragment fragment)
//FragmentTransaction replace(int containerViewId, Fragment fragment, String tag)
//FragmentTransaction replace(int containerViewId, Fragment fragment)
//FragemntTransaction addToBackStack(String name)
//
//FragmentManager getSupportFragmentManager()
//FragmentTransaction beginTransaction()

Fragment targetFragment = new TargetFragment();
FragemntTransaction transaction = getSupportFragmentManager().beginTransaction();
transaction.add(R.id.fragment_target, targetFragment, "targetFragment");
transaction.addToBackStack(null);
transaction.commit();


