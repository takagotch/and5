//String getLine1Number(0
//
//android.permission.READ_PHONE_STATE
//
//tel_Number

TelephonyManager telManager = (TelephonyManager) getSystemService(TELEPHONY_SERVICE);
String phoneNumber = telManager.getLineNumber();

TextView tv_phoneNumber = (TextView) findViewById(R.id.tv_phoneNumber);
tv_phoneNumber.setText("TEL: " + phoneNubmer);

