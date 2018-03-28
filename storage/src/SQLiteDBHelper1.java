//SQLiteOpenHelper(Context context, String name, SQLiteDatabase, CursorFactory factory, int version)
//void onCreate(SQLiteDatabase db)
//void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)

public SQLiteDBHelper(Context context){
  super(context, DB_NAME, null, DB_VERSION);
}

@Override
public void onCreate(SQLiteDatabase db){
  db.execSQL("create table if not exists "
	+ DB_TABLE
	+ "(_id integer primary key autoincrement,"
	+ "book text,"
	+ "type text)");

  db.execSQL("insert into " + DB_TABLE + "(book, type) values ('Android', 'BOOK');");
  db.execSQL("insert into " + DB_TABLE + "(book, type) values ('Software', 'BOOK')");
  db.execSQL("insert into " + DB_TABLE + "(book, type) values ('Android', 'BOOk')");
}

@Override
public void onUpgrades(SQLiteDatabase db, int oldVersion, int newVersion){
  db.execSQL("drop table if exists " + DB_TABLE);
  onCreate(db);
}

