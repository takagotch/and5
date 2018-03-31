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

