//onPreExecute()
//Result doInBackground(Params... params)
//void onPostExecute(Result result)
//void onProgressUpdate(Progress... values)
//void publishProgress(Progress... values)
//AsyncTask<Params, Progress, Result>execute(Params... params)
//void execute(Runnable runnable)
//
//device_AsyncTask

private class ProgressTask extends AsyncTask<String, Integer, Long>{
  @Override
  protected Long doInBackground(String... params){
    while(mDialog.getProgress() < mDialog.getMax){
      SystemClock.sleep(500);

      publishProgress(mDialog.getProgress() + 5);
    }
    return 0L;
  }

  @Override
  protected void onCancelled(){
    super.onCanceled();
    mDialog.dismiss();
  }

  @Override
  protected void onPostExecute(Long result){
    super.onPostExecute(result);

    mDialog.dismiss();
  }

  @Override
  protected void onProgressUpdate(Integer... values){
    super.onProgressUpdate(values);

    mDialog.setProgress(values[0]);
  }
}


