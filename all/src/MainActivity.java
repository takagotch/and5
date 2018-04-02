//void onCreate(Bundle savedInstanceState)
//void onRestart()
//void onResume()
//void onPause()
//void onStop()
//void onDestroy()

public class MainActivity extends Activity {
  private static final String TAG = "app_ActivityLifecycle";

  @Override
  protected void onStart(){
    super.onStart();
    Log.d(TAG, "call onStart().");
  }
}

