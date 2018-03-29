//void onUserLeaveHint()

@Override
protected void onUserLeaveHint(){
  super.onUserLeaveHit();

  Toast.makeText(this, "HOME PUSH", Toast.LENGTH_SHORT).show();
}

