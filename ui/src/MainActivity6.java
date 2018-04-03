//void goBack()
//void Forward()
//void goBackOrForward(int steps)

case R.id.menu_back:
  webView.goBack();
  return true;
case R.id.menu_forward:
  webView.goForward();
  return true;
case R.id.menu_2back:
  webView.goBackOrForward(-2);
  return true;


//WebStrings getSettings()
//void setJavaScriptEnabled(boolean flag)
@SuppressLint("SetJavaScriptEnabled")
@Override
protected void onCreate(Bundle savedInstanceState){
  WebView webView = (WebView) findViewById(R.id.webView);
  WebSettings settings = webView.getSettings();
  settings.setJavaScriptEnabled(true);
}


//void setWebViewClient(WebViewClient client)
webView.setWebClient(new WebViewClient(){
});

//void onPageStared()
//void onPageFinished()
webView.setWebViewClient(new WebViewClient(){
  @Override
  public void onPageStared(WebView view, String, Bitmapfacicon){
    super.onPageStared(view, url, favicon);

    setProgressBarIndereminateVisiblility(true);
  }

  @Override
  public void onPageFinished(WebView view, String url){
    super.onPageFinished(view, url);

    setProgressBarIndetermateVisiblity(false);
  }
});

//void setBuiltInZoomControl(boolean enabled)
WebStrings settings = webView.getSettings();

settings.setBuildInZoomControls(true);

//ArrayAdapter (Context context, int textViewResourceId, T[] objects)
//void setAdapter(ListAdapter adapter)

public class MainActivity extends Activity {
  @Override
  public boolean onMenuSelected(int featureId, MenuItem item){
  ListView lv = (ListView) findViewById(android.R.id.list);
  switch(item.getItem()){
  case R.id.menu_load:
	  String[] language = { "", "", "",
	  "", "", "", "", "", 
	  "", "", "", "", "", "", 
	  "", "", "", "" };
	  ArrayAdapter<String> adapter = new ArrayAdapter<String>(
		this, android.R.layout.simple_list_item_1, language);
	  lv.setAdapter(adapter);
	  return true;
  }
  }
}


//void setEmptyView(View emptyView)
ListView listView = (ListView) findViewById(android.R.id.list);

LayoutInflater inflater = getLayoutInflater();
View emptyView = inflater.inflate(
	R.layout.activity_main,
	(ViewGroup) findViewById(android.R.id.empty));
listView.setEmptyView(emptyView);

//void setOnItemClickListener(OnItemClickListener listener)
//void onItemClick(AdapterView<?> parent, View view, int position, long id)
ListView listView = (ListView) findViewById(android.R.id.list);
listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
  public void onItemClick(AdapterView<?> parent, View view, int position,
		  long id){
    ListView lv = (ListView)parent;
    Toast.makeText(getApplicationContext(),
	(String)lv.getItemAtPosition(position),
	Toast.LENGTH_SHORT).show();
  }
});

//void setSelection(int position)
//int getCount()
ListView lv = (ListView) findViewById(android.R.id.list);
switch(item.getItemId()){
	case R.id.menu_position:
		lv.setSelection(lv.getCount() - 1);
		return true;
}

//void addHeadView(View v)
//void removeHeaderView(View v)
//void addFooterView(View v)
//void removeFooterView(View v)
listView.setOnScrollListener(new AbsListView.OnScrollListener(){
  @Override
  public void onScroll(AbsListView view, int firstVisibleItem,
		  int visibleItemCount, int totalCount){
    ListView lv = (ListView) view;
    if(firstVisibleItem + visibleItemCount == totalItemCount){
      if(lv.getFooterViewsCount() == 0){
        lv.addFooterView(mIvFooter);
      }
    }
  }
});

@Override
public boolean onMenuItemSelected(int featureId, MenuItem item){
  ListView lv = (ListView) findViewById(android.R.id.list);
  switch(item.getItemId()){
  case R.id.menu_removeFooterView;
    lv.removeFooterView(mlvFooter);
    return true;
  }
  return super.onMenuItemSelected(featureId, item);
}

//void setOnScrollListener(AbsListView.OnScrollListener l)
//void onScrollStateChanged(AbsListView view, int scrollState)
//void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount)

//boolean overScrollBy(
//  int deltaX, int deltaX
//  int scrollX, int scrollY,
//  int scrollRangeX, int scrollRangeY,
//  int maxOverScrollX, int maxOverScrollY,
//  boolean isTouchEvent)
//void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY)
//void setOverScrollMode(int mode)
//
//OVER_SCROLL_ALWAYS
//OVER_SCROLL_IF_CONTENT_SCROLLS
//OVER_SCROLL_NAVER

