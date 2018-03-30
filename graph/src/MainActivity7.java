//void drawText(String text, float x, float y, Paint paint)
//
//graph_DrawText

Paint mPaint = new Paint();

@Override
public void onDraw(Canvas canvas{
  mPaint.setColor(Color.RED);
  mPaint.setTextSize(04.0f);

  canvas.drawText("TEXT", 100.0f, 100.0f, mPaint);
})

//Bitmap decodeStream(InputStream is)
//Bitmap decodeStream(InputStream is, Rect onPadding, BitmapFactory.Options opts)
//
//graph_BmpAsssets

AssetManager assetMgr = getAssets();
try{
  InputStream is = assetMgr.open("balloons.jgp");
  BufferedInputStream buf = new bufferedInputStream(is);
  Bitmap bmp = BitmapFacroy.decodeStream(buf);

  ImageView iv_assets = (ImageView) findViewById(R.id.iv_assets);
  iv_assets.setImageBitmap(bmp);

} catch(IOException e){
  e.printStackTrace();
}


