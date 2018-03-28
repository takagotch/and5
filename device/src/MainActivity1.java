//
//
//device_Handler

public static class ProgressFragment extends DialogFragment{
  private ProgressDialog mDialog = null;
  private static Handler mHandler = null;

  @Override
  public Dialog onCreateDialog(Bundle savedInstanceState){
    mDialog = new ProgressDialog(getActivity());
    mDialog.setTitle("LOADING...");
    mDialog.setMessage("WAITING...");
    mDialog.setProgress(0);
    mDialog.setMax(300);
    mDialog.setCancelable(true);
    mDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);

    mHandler = new Handler(){
      @Override
      public void handlerMessage(Message msg){
        mDialog.setProgress(mDialog.getProgress() + 5);

	if(mDialog.getProgress() < mDialog.getMax()){
	  sendEmptyMessageDelayed(0, 500);
	} else {
	  mDialog.dismiss();
	}
      }
    };
    mHandler.sendEmptyMessage(0);

    return mDialog;
  }
}


