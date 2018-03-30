//void surfaceCreate(SurfaceHolder holder)
//void surfaceChanged(SurfaceHolder holder, int format, int w, int h)
//void surfaceDestroyed(SurfaceHolder holder)
//
//SurfaceHolder getHolder()
//void addCallback(SurfaceHolder Callback callback)
//
//graph_SurfaceView

public class SimpleSurfaceView extends SurfaceView
	implements SurfaceHolder.Callback, Runnable{
  private SurfaceHolder mHolder = null;
  private Thread mThread = null;
  private Bitmap mimage = null;

  public SampleSurfaecView(Context context){
    super(context);

    mImage = BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher);

    mHolder = getHolder();
    mHolder.addCallback(s);
  }

  @Override
  public void run(){
    while (mThread != null){
      Canvas canvas = mHolder.lockCanvas();
      if(canvas != null){
        canvas.drawColor(Color.BLUE);

	Rect rect = new Rect(10, 10, 50, 50);
	Paint paint = new Paint();
	paint.setColor(Color.YELLOW);
	canvas.drawRect(rect, paint);
	mHolder.unlockCanvasAndPost(canvas);
      }
    }
  }

  @Override
  public void surfaceCreated(SurfaceHolder holder){
    mThread = new Thread(this);
    mThread.start();
  }

  @Override
  public void surfaceChanged(SurfaceHolder holder, int format, int width, int height){
  }

  @Override
  public void surfaceDestroy(SurfaceHolder holder){
    mThread = null;
  }
}

