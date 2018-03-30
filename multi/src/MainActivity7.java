//void setVolumeControlStream(int streamType)
//
//media_VolumeControl

protected void onCreate(Bundle savedInstanceState){
  super.onCreate(savedInstanceState);
  setControlView(R.layout.activity_main);

  setVolumeControlStream(AudioManager.STREAM_ALARM);
}

