//void setFeatureDrawableResource(int featureId, int resId)
//void setFeatureDrawableAlpha(int featureId, int alpha)
//
//FEATURE_LEFT_ICON
//FEATURE_RIGHT_ICON
//
//window_TitleIcon

@Override
public void onCreate(Bundle savedInstanceState){
  super.onCreate(savedInstanceState);

  requestWindowFeature(Window.FEATURE_LEFT_ICON);
  requestWindowFeature(Window.FEATURE_RIGHT_ICON);

  setContentView(R.layout.default_layout);
}

