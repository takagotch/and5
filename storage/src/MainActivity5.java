//storage_Cilpboard
//
//CharSequence getText()
//ClipData getPrimaryClip()
//ClipData.Item getItemAt(int index)
//CharSequence getText()

String toastText = "";
if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB){
  ClipboardManager cliper = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
  ClipData clipData = clipMgr.getPrimaryClip();
  ClipData.Item item = clipData.getItemAt(0);
  toastText = item.getText().toString();
} else {
  android.text.ClipboardManager clipMgr = (android.text.ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
  toastText = clipMgr.getText().toString();
}
Toast.makeText(getApplicationContext(), "Text: " + toastText, Toast.LENGTH_SHORT).show();


