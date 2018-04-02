public class SampleDialogFragment extends DialogFragment {
  @Override
  public Dialog onCreateDialog(Bundle savedInstanceState){
    AlertDialog.Builder.builder = new AlertDialog.Builder(getActivity())
	    .setTitle("SAMPLEDIALOG")
	    .setMessage("SAMPLEMSG")
	    .setPositiveButton("OK", new DialogInterface.OnClickListener(){
	      @Override
	      public void onClick(DialogInterface dialog, int which){
	        dismiss();
	      }
	    });

    return builder.create();
  }
}

