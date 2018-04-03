/*
void setText(CharSequence text)
void setText(int resid)
CharSequence getText()
void setTextColor(int color)
*/

@Override
public boolean onOptionsItemSelected(MenuItem item){
  if(iteem.getItemId() == R.id.action_replace){
    TextView tvPokeri = (TextView) findViewById(R.id.tvPokeri);
    tvPokeri.setText("Hello");
    tvPokeri.setTextColor(Color.BLUE);
  }
  return true;
}


//void setTextSize
TextView tvHello = (TextView) findViewById(R.id.tvHello);
tvHello.setTextSize(24.0f);

//void setTypeface(Typeface tf, int style)
//void setTypeface(Typeface tf)

//void createFromAsset(AssetManager mgr, String path)
Typeface tOrigin = Typeface.createFromAsset(getAssets(), "font/HuiFontP29.ttf");
TextView tvHello = (TextView) findViewById(R.id.tvHello);

tvHello.setTypeface(tfOrigin);

//Toast makeText(Context context, CharSequence text, int duration)
//Toast makeText(Context context, int resId, int duration)
//void setGravity(int gravity, int xOffset, int yOffset)
//void show()
//LENGTH_SHORT
//LENGTH_LONG

Button btnToast = (Button) findViewById(R.id.btnToast);
btnToast.setOnClickListener(new View.OnClickListener(){
  @Override
  public void onClick(View v){
    Toast.makeText(
		    getApplicationContext(),
		    "CLICK BUTTON",
		    Toast.LENGTH_LONG).show();
  }
});

//void setView(View view)
//LayoutInflater getLayoutInflater()
//View inflate(int resource, ViewGroup root)
Button btnToast = (Button)findViewById(R.id.btnToastOrigin);
btnToast.setOnClickListener(new View.OnClickListener(){
  @Override
  public void onClick(View v){
    LayoutInflater layoutInflater = getLayoutInflater();
    View customView = layoutInflater.inflate(
	R.layout.toast_origin, (ViewGroup) findViewById(R.id.root_ToastOrigin));
    Toast orgToast = Toast.makeText(v.getContext(), "", Toast.LENGTH_LONG);
    orgToast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
    orgToast.setView(customView);
    orgToast.show();
  }
});



public void onClickEvent(View v){
  Toast.makeText(this,
		  "BUTTON CLICK",
		  Toast.LENGTH_LONG).show();
}


//void setOnCheckChangeListener(OnCheckedChangeListener listener)
//void onCheckedChanged(RadioGroup group, int checkedId)
RadioGroup grpColor = (RadioGroup) findViewById(R.di.grp_color);
grpColor.setOnCheckedChanged(RadioGroup group, int checkedId){
  public void onChecked(RadioGroup group, int checkedId){
    LinearLayout layout =
	    (LinearLayout) findViewById(R.id.layout_root);

    switch (checkedId){
	    case R.id.rbtn_white:
		    layout.setBackgroundColor(Color.WHITE);
		    break;
	    case R.id.rbtn_blue:
		    layout.setBackgroundColor(Color.BLUE);
		    break;
	    case R.id.rbtn_yellow:
		    layout.setBackgroundColor(Color.YELLOW);
		    break;

    }
  }
};


//void setTextOn()
//void setTextOff()



