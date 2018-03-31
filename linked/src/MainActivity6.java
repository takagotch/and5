//static boolean canClearHistory(ContentResolver cr)
//static void clearHistroy(ContentResolver cr)
//static void deleteFromHistroy(ContentResolver cr, String url())
//static void deleteHistroyTimeFrame(ContentResolver cr, long begin, long end)
//static Cursor getAllVisitedUrls(ContentResolver cr)
//
//com.android.browser.permission.READ_HISTORY_BOOKMARKS
//com.android.browser.permission.WRITE_HISTORY_BOOKMARKS

Browser.clearHistory(getContentResolver());

//static void sendString(Context context, String string)

public voidonClickEvent(View v){
  Browser.sendString(this, "SEND");
}

//static Cursor getAllBookmarks(ContentResolver cr)
//static void saveBookmark(Context c, String title, String url)
//
//com.android.browser.permission.READ_HISTORY_BOOKMARKS
//com.android.browser.permission.WRITE_HISTROY_BOOKMARKS

Browser.saveBookmark(this, "Author", "http://buildbox.net/");


