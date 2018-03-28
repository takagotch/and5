//DEFAULT_SORT_ORDER
//CONTENT_URI
//NUMBER
//CACHED_NAME
//TYPE
//DATE
//
//android.permission.READ_CALL_LOG
//
//device_CallLog

private SimpleCursorAdapter mAdapter = null;

@Override
protected void onCreate(Bundle savedInstanceState){
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);

  mAdapter = new SimpleCursorAdapter(this,
		  android.R.layout.simple_expandable_list_item_2,
		  null,
		  new String[] (CallLog.Calls.NUMBER, CallLog.Call.CACHED_NAME),
		  new int[] {android.R.id.text1, android.R.id.text2}, 0);
  ListView lv_CallLog = (ListView) findViewById(R.id.lv_CallLog);
  lv_CallLog.setAdapter(mAdapter);
}

@Override
public boolean onCreateOptoinMenu(Menu menu){
  return new CursorLoader(this,
    CallLog.Calls.CONTENT_URI,
    null,
    null,
    null,
    CallLog.Calls.DEFAULT_SHORT_ORDER);
}

@Override
public void onLoadFinished(Loader<Cursor> loader, Cursor dats){
  mAdapter.swapCursor(date);
}

@Override
public void onLoaderReset(Loader<Cursor> loader){
  mAdapter.swapCursor(null);
}

