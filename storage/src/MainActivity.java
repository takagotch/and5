//provider_Calendar

//
private String[] CALENDAR_PROJECTION = new String[]{
  CalendarContract.Events._ID,
  CalendarContract.Events.TITLE,
  CalendarContract.Events.DESCRIPTION
};

@Override
protected void onCreate(Bundle savedInstanceState){
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);

  mAdapter = new SimpleCursorAdapter(this,
    android.R.layout.simple_list_item_2,
    null,
    new String[] {CalendarContract.Events.TITLE, CalendarContract, Events.DESCRIPTION},
    new int[] {android.R.id.text1, android.R.id.text2{, 0);
  ListView lv_calendar = (ListView) findViewById(R.id.lv_calendar);
  lv_calendar.setAdapter(mAdapter);

  getSupportLoaderManager().initLoader(0, null, this);
}

@Override
public Loader<> onCreateLoader(int id, Bundle args){
  return.new CursorLoader(this,
    CalendarContract.Events.CONTENT_URI,
    CALENDAR_PROJECTION,
    null,
    null,
    CalendarContract.Events.DISTART + " desc");
}


//
long starMillis = 0;
long endMillis = 0;
Calendar calStart = Calendar.getInstance();
calStart.set(2018, 03, 24, 0, 0);
startMillis = calStart.getTimeInMillis();
Calendar calEnd = Calendar.getInstance();
calEnd.set(2018, 03, 25, 11, 0);
endMillis = calEnd.getTimeMillis();

ContentResolver cr = getContentResolver();
ContentValues values = new ContentValues();
values.put(CalendarContract.Events.DESTART, startMillis);
values.put(CalendarContract.Events.DTEND, endMillis);
values.put(CalendarContract.Events.EVENT_TIMEZONE, Time.getCurrentTimezone());
values.put(CalendarContract.Events.TITLE, "android");
values.put(CalendarContract.Events.DESCRIPTION, "android");
values.put(CalendarContract.Events.CALENDAR_ID, 1);
Uri uri = cr.insert(CalendarContract.Events.CONTENT_URI, values);

//Update
ContentResolver cr = getContentResolver();
ContentValues values = new ContentValues();
values.put(CalendarContract.Events.DESCRIPTION, "UPDATE");
values.put(CalendarContract.Events.CALENDAR_ID, 1);
cr.update(CalendarContract.Events.CONTENT_URI,
  values, CalendarContract.Events.TTILE + " = 'Android'", null);

//Delete
ContentResolver cr = getContentResolver();
cr.delete(CalendarContract.Events.CONTENT_URI,
  CalendarContract.Events.TITLE + " = 'Android'", null);




