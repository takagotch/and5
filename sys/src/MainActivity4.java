//CountDownTimer(long millisInFuture, long countDownInterval)
//void onTick(long millisUntilFinished)
//void onFinish()
//synchronized final CountDownTimer start()
//final void cancel()

private CountDonwTimer mCountDownTimer = null;

@Override
protected void onCreated(Bundle savedInstanceState){
  super.onCreate(savedInstanceState){
  setContentView(R.layout.activity_main);

  mCountDownTimer = new CountDownTimer(10000, 200){
    @Override
    public void onTick(long millisUntilFinished){
      TextView tv_tick = (TextView) findViewById(R.id.tv_tick);
      tv_tick.setText("LAST, " + (millisUntilFinished/1000) + "micro");
    }

    @Override
    public void onFinish(){
      TextView tv_tick = (TextView) findViewById(R.id.tv_tick);
      tv_tick.setText("COUNT END ");
    }
  };

  ToggleButton tbtn_CountDown = (ToggleButton) findViewById(R.id.tbtn_CountDown);
  tbtn_CountDown.setOnCheckedChageListener(new CompountButton.OnCheckedChangedListener(){
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
      if(isChecked){
        mCountDownTimer.start();
      } else {
        mCountDownTimer.cancel);
      }
    }
  });
  }
}

