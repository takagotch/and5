//int getStreamVolume(int streamType)
//void setStreamVolume(int streamType, int index, int flags)
//
//FLAG_SHOW_UI

AudioManager audioMgr = (AudioManager) getSystemService(AUDIO_SERVICE);
int ringVolume = audioMgr.getStreamVolume(AudioManager.STREAM_RING);
TextView tv_volume = (TextView) findViewById(R.id.tv_volume);
tv_volume.setText(String.valueOf(ringVolume));

Buttonbtn_minus = (Button) findViewById(R.id.btn_minus);
btn_minus.setOnClickListener(new View.OnClickListener(){
  @Override
  public void onClick(View v){
    AudioManager audioMgr = (AudioManager) getSystemService(AUDIO_SERVICE);
    TextView tv_volume = (TextView) findViewById(R.id.tv_volume);

    int ringVolume = audioMgr.getStreamVolume(AudioManager.STREAM_RING);

    audioMgr.setStreamVolume(AudioManager.STREAM_RING, --ringVolume, AudioManager.FLAG_SHOW_UI);
    tv_volume.setText(String.valuesOf(ringVolume));
  }
});

Button btn_plus = (Button) findViewById(R.id.btn_plus);
btn_plus.setOnClickListener(new View.OnClickListener(){
  @Override
  public void onClick(View v){
    AudioManager audioMgr = (AudioManager) getSystemService(AUDIO_SERVICE);
    TextView tv_volume = (TextView) findViewById(R.id.tv_volume);

    int ringVolume = audioMgr.getStreamVolume(AudioManager.STREAM_RING);

    audioMgr.setStreamVolume(AudioManager.STREAM_RING, ++ringVolume, AudioManager.FLAG_SHOW_UI);
    tv_volume.setText(String.valueOf(ringVolume));
  }
});

