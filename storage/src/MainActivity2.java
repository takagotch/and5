//provider_Bookmark
//
//BOOKMARK_URI
//
//_ID
//BOOKMARK
//CREATED
//DATE
//FAVICON
//TITLE
//URL
//VISITS
//
//com.android.browser.permission.READ_HISTORY_BOOKMARKS
//com.android.browser.permission.WRITE_HISTORY_BOOKMARKS
//
//
//
//Uri insert(Uri uri, ContentValues values)
//Uri update(Uri uri, ContentValues values, String where, String[] selectionArgs)
//int delete(Uri uri, String where, String[] selectionArgs)
//void put(String key, String value)
//
//ContentResolver getContentResolver()
//
//Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder)
//
//boolean moveToFirst()
//boolean moveToNext()
//int getString(int columnIndex)
//int getColumnIndex(String columnName)
//

private String[] BOOKMARK_PROJECTION = new String[]{
  BookmarkColumn._ID,
  BookmarkColumn.TITLE,
  BookmarkColumn.URL
};

@Override
protected void onCreate(Bundle savedInstanceState){
  super.onCreate(savedInstatnceState);
  setContentView(R.layout.activity_main);

  ContentResolver resolver = getCotentResolver();
  Cursor cursor = resolver.query(Browser.BOOKMARKS_URI, BOOKMARK_PROJECTION, null, null, null);

  SimpleCursorAdapter adapter = new SimpleCursorAdapter(this, android.R.layout.simple_list_2,
    cursor,
    new String[] {BookmarkColumns.TITLES, BookmarkColumns.URL},
    new int[] {android.R.id.text1, android.R.id.text2}, 0);

  ListView lv_bookmark = (ListView) findViewById(R.id.lv_bookmark);
  lv_bookmark.setAdapter(adapter);
}


ContentValues values = new ContentValues();
values.put(Browser.BookmarkColumns.BOOKMARK, "1");
values.put(Browser.BookmarkColumns.TITLE, title);
values.put(Browser.BookmarkColumns.URL, url);
getContentResolver().insert(Browser.BOOKMARKS_URI, values);

ContentValues values = new ContentValues();
values.put(Browser.BookmarkColumns.BOOKMARK, "1");
values.put(Browser.BookmarkColumns.TITLE, title);
values.put(Browser.BookmarkColumns.URL, url);
getContentResolver().update(
  Browser.BOOKMARS_URI,
  values,
  Browser.BookmarkColumns.TITLE + " = '" + title + "'", null);

getContentResolver().delete(
  Browser.BOOKMARKS_URI,
  Browser.BookmarkColumns.TITLE + " = '" + title + "'", null);


