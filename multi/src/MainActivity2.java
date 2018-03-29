//static ObjectAnimation ofFloat(Object target, String propertyName, float... values)
//static ObjectAnimator ofInt(Object target, String propertyName, int... values)
//static ObjectAnimator ofObject(Object target, String propertyName, TypeEvaluator evaluator, Object... values)
//ObjectAnimator setDuration(long duration)
//void setFloatValues(float... values)
//void setIntValues(int... values)
//void setObjectValues(Object... values)
//void setProperty(Property property)
//void setPropertyName(String propertyName)
//void setTarget(Object target)
//void setupStartValues()
//void setupEndValues()
//void start()
//
//"translationX"
//"translationY"
//"rotationX"
//"rotationY"
//"scaleX"
//"scaleY"
//"pivotX"
//"pivotY"
//"x"
//"y"
//"alpha"
//
//media_PropertyAnimation

TextView tv_hello = (TextView) findViewById(R.id.tv_hello);
tv_hello.setOnClickListener(new View.OnClickListener(){
  @Override
  public void onClick(View v){
    ObjectAnimator.ofFloat(v, "alpha", 0.0f).start();
  }
});

