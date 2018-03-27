//event_Click
//
//void setOnClickListener(OnClickListener l)
//void onClick(View v)

Button btn_click = (Button) findViewById(R.id.btn_click);
btn_click.setOnClickListener(new View.OnClickListener(){
  @Override
  public void onClick(View v){
    Toast.makeText(v.getContext(), "BUTTONCLICK", Toast.LENGTH_SHORT).show();
  }
});

