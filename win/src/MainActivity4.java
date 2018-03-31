//void setProgressBarIndeterminateVisibility(boolean visible)

@Override
public void onPageStarted(WebView view, String uri, Bitmap favicon){
  super.onPageStarted(view, url, favicon);

  setProgressBarIndeterminateVisibility(true);
}

@Override
public void onPageFinished(WebView view, String uri){
  super.onPageFinished(view, url);

  setProgressBarIndeterminateVisiblility(false);
}

