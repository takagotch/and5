//int getRingerMode()
//void setRingerMode(int ringerMode)
//
//RINGER_MODE_NORMAL
//RIGNER_MODE_SILENT
//RINGER_MODE_VIBLATE
//
//device_Ringer

AndroManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
audioManager.setRingerMode(AudioManager.RINGER_MODE_SILENT);


