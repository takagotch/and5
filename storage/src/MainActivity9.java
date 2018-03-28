//String[] list(String path) throws IOException

AssetManager assetMgr = getAssets();
try{
  String[] fileList = assetMgr.list("data");
  TextView tv_list1 = (TextView) findById(R.id.tv_fileList1);
  showList(tv_list1, fileList);

  fileList = assetMgr.list("data/gif");
  TextView tv_list2 = (TextView) findViewById(R.id.tv_fileList2);
  showList(tv_list2, fileList);
} catch(IOException e){
  e.printStackTrace();
}

