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




