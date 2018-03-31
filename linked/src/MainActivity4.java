//long enqueue(DownloadManager.Request request)
//ParceFileDescriptor openDownloadFile(long id)
//Cursor query(DownloadManager.Query query)
//int remove(long... ids)
//
//DownloadManager.Request(Uri uri)
//DownloadManager.Request setDestinationInExternalFileDir(Context context, String dirType, String subPath)
//DownloadManager.Request setTitle(CharSequence title)
//DownloadManager.Request setDescription(CharSequence description)
//DownloadManager.Request setMimeType(String mimeType)
//DownloadManager.Request setAllowedNetworkTypes(int fiags)
//
//NETWORK_MOBILE
//NETWORK_WIFI
//
//android.permission.WRITE_EXTERNAL_STORAGE
//android.permission.INTENT

DownloadManager downloadManager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
Request req = new Request(Uri.parse("http://www.jssec.org/d1/android_securecoding.pdf"));
req.setDestinationInExternalFilesDir(getApplicationContext(), Environment, DIRECTORY_DOWNLOADS, "/android.pdf");
req.setTitle("Android");
req.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_MOBILE);
req.setMimeType("application/pdf");

long downloadId = downloadManager.enqueue(req);


