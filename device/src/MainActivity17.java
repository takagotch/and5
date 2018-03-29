//synchronized static BluetoothAdapter getDefaultAdapter()
//boolean isEnabled()
//
//android.permission()
//
//device_Bluetooth

BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
if(bluetoothAdapter.isEnabled()){
  Toast.makeText(this, "Bluetooth VALIDATE", Toast.LENGTH_SHORT).show();
} else {
  Toast.makeText(this, "Bluetooth INVALIDATE", Toast.LENGTH_SHORT).show();
}

