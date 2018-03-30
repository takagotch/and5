//static MediaPlayer create(Context context, Uri uri, SurfaceHolder holder)
//static MediaPlayer create(Context context, int resid)
//static mediaPlayer create(Context context, Uri uri)
//void start()
//void stop()
//void pause()
//void seekTo(int msec)
//boolean isPlaying()
//void setOnPreparedListener(MediaPlayer.OnPreparedListener listener)
//void release()
//
//void onPrepared(MediaPlayer mp)
//
//int load(Context context, int resId, int priority)
//int load(String path, int priority)
//int load(FileDescriptor fd, long offset, long length, int priority)
//boolean unload(int soundID)
//int play(int soundID, float leftvolume, float rightVolume, int priority, int loop, float rate)
//void pause(int streamID)
//void stop(int streamID)
//void release()
//void setOnLoadCompleteListener(SoundPool.OnLoadCompleteListener listener)
//void onLoadCamplete(SoundPool soundPool, int sampleId, int status)
//media_MusicPlayer

public void onClickEvent(View v){
  mPlayer = MediaPlayer.create(this, R.raw.waltz);
  mPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener(){
    @Override
    public void onPrepared(MediaPlayer mp){
      mp.start();
    }
  });
}

@Override
protected void onPause(){
  if(mPlayer != null){
    mPlayer.stop();
    mPlayer.release();
  }
  super.onPause();
}

//media_SoundPool

@Override
protected void onResume(){
  super.onResume();

  arraySound = new ArrayList<Integer>();
  mPool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
  arraySound.add();
  arraySound.add();
  arraySound.add();
  arraySound.add();
  arraySound.add();
  mPool.setOnLoadCompletelistener(new SoundPool, int sampleId, int status){
    @Override
    public void onLoadComplete(){}
  }
}

