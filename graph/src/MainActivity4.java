//Bitmap createScaledBitmap(Bitmap src, int dstWidth, int dstHeight, boolean filter)
//
//graph_ScaleBmp

Bitmap scaleBmp = Bitmap.createScaledBitmap(bmp, bmp.getWidth()*2, bmp, getHeight()*2, true);

ImageView iv_scale = (ImageView) findViewById(R.id.iv_scale);
iv_scale.setImageBitmap(scaleBmp);

//int getWidth()
//int getHeight()
//
//graph_BitmapWidth()

Bitmap bitmap = BitmapFactory.decodeResource();
int width = bitmap.getWidth();
int height = bitmap.getHeight();

TextView tvWidth = (TextView) findViewById(R.id.tvWidth);
tvWidth.setText("WIDTH: " + width);
textView tvHeight = (TextView) findViewById(R.id.tvHeight);
tvHeight.setText("HEIGHT" + height);

