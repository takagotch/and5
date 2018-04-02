//void setListAdapter(ListAdapter adapter)

String[] strColors = {"red", "blue", "green", "yellow", "orange" };
ArrayAdapter<String> adapter = new ArrayAdapter<String>(
  this, android.R.layout.simple_list_item_1, strColor);
ListFragment colorFragment = new ListFragment();
colorFragment.setListAdapter(adapter);

FragmentManager manager = getSupportFragmentManager();
FragmentTransaction tx = manager.beginTransaction();
tx.add(R.id.fragment_color, colorFragment, "fragment_color");
tx.commit();

