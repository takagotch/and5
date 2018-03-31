//void setFeatureInt(int featureId, int value)
//
//FEATURE_CUSTOM_TITLE

requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);

setContentView(R.layout.activity_main);

getWindow().setFeatureInt(Widow.FEATURE_CUSTOM_TITLE, R.layout.disp_custom_title);


