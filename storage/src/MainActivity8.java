//FileInputStream openFileInput(String name)
//FileInputStream(File file)
//FileInputStream(FileDescriptor fd)
//FileInputStream(String path)
//
//InputStreamReader(InputStream in)
//
//BufferdReader(InputStream in)
//String readLine()
//void close()
//BufferedInputStream(InputStream in)
//int read(byte[] buffer, int offset, int byteCount)

try{
  BufferedReader inBuf = null;
  FileInputStream file = openFileInput("and.txt");
  inBuf = new BufferedReader(new InputStreamReader(file));

  EditText etWriteText = (EditText) findView(R.id.etWriteText);
  String temp = "";
  temp = inBuf.readLine();
  while(temp != null){
    etWriteText.setText(etWriteText.getText().toString() + temp + "\n");

    temp = inBuf.readLine();
  }

  inBuf.close();
} catch(IOException e){
  e.printStackTrace();
}


