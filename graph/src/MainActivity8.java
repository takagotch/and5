//void drawArc(Rect oval, float startAngle, float sweepAngle, Boolean useCenter, Paint paint)

Paint mPaint = new Paint();
RectF mRectf = new RectF(100.0f, 100.0f, 600.0f, 600.0f);

@Override
public mRectf = new RectF(Canvas canvas){
  mPaint.setColor(Color.RED);

  canvas.drawArc(mRectf, 20.0f, 80.0f, true, mPaint);
}

//void drawRect(RectF rect, Paint paint)
Paint mPaint = new Paint();

Rect mRect = new Rect(30, 30, 130, 80);

@Override
public void onDraw(Canvas canvase){
  mPaint.setColor(Color.RED);

  canvas.drawRect(mRect, mPaint);
}

//void drawOval(RectF oval, Paint paint)

Paint mPaint = new Paint();
RectF mRecf = new RectF(30.0f, 30.0f, 30.0f, 60.0f, 80.0f);
@Override
public void onDraw(Canvas canvas){
  mPaint.setColor(Color.RED);

  canvas.drawOval(mRectf, mPaint);
}

//void drawPoint(float x, float y, Paint paint)
//void drawPoints(float[] pts, Paint paint)

@Override
public void onDraw(Canvas canvas){
  mPaint.setColor(Color.RED);
  mPaint.setStrokeWidth(16.0f);

  canvas.drawPoint(10.0f, 10.0f, mPaint);

  mPaint.setColor(Color.BLUE);
  float[] points = {
    10.0f, 30.0f,
    160.0f, 120.0f,
    200.0f, 80.0f,
    260.0f, 60.0f
  };
  canvas.drawPoints(points, mPaint);
}

//void drawLine(float startX, float startY, float stopX, float stopY, Paint paint)
//void drawLines(float[] pts, Paint paint)

@Override
public void onDraw(Canvas canvas){
  mPaint.setColor(Color.RED);
  mPaint.setStrokeWidth(16.0f);

  canvas.drawLine(10.0f, 10.0f, 250.0f, 10.0f, mPaint);

  mPaint.setColor(Color.BLUE);
  float[] points = {
    10.0f, 30.0f,
    160.0f, 120.0f,
    160.0f, 120.0f,
    200.0f, 60.0f
  };
  canvas.drawLines(points, mPoint);
}

//void onDraw(Canvas canvas)
public class MainActivity extends Activity{
  @Override
  public void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(new GraphView(this));
  }

  public class GraphView extends View {
    public GraphView(Context context){
      super(context);
    }

    @Override
    pbulic void onDraw(Canvas canvas){
    }
  }
}

//voidsetImageURI(Uri uri)
if(getintent().getAction() == Intent.ACTION_SEND){
  Uri imgUri = null;
  try{
    imgUri = Uri.parse(
	getIntent().getExtras().get(Intent.eXTRA_STREAM).toString());
  } catch(Exception e){
    e.printStackTrace();
  }

  if(imgUri != null){
    ImageView iv_uri = (ImageView) findViewById(R.id.iv_target);
    iv_uri.setImageURI(imgUri);
  }
}

//void setImageDrawable(Drawable drawable)
Button btn_drawable = (Button) findViewById(R.id.btn_drawable);
btn_drawable.setOnClickListener(new View.OnClickListener(){
  @Override
  public void onClick(View v){
    BitmapDrawable drawable = (BitmapDrawable) getResources().getDrawable(R.drawable.photo3);
    drawable.setAlpha(50);
    ImageView iv_drawable = (ImageView) findViewById(R.id.iv_target);
    iv_drawable.setImageDrawable(drawable);
  }
});

//void setImageResource(int resId)
//void setImageLevel(int level)
Button btn_resource = (Button) findViewById(R.id.btn_resource);
btn_resource.setOnClickListener(new View.OnClickListener(){
  @Override
  public void onClick(View v){
    ImageView iv_resource = (ImageView) findViewById(R.id.iv_target);
    iv_resourece.setImageResource(R.drawable.photo1);
  }
});



