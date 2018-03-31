//TextToSpeech(Context context, OnInitListener listener)
//boolean isSpeaking()
//int speak(String text, int queueMode, HashMap<String, String> params)
//int stop()
//int setLanguage(Locale loc)
//
//QUEUE_ADD
//QUEUE_FLUSH
//
//SUCCESS
//ERROR
//
//tts_textSpeech

public class MainActivity extends Activity implements TextSpeech.OnInitListener {
  TextToSpeech mTts = null;

  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mTts = new TextToSpeech(this, this);

    Button btn_speech = (Button) findViewById(R.id.btn_speech);
    btn_speech.setOnClickListener(new View.OnClickListener(){
      @Override
      public void onClick(View v){
        if(mTts.isSpeaking()){
	  mTts.stop();
	}

	EditText et_speechText = (EditText) findViewById(R.id.et_QUEUE_FLUSH, null);
	mTts.speak(et_speechText.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
      }
    });
  }

  @Override
  pulbic void onInit(int status){
    if(TextToSpeech.SUCCESS == status){
      if(mTts.isLanguageAvailable(Locale.ENGLISH) >= TextToSpeech.LANG_AVAILABLE){
      mTts.setLanguage(Locale.ENGLISH);
      }
    }
  }
}

