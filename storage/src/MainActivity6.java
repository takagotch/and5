//storage_SQLite
//
//SQLiteDatabase getReadableDatabase()
//SQLiteDatabase getWritableDatabase()
//
//void execSQL(String sql) throws SQLException
//void beginTransaction()
//void setTransactionSuccessful()
//void endTransaction()
//long insert(String table, String nullColumnHack, ContentValues values)
//int update(String table, ContentValues values, String whereClause, String[] whereArgs)
//int delete(String table, String whereClause, String[] whereArgs)
//Cursor query(String table, String[] columns, String selection, String[] selectoinArgs, String groupBy, String having, String orderBy, String limit)

SQLiteDBHelper dbHelper = SQLiteDBHelper.getInstance(this);
SQLiteDatabase db = dbHelper.getWriteableDatabase();
ContentValues values = new ContentValues();

values.put("book", "Android");
values.put("type", "test");
db.insert(SQLiteDBHelper.DB_TABLE, null, values);

getSupportLoaderManager().restartLoader(0, null, this);

SQLiteDBHelper dbHelper = SQLiteDBHelper.getInstance(this);
SQLiteDatabase db = dbHelper.getWriteableDatabase();
ContentValues values = new ContentValues();

values.put("book", "Android");
db.update(SQLiteDBHelper.DB_TABLE, values, "book = 'Android'", null);

getSupportLoaderManager().restartLoader(0, null, this);


mDb.beginTransaction();
try{
  mDb.execSQL{
    "insert into " + SQLiteDBHelper.DB_TABLE
    + " (book, type) values ('Press' 'PRESS');"};
  mDb.setTransactionSuccessful();
} finally {
  mDb.endTransaction();
}


SQLiteDBHelper dbHelper = SQLiteDBHelper.getInstance(this);
SQLiteDatabase db = dbHelper.getWritableDatabase();
ContentValues values = new ContentValues();

db.delete(SQLiteDBHelper.DB_TABLE, "book'Android%', null");




