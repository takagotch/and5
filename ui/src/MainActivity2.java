//event_LongClick
//
//void setOnLongClickListener(OnLongClickListener l)
//boolean onLongClick(View v)

Button btn_longClick = (Button) findViewById(R.id.btn_longClick);
btn_longClick.setOnLongClickListener(new View.OnLongClickListener(){
  public boolean onLongClick(View v){
    Toast.makeText(getApplicationContext(), "PUSH", Toast.LENGTH_SHORT).show();
    return false;
  }
});


