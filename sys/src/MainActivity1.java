//List<ApplicationInfo> getInstalledApplications(int flags)
//packageName
//
//GET_META_DATA

ArrayList<String> appList = new ArrayList<String>();
PackageManager packageMgr = getPackageManager();
List<ApplicationInfo> applicationInfo = packageMgr.getInstalledApplications(PackageManager.GET_META_DATA);
for(ApplicationInfo info : applicationInfo){
  appList.add(packageMgr.getApplicationLabel(info).toString());
}

ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
	android.R.layuot.simple.list_item_1, appList);
ListView listView = (ListView) findViewById(R.id.listView);
listView.setAdapter(adapter);


