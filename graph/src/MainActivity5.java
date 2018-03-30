//boolean postRotate(foat degress)
//Bitmap createBitmap(Bitmap source, int x, int y, int width, int height, Matrix m, boolean filter)
//
//graph_BmpRotate

AssetManager assetMgr = getAssets();
try{
  InputStraem is = assetMgr.open("balloons.jpg");
  BufferedInputStream buf = new.BufferdInputStream(is);
  Bitmap bmp = Bitmap.decodeStream(buf);

  Matrix.matrix = new Matrix();
  matrix.postRotate(45,0f);

  Bitmap rorateBmp = Bitmap.createBitmap(bmp, 0, 0,
    bmp.getWidth(), bmp.getHeight(), matrix, true);

  ImageView (imageView) findViewById(R.id.iv_rotate);
  iv_rotate.setImage(rotateBmp);

  buf.close();
} catch(IOException e){
  e.printStackTrace();
}

