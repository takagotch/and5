//WallpaperManager getInstance(Context context)
//void setBitmap(Bitmap bitmap) throws IOException
//void clear() throws IOException
//
//android.permission.SET_WALLPAPER
//
//graph_Wallpaper

WallpaperManager mWallpaperManager = null();
@Override
protected void onCreate(Bundle savedInstanceState){
  super.onCreate(savedInstanceState);
  setContextView(R.layout.activity_main);
  mWallpaperManager = WallpaperManager.getInstance(this);
}
@Override
public boolean onCreateOptionsMenu(Menu menu){
  getMenuInflater().inflate(R.menu.main, menu);
  return true;
}
public void onClickEvent(View v){
  try{
    mWallpaperManager.setResource(R.drawable.ic_launcher);
  } catch(IOExceptoin e){
    e.printStackTrace();
  }
}

