//void onAttach(Activity activity)
//void onCreate(Bundle savedInstanceState)
//void onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
//void onActivityCreated(Bundle savedInstanceState)
//void onViewStateRestored(Bundle savedInstanceState)
//void onStart()
//void onResume()
//void onPause()
//void onStop()
//void onDestroyView()
//void onDestroy()
//void onDetach()

public class MainFragment extends Fragment {
  private static final String TAG = ".MainFragment";

  @Override
  public void onAttach(Activity activity){
    Log.d(TAG, "call onAttach().");
    super.onAttach(activity);
  }
}

