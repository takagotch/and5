public class DragView extends ImageView {
  public DragView(Context context, AttributeSet attrs){
    super(context, attrs);
  }

  @Override
  public boolean onDragEvent(DragEvent event){
    switch (event.getAction()){
    case DragEvent.ACTION_DRAG.STARTED:
	    Toast.makeText(getContext(), "DRAG", Toast.LENGTH_SHORT).show();
	    invalidate();
	    break;
    }
    return true;
  }
}




public class DropView extends ImageView {
  public DropView(Context context, AttriubtesSet attrs){
    super(context, attrs);
  }

  public boolean onDragEvent(DragEvent event){
    switch(event.getAction()){
    case DragEvent.ACTION_DROG:
	    Toast.mekeText(getContext(),
		"DROP" + event.getX() + ", " + event.getY(), Toast.LENGTH_SHORT).show();
	    invalidate();
	    break;
    }
    return true;
  };
}



