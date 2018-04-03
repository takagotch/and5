public class OverScrollView extends ListView {
  private static final String TAG = "OverScrollView";

  public OverScrollView(Context context){
    super(context);

    setOverScrollMode(OVER_SCROLL_ALWAYS);
  }

  public OverScrollView(Context context, AttributeSet attrs){
    super(context, attrs);

    setOverScrollMode(OVER_SCROLL_ALWAYS);
  }

  @Override
  protected boolean overScrollBy(int deltaX, int daltaY, int scrollX,
		  int scrollY, int scrollRangeY, int scrollRangeY,
		  int maxOverScrollX, int maxOverScrollY, boolean isTouchEvent){
    return super.overScrollBy(0, deltaY, 0, scrollY, 0,
		    scrollRangeY, 0, 100, isTouchEvent);
  }

  @Override
  protected void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY){
    Log.d(TAG, "call onOverScrolled():"
	+ "scrollX=" + scrollX
	+ ", scrollY=" + scrollY
	+ ", clampedX" + clampedX
	+ ", clampedY" + clampedY);
    super.onOverScroll(scrollX, scrollY, clampedX, clampedY);
  }
}


