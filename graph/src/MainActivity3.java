//boolean compress(Bitmap.CompressFormat format, int quality, OutputStream stream)
//
//JPEG
//PNG
//WEBP
//
//graph_BitmapCompress

Bitmap bitmap = BitmapFactory.decodeResource(getResource(), R.drawable.ic_launcher);

try{
  File derSD = Environment.getExternalStorageDirectory();

  Date date = new Date();
  SimpleDateFormat fileName = new SimpleDateFormat("yyyyMMdd_HHmmss");

  fileOutputStream fos = null;
  fos = new FileOutputStream(new File(dirSD, fileName.format(date) + ".jpg"));

  bitmap.compress(CompressFormat.JPEG, 100, fos);

  fos.close();
  fos = null;
} catch(Exception e){
  e.printStackTrace();
}


