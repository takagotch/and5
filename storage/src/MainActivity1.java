//provider_Contacts

private String[] CONTACTS_PROJECTION = new String[]{
  ContactsContract.CommonDataKinds.Phone._ID,
  ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME,
  ContactsContract.CommonDataKinds.Phone.NUMBER
};

@Override
protected void onCreate(Bundle savedInstanceState){
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);

  ContentResolver resolver = getContentResolver();
  Cursor cursor = resolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
	CONTACTS_PROJECTION, null, null);

  SimpleCursorAdapter adapter = new SimpleCursorAdapter(this,
    android.R.layout.simple_list_item_2,
    cursor,
    new String[] {ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME,
      ContactsContract.ComonDataKinds.Phone.NUMBER},
      new int[] {android.R.id.text1, android.R.id.text2}, 0);

  ListView lv_contracts = (ListView) findViewById(R.id.lv_contacts);
  lv_contacts.setAdapter(adapter);
}

