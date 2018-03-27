//provider_Calendar
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


ContentResolver cr = getContentResolver();
ContentValues values = new ContentValues();
values.put();
values.put();
cr.update();

ContentResolver cr = getContentResolver();
cr.delete();




