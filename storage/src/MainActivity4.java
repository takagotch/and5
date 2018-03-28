//storage_Clipboard
//
//void setText(CharSequence text)
//ClipData.Item(CharSequence text)
//ClipData(ClipDescription description, ClipData.Item item)
//ClipDescriptoin(CharSequence label, String[] mimeTypes)
//
//void setPrimaryClip(ClipData clip)

EditText et_target = (EditText) findViewById(R.id.et_target);
if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB){

  ClipData.Item item = new ClipData.Item(et_target.getText());

  String[] mimeType = new String[1];
  mimeType[0] = ClipDescription.MIMETYPE_TEXT_PLAIN;

  ClipData clipData = new ClipData(new ClipDescriptoin("text_plain", mimeType), item);

  ClipboardManager clipMgr = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
  clipMgr.setPrimaryClip(clipData);
} else {

  android.text.ClipboardManager clipMgr =
	  (android.text.ClipboardManager) getSystemService(CLIPBOARD_SERVICE);

  clipMgr.setText(et_target.getText());
}


