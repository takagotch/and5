//void setVideoSource(int video_source)
//void setOutputFormat(int output_format)
//void setVideoEncorder(int video_encoder)
//void setOutputFile(String path)
//void prepare()
//void start()
//void stop()
//void reset()
//void release()
//
//OFFAUTO
//CAMERA
//OFFAUTO
//MPEG_4
//THREE_GPP
//RAW_AMR
//AMR_NB
//AMR_WB
//AAC_ADTS
//
//media_VideoRecorder

public class MainActivity extends Activity {
  MediaRecorder mRecorder = null;

  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(new PreviewView(this));

    mRecorder = new MediaRecorder();

    mRecorder.setVideoSource(MediaRecorder.VideoSource.DEFAULT);

    mRecorder.setOutputFormat();

    mRecorder.setVieo();

    String path = Environment.getExternalStorageDirectory() + "";
    mRecorder.setOutputFile();

    mRecorder.setVideoFrameRate();
    mRecorder.setVideoSize();
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu){
  }

  @Override
  public void onResume(){
  };

  @Override
  public void onPause(){
  };

  CopoundButton.OnCheckChangeListener mListener = new CompondButton.OnCheckedChangeListener(){
  };

  private class PreviewView extends SurfaceView {
  
  }
}