ArrayList<HashMap<String, String>> groupData = new ArrayList<HashMap<String, String>>();
HashMap<String, String> mapGroupItem = new HashMap<String, String>();
mapGroupItem.put("book", "BOOK");

groupData.add(mapGroupItem);

ArrayList<ArrayList<HashMap<String, String>>> childData =
  new ArrayList<ArrayList<HashMap<String, String>>>();

ArrayList<HashMap<String, String>> childGroup = new ArrayList<HashMap<String, String>>();
HashMap<String, String> mapChildItem1 = new HashMap<String String>();
mapChildItem1.put("book", "BOOK");
mapChildItem1.put("publish", "PUB");
HashMap<String, String> mapChildItem2 = new HashMap<String, String>();
mapChildItem2.put("book", "BOOK");
mapChildItem2.put("publish", "PUB");
HashMap<String, String> mapChildItem2 = new HahsMap<String, String>();
mapChildItem2.put("book", "BOOK");
mapChildItem2.put("publish", "PUB");

childGroup.add(mapChildItem1);
childGroup.add(mapChildItem2);
childGroup.add(mapChildItem3);

childData(childGroup);

SimpleExpandableListAdapter adapter = new SimpleExpandListAdapter(
		this,
		groudData,
		android.R.layout.simple_expandable_list_item_1,
		new String[] {"book"},
		new int[] {android.R.id.text1},
		childData,
		android.R.layout.simple_expandable_list_item_1,
		new String[] {"book"},
		new int[] {android.R.id.text(1)});

ExpandableListView expandableListView = (ExpandableListView) finViewById(R.id.expandableListView);
expandableListView.setAdapter(adapter);

//void setOnGroupListener(OnGroupClickListener onGroupClickListener)
//void setOnGroupClickListener(onChildClickListener onChildClickListener)
//boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id)
//boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id)

ExpandableListView expandableListView =
  (ExpandableListView) findViewById(R.id.expandableListView);
expandableListView.setAdapter(adapter);

expandableListView.setOnChildClickListener(new ExpandableView, OnChildClickListener(){
  @SuppressWarning("unchecked")
  @Override
  public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id){
    SimpleExapndableListAdapter adapter = 
	    (SimpleExapndableListAdapter) parent.getExpandableListAdapter();
    HashMap<String, String> childData =
	    (HashMap<String, String>)adapter.getChild(groupPosition, childPosition);
    Toast.makeText(getApplicationContext(), "PUBLISH " +
	childData.get("publish") + " ", Toast.LENGTH_SHORT).show();
    return true;
  }
});


//void setAdapter(SprinnerAdapter adapter)
String[] language = {"", "", "", "", "", "", "",
  "", "", "", "", ""};
GridView gridView = (GridView) findViewById(R.id.gridView);
ArrayAdapter<String> adapter
  = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, language);
gridView.setAdapter(adapter);


//void setSelector(int resID)
gridView.setSelector(android.R.drawable.alert_light_frame);

//void setOnItemClickListener(OnItemClickListener listener)
//void onItemClick(AdapterView<?> parent, View view, int position, long id)

gridView.setInputClickListener(new AdapterView.OnItemClickListener(){
  public void onItemClick(AdapterView<?> parent, View view, int position,
		  long id){
    GridView gv = (GridView)parent;
    Toast.makeText(getApplicationContext(),
	(String)gv.getItemAtPosition(position),
	Toast.LENGTH_SHORT).show();
  }
});


//void setBase(long base)
//void start()
//void stop()
//long elapsedRealtime()

Chronometer chronoMeter = (Chronometer) findViewById(R.id.chronoMeter);
chronoMeter.setBase(SystemClock.elapsedRealTime());

switch (item.getItemId()){
case R.idmenu_start:
	chronoMeter.start();
	return true;
case R.id.menu_stop():
	chronoMeter.stop();
	chronoMeter.setBase(SystemClock.elapsedRealtime());
	return true;
}

//android:max
//android:progress
//void setMax(int max)
//void setProgress(int progress)
SeekBar seekBar = (SeekBar) finViewById(R.id.seekBar);
seekBar.setMax(100);
seekBar.setProgress(0);

