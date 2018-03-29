//ACTION_REQUEST_ENABLED
//
//android.permission.BLUETOOTH
//android.permission.BLUETOOTH_ADMIN
//
//device_BlutoothEnable

private static int REQUEST_ENABLE_BLUETOOTH = 100;

BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefault();
boolean bEnabled = bluetoothAdapter.isEnabled();
if(bEnabled){
  Intent bluetoothIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
  startActivityResult(bluetoothIntent, REQUEST_ENABLED_BLUETOOTH);
}
@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data){
  super.onActivityResult(requestCode, resultCode, data);
  if(requestCode == REQUEST_ENABLE_BLUETOOTH){
    if(resultCode == Activity.RESULT_OK){
      Toast.makeText(this, "Bluetooth VALIDATE", Toast.LENGTH_SHORT).show();
    } else {
      Toast.makeText(this, "Bluetooth INVALIDATE", Toast.LENGTH_SHORT).show();
    }
  }
}

