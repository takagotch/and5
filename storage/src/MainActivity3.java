//storage_SQLite
//
//LoaderManager getSupportLoaderManager(int id, Bundle args, LoaderCallbacks<D> callback)
//
//Loader<> intLoader()
//Loader<> restartLoader()
//
//Loader<> onCreateLoader()
//void onLoaderFinished()
//void onLoaderReset()
//
//CursorLoader()
//

public class MainActivity extends FragmentActivity
	implements LoaderManager.LoaderCallbacks<Cursor>{
  private SimpleCursorAdapter mAdapter = null;

  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mAdapter = new SimpleCursorAdapter(this,
      android.R.layout.simple_expandable_list_item_2,
      null,
      new String[] ("book", "type"),
      new int[] {android.R.id.text, android.R.id.text2}, 0);
    ListView lv_book = (ListView) findViewById(R.id.lv_book);
    lv_book.setAdapter(mAdapter);

    getSupportLoaderManager().initLoader(0, null, this);
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item){
    SQLiteDBHelper dbHelper = SQLiteDBHelper.getInstance(this);
    SQLLiteDatabase db = dbHelper.getWritableDatabase();
    ContentValues values = new ContentValues();
    switch(item.getItemId()){
	    case R.id.action_insert:
		    values.put("book", "Android");
		    values.put("type", "test");
		    db.insert(SQLiteDBHelper.DB_TABLE, null, values);

		    getSupportLoaderManager().restartLoader(0, null, this);
		    break;
	    case R.id.action_update:
		    values.put("book", "Android");
		    db.update(SQLiteDBHelper.DB_TABLE, values, "book= 'Android'", null);
		    getSuportLoaderManager().restartLoader(0, null, this);
		    break;
	    case R.id.action_delete:
		    db.delete(SQLiteDBHelper.DB_TABLE, "book like 'Android%'", null);
		    getSupportLoaderManager().restartLoader(0, null, this);
		    break;
    }
    return super.onOptionsItemSelected(item);
  }

  @Override
  public Loader<Cursor> onCreateLoader(int id, Bundle args){
    return new DBCursorLoader(this);
  }

  @Override
  public void onLoadFinished(Loader<Cursor> loader, Cursor data){
    mAdapter.swapCursor(data);
  }

  @Override
  public void onLoaderReset(Loader<Cursor> loader){
    mAdapter.swapCursor(null);
  }
}


