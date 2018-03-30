//WallpaperManager getInstance(Context context)
//void setBitmap(Bitmap bitmap) throws IOException
//void clear() throws IOException
//
//android.permission.SET_WALLPAPER
//
//graph_Wallpaper

WallpapaerManager mWallpapaerManager = null;
@Override
protected void onCreate(Bundle savedInstanceState){
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);
  mWallpaperManager = WallpapaerManager.getInstance(this);
}
@Override
public boolean onCreateOptions(Menu menu){
  getMenuInflater().inflate(R.menu.main, menu);
  return true;
}
public void onClickEvent(View v){
  try{
    mWallpaperManager.setResource(R.drawable.ic_launcher);
  } catch(IOException e){
    e.printStackTrace();
  }
}

