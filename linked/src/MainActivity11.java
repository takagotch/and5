//Intent(Context packageContext, Class<?> cls)
//void startActivity(Intent intent)
//void startActivityForResult(Input intent, int requestCode)
//void onActivityResult(int requestCode, int resultCode, Intent data);
//void setResult(int resultCode);
//void setResult(int resultCode, Intent data)

Button btn_activity = (Button) findViewById(R.id.btn_activity);
btn_activity.setOnClickListener(new View.OnClickListener(){
  @Override
  public void onClick(View v){
    Intent intent = new Intent(getApplicationContext(), SubActivity.class);
    startActivity(intent);
  }
});


Butotn btn_return = (Button) findViewById(R.id.btn_return);
btn_return.setOnClickListener(new View.OnClickListener(){
  @Override
  public void onClick(View v){
    Intent intent = new Input(getApplicationContext(), ReturnActivity.class);
    startActivityForResult(intent, CODE_SUB);
  }
});


@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data){
  if(requestCode == CODE_SUB){
    Toast.makeText(this, "RETURN: " + resultCode, Toast.LENGTH_SHORT).show();
  } else if(requestCode == CODE_INTENT){
    Toast.makeText(
	this,
	"RETURN: " + data.getStringExtra("return_text"),
	Toast.LENGTH_SHORT).show();
  }
  super.onActivityResult(requestCode, resultCode, data);
}



setResult(15);



Intent retIntent = new Intent();
retIntent.putExtra("return_text", "RETURN TXT");

setResult(RESULT_OK, retIntent);


