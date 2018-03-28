//android.permission.READ_SMS

private static final Uri SMS_URI = Uri.parse("content://sms/");

private SimpleCursorAdapter mAdapter = null;

@Override
protected void onCreate(Bundle savedInsatnceState){
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);

  mAdapter = new SimpleCursorAdapter(this,
    android.R.layout.simple_expandable_list_item_2,
    null,
    new String[]{"address", "body"},
    new int[] {android.R.id.text1, androidR.id.text2}, 0);
  ListView iv_book = (ListView) findViewById(R.id.lv_sms);
  lv_book.setAdapter(mAdapter);

  getSupportLoaderManager().initLoader(0, null, this);
}

