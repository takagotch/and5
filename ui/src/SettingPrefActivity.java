//void addPreferenceFromResource(int preferencesResid)

public class SettingPrefActivity extends PreferenceActivity {
  @Override
  public void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);

    addPreferencesFromResource(R.xml.settings_pref);
  }
}


