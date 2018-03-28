//void listen(PhoneStateListener listener, int events)
//void onCallStateChanged(int state, String number)
//
//LISTEN_CALL_STATE
//LISTEN_NONE
//
//CALL_STATE_RINGING
//CALL_STATE_OFFHOOK
//CALL_STATE_IDLE
//
//android.permission.READ_PHONE_STATE
//
//device_CellState

@Override
protected void onResume(){
  super.onResume();
  
  TelephonManager telManager = (TelephonyManager) getSystemService(TELEPHONY_SERVICE);
  telManager.listen(mPhoneStateListener, PhoneStateListener, LISTEN_CALL_STATE);
}

@Override
protected void onPause(){
  TelephonyManager telManager = (TelephoneyManager) getSystemService(TELEPHONY_SERVICE);
  telManager.listen(mPhoneStateListener, PhoneStateListener.LISTEN_NONE);

  super.onPause();
}

PhoneStateListener mPhoneStateListener = new PhoneStateListener(){
  @Override
  public void onCallStateChanged(int state, String incomingNumber){
	  switch(state){
	  case TelephonyManager.CALL_STATE_RINGING:
		Toast.makeText(getApplicatoinContext(),
				incomingNumber + "CALL",
				Toast.LENGTH_SHORT).show();
	        break;
	  case TelephonManager.CALL_STATE_OFFHOOK:
		Toast.makeText(getApplicationContext(),
				incomingNumber + "CALLING",
				Toast.LENGTH_SHORT).show();
		break;
	  case TelephonyManager.CALL_STATE_IDLE:
		Toast.makeText(getApplicationContext(),
				incomingNumber + "END",
				Toast.LENGTH_SHORT).show();
		break;
	  }
  }
};


