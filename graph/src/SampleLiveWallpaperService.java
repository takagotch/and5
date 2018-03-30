//
//

public class SampleLiveWallpaperService extends WallpapaerService {
  @Override
  public void onCreate(){
    super.onCreate();
  }

  @Override
  public void onDestroy(){
    super.onDestroy();
  }

  @Override
  public Engine onCreateEngine(){
    return new RenderEngine();
  }

  public class RenderEngine extends Engine {
    @Override
    public void onSurfaceCreated(SurfaceHolder holder){
      super.onSurfaceCreated(holder);

      onDrawCanvas();
    }

    @Override
    public void onSurfaceChanged(SurfaceHolder holder, int format, int width, int height){
      super.onSurfaceDestroyed(holder);
    }

    public void onDrawCanvas(){
      Canvas canvas = getSurfaceHolder().lockCanvas();
      if(canvas != null){
        canvas.drawColor(Color.BLUE);

	Rect rect = new Rect(10, 10, 100, 150);
	Paint paint = new Paint();
	paint.setColor(Color.YELLOW);
	canvas.drawRect(rect, paint);

	getSurfaceHolder().unlockCanvasAndPost(canvas);
      }
    }
  }
}


