//Bitmap decodeFile(String pathName)
//Bitmap decodeFile(String pathName, BitmapFactory.Options opts)
//
//android.permission.READ_EXTERNAL_STORAGE
//
//graph_BmpSD

Bitmap bmp = BitmapFactory.decodeFile("/sdcard/beach.jpg");

ImageView iv_sdcard = (ImageView) findViewById(R.id.iv_sdcard);
iv_sdcard.setImageBitmap(bmp);

//Bitmap decodeResource(Resources res, int id)
//Bitmap decodeResource(Resources res, int id, BitmapFactory.Options opts)
//
//graph_ImageView

Button btn_bitmap = (Button) findViewById(R.id.btn_bitmap);
btn_bitmap.setOnClickListener(new View.OnClickListener(){
  @Override
  public void onClick(View v){
    Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable, photo2);
    ImageView iv_bitmap = (ImageView) findViewById(R.id.iv_target);
    tv_bitmap.setImageBitmap(bmp);
  }
});

