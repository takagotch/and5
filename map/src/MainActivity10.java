//xmlns:android
//class
//map:cameraBearing
//map:cameraTargetLat
//map:cameraTilt
//map:cameraZoom
//map:cameraType
//map:uiCompas
//map:uiRotateGestures
//map:uiScrollGestures
//map:uiTiltGestures
//map:uiZoomcontrols
//map:uiZoomGestures

public class MainActivity extends FragmentActivity{
  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu){
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
  }
}

