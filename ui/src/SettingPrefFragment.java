public class SettingPrefFragment extends PreferenceFragment {
  @Override
  public void onCreate(Bundle savedInstaceState){
    super.onCreate(savedInstanceState);

    addPreferenceFromResource(R.xml.setting_pref);
  }
}


