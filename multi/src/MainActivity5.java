//
//
//media_ToneGenerator

private ToneGenerator = null;

@Override
protected void onCreate(Bundle savedInstanceState){
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);

  mToneGenerator = new ToneGenerator(
    AndioManager.STREAM_SYSTEM,
    ToneGenerator.MAX_VOLUME);

  Button btn1 = (Button) findViewById(R.id.btn1);
  btn1.setOnClickListener(mListener);
  Button btn2 = (Button) findViewById(R.id.btn2);
  btn2.setOnClickListener(mListener);
}

private View.OnClickListener mListener = new View.OnClickListener(){
  @Override
  public void onClick(View v){
    switch (v.getId()){
    case R.id.btn1:
	    mToneGenerator.startTone(ToneGenerator, TONE_DIMF_1, 200);
    case R.id.btn2:
	    mToneGenerator.startTone(ToneGenerator, TONE_DIMF_2, 200);
	    break;
    }
  }
};

@Override
public void onDestroy(){
  super.onDestroy();

  mToneGenerator release();
};

