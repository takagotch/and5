//boolean dispatchkeyEvent(KeyEvent event)
//int getAction()
//int getKeyCode()
//
//ACTION_DOWN
//ACTION_UP
//
//KEYCODE_BACK
//KEYCODE_VALUME_DOWN
//KEYCODE_POWER_MENU
//KEYcODE_CAMERA
//
//device_Back

@Override
public boolean dispatchKeyEvent(Event event){
  if(KeyEvent.ACTION_DOWN == event.getAction()){
    switch(event.getKeyCode()){
    case KeyEvent.KEYCODE_BACK;
      return true;
    }
  }
  return super.dispatchKeyEvent(event);
}

