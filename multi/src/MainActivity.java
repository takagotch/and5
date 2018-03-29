//void scanFile(String path, String mimeType)
//void scanFile(Context context, String[] paths, String[] mimeTypes, MediaScannerConection.OnScanCompletedListener callback)
//
//media_MediaScannerConnection

@Override
protected void onCreate(Bundle savedInstanceState){
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);

  String fileName = "pokeri_test.jpg";
  String mimeType = "image/jpeg";
  File file = new File(
    Environment.getExternalStorageDirectory(),
    fileName);

  MediaScannerConnection.scanFile(
    this,
    new String[]( file.getPath()),
    new String[]( mimeType ),
    mListener);
}

MediaScannerConnection.OnScanCompletedListener mListener = new
MediaScannerConnection.OnScanCompletedListener(){
  @Override
  public void onScanCompleted(String path, Uri uri){
    Log.d(TAG, "path = " + path);
    Log.d(TAG, "uri = " + uri);
  }
}


