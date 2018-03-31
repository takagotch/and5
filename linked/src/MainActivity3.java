@Override
protected void onCreate(Bundle savedInstanceState){
  super.onCreate(savedInstanceState);

  Intent intent = getintent();
  if(intent != null){
    if(intent.getAction().equals(Intent.ACTION_SEND)){
    }
  }
}

