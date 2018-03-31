//boolean hideSoftInputFromWindow(IBinder windowToken, int flags)
//
//HIDE_IMPLICT_ONLY
//HIDE_NOT_ALWAYS

public void onClickEvent(View v){
  EditText et_sample = (EditText) findViewById(R.id.et_sample);
  InputMethodManager imm = (InputMethodManager) getSystemService(InPUT_METHOD_SERVICE);
  imm.hideSoftInputFromWindow(et_sample.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
}

