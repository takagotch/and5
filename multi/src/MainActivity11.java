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

    mRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);

    mRecorder.setVieo(MediaRecorder.VideoEncorder.MPEG_4_SP);

    String path = Environment.getExternalStorageDirectory() + "/video_record.3gp";
    mRecorder.setOutputFile(path);

    mRecorder.setVideoFrameRate(30);
    mRecorder.setVideoSize(640, 400);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu){
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
  }

  @Override
  public void onResume(){
    super.onResume();
  };

  @Override
  public void onPause(){
    super.onResume();
  };

  CopoundButton.OnCheckChangeListener mListener = new CompondButton.OnCheckedChangeListener(){
    @Override
    public void onCheckChanged(CompoundButton buttonView, boolean isChecked){
      if(isChecked){
        try{
	  mRecorder.prepare();
	} catch(IllegalStateException e){
	  e.printStackTrace();
	} catch(IOException e){
	  e.printStackTrace();
	}

	mRecorder.start();
      } else {
        if(Recorder != null){
	  mRecorder.stop();
	  mRecorder.reset();
	}
      }
    }
  };

  private class PreviewView extends SurfaceView
		  implements SurfaceHolder.Callback{
    private SurfaceHolder mHolder = null;
    public PreviewView(Context context){
      super(context);

      mHolder = getHolder();
      mHolder.addCallback(this);
    }

    @Override
    public void surfaceCreate(SurfaceHolder holder){
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height){
      if(mRecorder != null){
        mRecorder.setPreviewDisplay(mHolder.getSurface());

	try{
	  mRecorder.prepare();
	} catch(IllegalStateException e){
	  e.printStackTrace();
	} catch(){
	  e.printStackTrace();
	}

	mRecorder.start();
      }
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder){
      mRecorder.stop();
      mRecorder.reset();
      mRecorder.release();
      mRecorder = null;
    }
  }
}

