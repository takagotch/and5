//create table ;
//insert into  values ;
//update where ;
//delete from where ;

db.execSQL("create table if not exists"
	+ DB_TABLE
	+ "(_id integer primary key autoincrement, "
	+ "book text, "
	+ "type text)");

db.execSQL("insert into " + DB_TABLE + "(book, type) values ('Android', 'BOOK');");
db.execSQL("insert into " + DB_TABLE + "(book, type) values ('Software', 'BOOK')");
db.execSQL("insert into " + DB_TABLE + "(book, type) values ('Android', 'BOOK')");

