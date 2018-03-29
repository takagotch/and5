//void overridePendingTranslation
//
//media)PendingTransaction

Intent intent = new Intent(this, SubActivity.class);
intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
startActivity(intent);

overridePendingTransaction(android.R.anim.slide_in_left,
android.R.anim.slide_out_right);


