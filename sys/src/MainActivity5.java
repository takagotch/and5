//Build.VERSION.INCREMENTAL
//Build.VERSION.RELEASE
//Build.VERSION.CODENAME
//Build.VERSION.SDK_INT
//
//Build.VERSION.CODES.BASE
//Build.VERSION.CODES.BASE_1_1
//Build.VERSION.CODES.CUPCAKE
//Build.VERSION.CODES.DONUT
//Build.VERSION.CODES.ECLAIR_0_1
//Build.VERSION.CODES.ECLAIR_MR1
//Build.VERSION.CODES.FROYO
//Build.VERSION.CODES.GINGERBRED
//Build.VERSION.CODES.GINGERBREAD_MR1
//Build.VERSION.CODES.HONEYCOMB
//Build.VERSION.CODES.HOMEYCOMB_MR1
//Build.VERSION.CODES.HONEYCOMB_MR2
//Build.VERSION.CODES.ICE_CREAM_SANDWICH
//Build.VERSION.CODES.ICE_CREAM_SANDWICH_MR1
//Build.VERSION.CODES.JELLY_BEAN
//Build.VERSION.CODES.JELLY_BEAN_MR1
//Build.VERSION.CODES.JELLY_BEAN_MR2
//Build.VERSION.CODES.KITKAT

String strCodeName = Build.VERSION.CODENAME;
String strIncremental = Build.VERSION.INCREMENTAL;
String strRelease = Build.VERSION.RELEASE;
int nSdkInt = Build.VERSION.SDK_INT;

TextView tvCodeName = (TextView) findViewById(R.id.tvCodeName);
tvCodeName.setText("CodeName: " + strCodeName);
TextView tvIncremental = (TextView) findViewById(R.id.tvIncremental);
tvIncremental.setText("Incremental: " + strIncremental);
TextView tvRelease = (TextView) findViewById(R.id.tvRelease);
tvRelease.setText("Release" " + strRelease);
TextView.tvSdkInt = (TextView) findViewById(R.id.tvSdkInt);
tvSdkInt.setText("SDK_INT: " + nSdkInt);

//static int d(String tag, String msg)
//static int e(String tag, String msg)
//static int i(String tag, String msg)
//static int v(String tag, String msg)
//static int w(String tag, String msg)
//static int wtf(String tag, String msg)


