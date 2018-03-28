//static Camera open()
//void release()
//void setParameters(Camera, Parameters params)
//void startPreview()
//Camera.Parameters getParameters()
//
//void setPreviewSize(int width, int height)
//
//android.permission.CAMERA
//
//device_Camera

private class CameraPreview extends SurfaceView implements SurfaceHolder.
  Callback{
    private SurfaceHolder mHolder = null;
    private Size mPreviewSize = null;

    public CameraPreview(Context context){
      super(context);

      mHolder = getHolder();
      mHolder.addCallback(this);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder){
      mCamera = Camera.open();
      try{
        mCamera.setPreviewDisplay(mHolder);
      } catch(IOException e){
        e.printStackTrace();
      }

      Camera.Parameters param = mCamera.getParameters();
      List<Size> supportSize = params.getSupportedPreviewSize();
      mPreviewSize = supportsSize.get(0);
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height){
      Camera.Parameters params = mCamera.getParameters();
      params.setPreviewSize(mPreviewSize.width, mPreviewSize.height);
      mCamera.setParameters(params);

      mCamera.startPreview();
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder){
      if(mCamera != null){
        mCamera.stopPreview();
	mCamera.release();
	mCamera = null;
      }
    }
  }

