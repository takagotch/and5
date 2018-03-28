//void takePicture(Camera.ShutterCallback shutter, Camera.PictureCallback raw, Camera.PictureCallback jpeg)
//void takePicture(Camera.ShutterCallback shutter, Camera.PictureCallback raw, Camera.PictureCallback postView, Camera, PictureCallback jpeg)
//
//void onShutter()
//void onPictureTaken(byte[] data, Camera camera)
//
//device_Camera

private Camera.ShutterCallback mShutterListener = new Camera.ShutterCallback(){
  @Override
  public void onShuttter(){
  }
};

private Camera.PictureCallback mPictureListner = new Camera.PictureCallback(){}

@Override
public boolean onTouchEvent(MotionEvent event){
  if(event.getAction() == MotionEvent.ACTION_DOWN){
    if(mCamera != null){
      mCamera.takePicture(mShtterListener, null, mPictureListener);
      return true;
    }
  }
  return super.onTouchEvent(event);
};

