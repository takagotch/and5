//Dialog onCreateDialog(Bundle savedInstanceState)
//void show(FragmentManager manager, String tag)

Button btnShowDialog = (Button) findViewById(R.id.btnShowDialog);
btnShowDialog.setOnClickListener(new View.OnClickListener(){
  @Override
  public void onClick(View v){
    SampleDialogFragemnt digFragment = new SampleDialogFragment();
    digFragment.show(getSupportFragmentManager(), "sample_dialog_fragment");
  }
});

