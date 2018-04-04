//void onReceive(Context context, Intent intent)
//void onEnabled(Context context)
//void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds)
//void onDeleted(Context context, appWidgetIds)
//void onDisabled(Context context)

public class WidgetProvider extends AppWidgetProvider {
  private static final String TAG = "WidgetProvider";

  @Override
  public void onEnabled(Context context){
    Log.d(TAG, "call onEnabled()");
    super.onEnabled(context);
  }

  @Override
  public void onUpdate(Context context, AppWidgetManager appWidgetManager,
	int[] appWidgetIds){
    Log.d(TAG, "call onUpdate()");
    super.onUpdate(context, appWidgetManager, appWidgetIds);
  }

  @Override
  public void onDeleted(Context context, int[] appWidgetIds){
    Log.d(TAG, "call onEnabled()");
    super.onUpdate(context, appWidgetManager, appWidgetIds);
  }

  @Override
  public void onDisabled(Context context){
    Log.d(TAG, "call onDisabled()");
    super.onDisabled(context);
  }

  @Override
  public void onReceive(Context context, Intent intent){
    Log.d(TAG, "call onReceive()");

    Intent serviceIntent = new Intent(context, CountService.class);
    context.startService(serviceIntent);

    super.onReceive(context, intent);
  }
}