//void setOnSeekBarChangeListener(OnSeekBarChangeListener l)
//void onStartTrackingTouch(SeekBar seekBar)
//void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
//void onStopTrackingTouch(SeekBar seekBar)
seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
  @Override
  public void onStartTrackingTouch(SeekBar seekBar){
    setProgressBarIndeterminateVisibility(true);
  }

  @Override
  public void onProgressChanged(SeekBar seekBar, int progress, boolean fromTouch){
    TextView tvProgress = (TextView) findVeiwById(R.id.tvProgress);
    tvProgress.setText(progress + "%... ");
  }

  @Override
  public void onStopTrackingTouch(SeekBar seekBar){
    setProgressBarIndeterminateVisibility(false);
  }
});

//ArrayAdapter(Context context, int textViewResourceId, T[] objects)
//void setDropDownViewResource(int resource)
//void setAdapter(SpinnerAdapter adapter)
//void setPrompt(CharSequence prompt)
//void setPromptId(int promptId)
//void setSelection(int position)
//
//android.R.layout.simple_spinner_item
//android.R.layout.simple_spinner_dropdown_item
String[] items = {"", "", "", "", ""};

Spinner spinnerAge = (Spinner) findViewById(R.id.spinnerAge);
ArrayAdapter<String> adapter = new ArrayAdapter<String>(
	this,
	android.R.layout.simple_spinner_item,
	items);
adapter.setDropDownViewResource(android.R.layout.simple_spinner_drapdown_item);
spinnerAge.setAdapter(adapter);
spinnerAge.setPrompt("AGE");
spinnerAge.setSelection(3);

//void setOnItemSelectedListener(AdapterView.OnItemSelectedListener listener)
//void onItemSelected(Adapter View<?> parent, View view, int position, long id)
//void onNorthingSelected(AdapterView<?> parent)

Spinner spinnerAge = (Spinner) findViewById(R.id.spinnerAge);
spinnerAge.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
  @Override
  public void onItemSelected(AdapterView<?> parent, View view,
	int position, long id){
    Spinner spnAge = (Spinner) parent;
    String item = (String) spnAge.getItemPosition(position);

    Log.d(TAG, "position: " + item);

    @Override
    public void onNothingSelected(AdapterView<?> parent){
    }
  }
});

//void setVerticalScrollbarPosition(int position)
//SCROLLBAR_POSITION_DEFAULT
//SCROLLBAR_POSITION_LEFT
//SCROLLBAR_POSITION_RIGHT
ScrollView sv = (ScrollView) findViewById(R.id.scrollView);
sv.setVerticalScrollbarPosition(ScrollView.SCROLLBAR_POSITION_LEFT);


//void init(
//  int year, 
//  int monthOfYear
//  int dayOfMonth,
//  OnDateChangeListener
//onDateChangedListener)
//
//void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth)

@Override
public void onCreate(Bundle savedInstanceState){
  DatePicker datePicker = (DatePicker) findViewById(R.id.datePicker);
  datePicker.init(2013, 0, 6, 1, mListener);
}

DatePicker.OnDateChangedListener mListener = new DatePicker.OnDateChangedListener(){
  @Override
  public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth){
    Toast.makeText(
      view.getContext(),
      year + "/" + (monthOfYear + 1) + "/" + dayOfMonth + " ",
      Toast.LENGTH_SHORT).show();
  }
};

//void setOnTimeChangedListener(TimePicker.OnTimeChangedListener onTimeChangedListener)
//void onTimeChanged(TimePicker view, int hourOfDay, int minute)

TimePicker picker = (TimePicker) findViewById(R.id.timePicker);
picker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener(){
  @Override
  public void onTimeCahged(TimePicker view, int hourOfDay, int minute){
    Toast.mekeText(
	view.getContext(),
	hourOfDay + ":" + minute + " ",
	Toast.LENGTH_SHORT).show();
  }
});

//void setMaxValue(int maxValue)
//void setMinValue(int minValue)
NumberPicker numberPicker = (NumberPicker) findViewById(R.id.numberPicker);
numberPicker.setMaxValue(50);
numberPicker.setMinValue(10);

//void setOnValueChangedListener(NumberPicker.OnValueChangedListener onValueChangedListener)
//void onValueChange(NumberPicker picker, int oldVal, int newVal)

numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangedListener(){
  @Override
  public void onValueChanged(NumberPicker picker, int oldVal, int newVal){
    Toast.mekeText(getApplicationContext(),
	"PRE..." + oldVal + " NEW..." + newVal,
	Toast.LENGTH_SHORT).show();
  }
});

