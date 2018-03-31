//void setSoftInputMode(int mode)
//
//SOFT_INPUT_STATE_VISIBLE
//SOFT_INPUT_STATE_HIDEN

getWindow().setSoftInputMode(WindowManager.LayoutParams.
		SOFT_INPUT_STATE_VISIBLE);


//Intent getIntent()
//String getAction()
//Bundle getExtras()
//Object get(String key)

puilbic class MainActivity extends Actiivty {
  @Override
  public void onCreate(Bundle savedInstanceState){
    if(getIntent().getAction() == Intent.ACTION_SEND){
      Uri imgUri = null;
      try{
        imgUri = Uri.parse(
		getIntent().getExtras().get(Intent.EXTRA_STREAM).toString());
      } catch(Exception e){
        e.printStackTrace();
      }

      if(imgUri != null){
        ImageView iv_uri = (ImageView) findViewById(R.id.iv_target);
	iv_uri.setImageURI(imgUri);
      }
    }
  }
}

