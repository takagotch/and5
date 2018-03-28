//SmsManager getDefault()
//void sendTextMessage(String destinationAddress, String scAddress, String text, PendingIntent sentIntent, PendingIntent deliveryIntent)
//
//device_SendSMS

SmsManager smsManager = SmsManager.getDefault();
String destinationAddress = "090XXXXYYYY";
String text = "HELLO";
smsManager.sendTextMessage(destinationAddress, null, text, null, null);

