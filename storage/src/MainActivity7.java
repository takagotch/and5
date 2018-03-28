//storage_File
//
//FileOutputStream openFileOutput(String name, int mode)
//
//FileOutputStream(File file) File
//FileOutputStream(File file, boolean append)
//FileOutputStream(FileDescriptor id)
//FileOutputStream(String path, boolean append)
//
//OutputStreamWriter(OutputStream out)
//OutputStreamWriter(OutputStream out, Charset cs)
//BufferedWriter(Writer out)
//void write(String str)
//void flush()
//void close()
//
//BufferedOutputStream(OutputStream out)
//void write(byte[] buffer)
//void flush()
//void close()
//
//MODE_PRIVATE
//MODE_APPEND
//MODE_WORLD_READABLE
//MODE_WORLD_WRITABLE
//
//android.permission.WRITE_EXTERNAL_STORAGE

try{
  EditText etWriteText = (EditText) findViewById(R.id.etWriteText);
  BufferedWriter outBuf = null;
  FileOutputStream fos = openFileOutput("and.txt", Context.MODE_PRIVATE);
  outBuf = new BufferedWriter(new OutputStreamWriter(fos));
  outBuf.write(etWriteText.getText().toString());
  outBuf.flush();
  outBuf.close();
} catch (IOException e){
  e.printStackTrace();
}

