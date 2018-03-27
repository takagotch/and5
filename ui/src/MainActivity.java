//event_TouchEvent
//
//boolean onTouchEvent
//boolean onTouch
//

@Override
public boolean onTouchEvent(MotionEvent event){
  int action = event.getAction();
  switch(action){
  case MotionEvent.ACTION_DOWN:
	  Toast.makeText(getApplicationContext(), "TOUCH : DOWN", Toast.LENGTH_SHORT);
	  break;
  case MotionEvent.ACTION_UP:
	  Toast.makeText(getApplicationContext(), "TOUCH : UP", Toast.LENGTH_SHORT);
  }
  return false;
}


