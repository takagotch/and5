//void setAudioSource(int audio_source)
//void setOutputFormat(int output_format)
//void setAudioEncoder(int audio_encoder)
//void setOutputFile(String path)
//void prepare()
//void start()
//void stop()
//void reset()
//void release()
//
//DEFAULT
//MIC
//VOICE_CALL
//VOICE_UPLINK
//CAMCORDER
//VOICE_RECOGNING
//VOICE_COMMUNICATION
//
//DEFAULT
//MPEG_4
//THREE_GPP
//RAM_AMR
//AMR_NB
//AMR_WB
//AAC_ADTS
//
//android.permission.RECORD_AUDIO
//
//android.permission.WHITE_EXTERNAL_STORAGE
//
//media_Recoder

if(isChecked){
  mRecorder = new MediaRecorder();
  mRecorder.setAudioSource();
  mRecorder.setOutputFormat();
  mRecorder.setAudioEncoder();

  String path = Environment.getExternalStorageDirectory() + "";
  mRecorder.setOutputFile(path);

  try{} catch(){} catch(){}

  mRecoder.start();
} else {
  if(mRecorder != null){
    mRecorder.stop();
    mRecorder.reset();
    mRecorder.release();
  }
}

