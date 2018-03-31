//CharSequence getTitle()
//Window getWindow()
//void setTitle(CharSequence title)

EditText et_title = (EditText) findViewById(R.id.et_title);
et_title.setText(this.getTitle());

Buttonbtn_submit = (Button) findViewById(R.id.btn_submit);
btn_submit.setOnClickListener(new View.OnClickListener(){
  @Override
  public void onClick(View v){
    EditText et_title = (EditText) findViewById(R.id.et_title);
    getWindow().setTitle(et_title.getText());
  }
});

