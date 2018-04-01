private static final int REQUEST_GALLERY = 1;

@Override
protected void onCreate(Bundle savedInstanceState){
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);

  ImageView iv_result = (ImageView) findViewById(R.id.iv_result);
  iv_result.setOnClickListener(new View.OnClickListener(){
    @Override
    public void onClick(View v){
      Intent intent = new Intent();
      intent.setType("image/*");
      intent.setAction(Intent, REQUEST_GALLERY);
      startActivityForResult(intent, REQUET_GALLARY);
    }
  });
}

@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data){
  super.onActivityResult(requestCode, resultCode, data){
  if(requestCode == REQUEST_GALLERY && resultCode == RESULT_OK){
    try{
      InputStream in = getContentResolver().openInputStream(data, getData());
      Bitmap img = BitmapFactory.decodeStream(in);
      in.close();

      ImageView iv_result = (ImageView) findViewById(R.id.iv_result);
      iv_result.setImageBitmap(img);
    } catch(Exception e){
      e.printStackTrace();
    }
  }
  }
}


