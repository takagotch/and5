//void vibrate(long milliseconds)
//void vibrate(long[] pattern, int repeat)
//
//device_Vibrate

Button btn_vibrate = (Button) findViewById(R.id.btn_vibrate);
btn_vibrate.setOnClickListener(new View.onClickListener(){
  @Override
  public void onClick(View v){
    Vibrator vibrator = (Vibrater) getSystemService(VIBRATOR_SERVICE)'
    vibrator.vibrate(1000);
  }

  Button btn_vibPattern = (Button) findViewById(R.id.btn_vibPattern);
  btn_vibPattern.setOnClickListener(new View.OnClickListener(){
    @Override
    public void onClick(View v){
      Vibrator vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
      long[] pattern = {
        100, 500,
	100, 500,
	100, 500,
	100, 500,
	100, 2000;
      vibrator.vibrate(pattern, -1);
      };
    }
  });
});

