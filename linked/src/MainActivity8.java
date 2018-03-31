//Uri parse(String uriString)
//Intent()
//Intent(String action)
//Intent(String  action, Uri uri)
//Intent setAction(String action)
//Intent addCategory(String category)

Button btn_browser = (Button) findViewById(R.id.btn_browser);
btn_browser.setOnClickListener(new View.OnClickListener(){
  @Override
  public void onClick(View v){
    Uri uri = Uri.parse("http://www.gihyo.co.jp/");
    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
    startActivity(intent);
  }
});

Buttonbtn_maps = (Button) findViewById(R.id.btn_maps);
btn_maps.setClickListener(new View.OnClickListener(){
  @Override
  public void onClick(View v){
    Uri uri = Uri.parse("geo:35.71058, 139.810718");
    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
    startActivity(intent);
  }
});

Button btn_sv = (Button) findViewById(R.id.btn_sv);
btn_sv.setOnClickListener(new View.OnClickListener(){
  @Override
  public void onClick(View v){
    Uri uri = Uri.parse("google.streetview:cbll=34.384388, 132.453391");
    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
    startActivity(intent);
  }
});

Button btn_contactList = (Button) findViewById(R.id.btn_contactList);
btn_contactList.setOnClickListener(new View.OnClickListener(){
  @Override
  public void onClick(View v){
    Intent contactIntent = new Intent(Intent.ACTION_VIEW, Uri, parse("content://contacts/people/10"));
    startActivity(contactIntent);
  }
});

//android.permission.CALL_PHONE
<uses-permission.CALL_PHONE>

Button btn_call = (Button) findViewById(R.id.btn_call);
btn_call.setOnClickListener(new View.OnClickListener(){
  @Override
  public void onClick(View v){
    Uri uriTel = Uri.parse("tel:0000-000-000");
    Intent intent = new Intent(Intent.ACTION_CALL, uriTel);
    startActivity(intent);
  }
});