//Builder(Context context)
//AlertDialog.Builder setTitle(CharSequence title)
//AlertDialog.Builder setMessage(CharSequence title)
//AlertDialog.Builder setPositiveButton(Charsequence message)
//AlertDialog.Builder setNagativeButton(CharSequence text, Dialognterface, DialogInterface.OnClickListener listener)
//AlertDialog.Builder setNeutralButton(CharSequence text, DialogInterface. OnClickListener listener)
//AlertDialog create()
//void onClick(DialogInterface dialog, int which)
//
//BUTTON_POSITIVE
//BUTTON_NEUTRAL
//BUTTON_NEGATIVE

public static class AlertDialogFragment extends DialogFragment {
  @Override
  public Dialog onCreate(Bundle savedInstanceState){
    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
    builder.setTitle("test");
      setMessage("ALERT DIALOG");
      setPositiveButton("OK", new DialogInterface.OnClickListener(){
        @Override
	public void onClick(DialogInterface dialog, int which){
	  Toast.makeText(getActivity(), "OK", Toast.LENGTH_SHORT).show();
	}
      })
      .setNegativeButton("Cancel", new DialogInterface.OnClickListener(){
        @Override
	public void onClick(DialogInterface dialog, int which){
	  Toast.makeText(getActivity(), "CANCEL CLICK", Toast.LENGTH_SHORT).show();
	}
      })
      .setNeutralButton("Neutral", new DialogInterface.OnClickListener(){
        @Override
	public void onClick(getActivity(), "Neutral CLICK",
	  Toast.LENGTH_SHORT).show();
      }
      });
  return builder.create();
  }
}

public void showAlertDialog(View v){
  DialogFragment newFragment = new AlertDialogFragment();
  newFragment.show(getSuportFragmentManager()0, "showAlertDialog");
}


//DatePickerDialog(
//  Context context,
//  DataPickerDialog,
//OnDateSetListener callBack,
//  int year,
//  int monthOfYear
//  int dayOfMonth)
//DatePickerDialog(
//  Context context,
//  int theme,
//  DatePickerDialog,
//OnDateSetListener callBack,
//  int year,
//  int monthOfYear,
//  int dayOfMonth)
//void onDateSet(
//  DatePicker view,
//  int year,
//  int monthOfYear,
//  int dayOfMonth)
//
//THEME_HOLD_DARK
//THEME_HOLD_LIGHT
//THEME_TRADITIONAL
//THEME_DEVICE_DEFAULT_DARK
//THEME_DEVICE_DEFAULT_LIGHT

public static class DatePickerFragment extends DialogFragment
	implements DatePickerDialog.OnDateSetListener {
  @Override
  public Dialog onCreateDialog(Bundle savedInstanceState){
    return new DatePickerDialog(
	getActivity(),
	DatePickerDialog.THEME_HOLD_DARK,
	this,
	2018, 2, 22);
  }

  @Override
  public void onDateSet(DatePicker view, year, int monthOfYear, int dayOfMonth){
    Toast.makeText(getActivity(),
	"RESULT" + year + "YEAR" + (monthOfYear+1) + "MONTH" + dayOfMonth + "DAY",
	Toast.LENGTH_SHORT).show();
  }
}
public void showOfPickerDialog(View v){
  DialogFragment newFragment = new DatePickerFragment();
  newFragment.show(getSupportFragmentManager(), "showDatePickerDialog");
}

//TimePickerDialog(
//  Context context,
//  TimePickerDialog.OnTimeSetListener callBack,
//  int hourOfDay, int minute,
//  boolean is24HourView)
//TimePickerDialog(
//  Context context, int theme,
//  TimePickerDialog.OnTimeSetListener callBack,
//  int hourOfDay, int minute,
//  boolean is24HourView)
//void onTimeSet(
//  TimePicker view,int hourOfDay,
//  int minute)
//
//THEME_HOLD_DARK
//THEME_HOLD_LIGHT
//THEME_TRADITIONAL
//THEME_DEVICE_DEFAULT_DARK
//THEME_DEVICE_DEFAULT_LIGHT

public static class TimePickerFragment extends DialogFragment
	implements TimePickerDialog.OnTimeSetListener{
  @Override
  public Dialog onCreateDialog(Bundle savedInstanceState){
    return new TimePickerDialog(
	getActivity(),
	TimePickerDialog.THEME_HOLD_DARK,
	this,
	12, 34, true);
  }

  @Override
  public void onTimeSet(TimePicker view, int hourOfDay, int minutes){
    Toast.makeText(getActivity(),
	"RESULT " + hourOfDay + "HOUR" + minute + "MINUTES",
	Toast.LENGTH_SHORT).show();
  }
}
public void showTimeDialog(View v){
  TimePickerFragment newFragment = new TimePickerFragment();
  newFragment.show(getSupportFragmentManager(0, "showTimePickerDialog");
}











