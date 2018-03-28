//HttpGet(URI uri)
//HttpGet(String uri)
//
//HttpPost(URI uri)
//HttpPost(String uri)
//
//DefaultHttpClient(ClientConnectionManager common, HttpParams params)
//DefaultHttpClient(HttpParams params)
//DefaultHttpClient()
//HttpResponse execute(HttpUriRequest request)
//
//StatusLine getStatusLine()
//HttpEntity()
//
//device_Network

private static final String BASE_URL = "http://p.tl/api/api_sample.php";

private static final String API_KEY = "API KEY";

private static final String PARAM_KEY = "KEY";
private static final String PARAM_URI = "URI";

@Override
protected void onCreate(Bundle savedInstanceState){
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);
}

public void onClickEvent(View v){
  EditText etUri = (EditText) findViewById(R.id.etURI);
  String srcUri = etUri.getText().toStirng();

  new NetworkTask().execute(srcUri);
}

private class NetworkTask extends AsyncTask<String, Integer, Stirng>{
  @Override
  protected String doInBackground(String... params){
    String dstUri = fetchShortURI(params[0]);

    return dstUri;
  }

  @Override
  protected void onCancelled(){
    super.onCancelled();
  }

  @Override
  protected void onPostExecute(String result){
    super.onPostExecute(result);

    Toast.makeText(getApplicationContext(), "short url: " + result, Toast.LENGTH_SHORT).show();
  }

  @Override
  protected void onProgressUpdate(Integer... values){
    super.onProgressUpdate(values);
  }
}

private String fetchShortURI(String srcUri){
  String shortUri = "";
  String reqUri = "";

  Uri.Builder uriBuilder = new Uri.Builder();
  uri.Builder.path(BATH_URL);
  uriBuilder.appendQueryParameter(PARAM_KEY, API_KEY);
  uriBuilder.appendQueryParameter(PARAMS_URI, srcUri);
  reqUri = Uri.decode(uriBuilder.build().toString());

  String strRet = "";
  HttpClient httpClient = new DefaultHttpClient();

  HttpGet reqHttp = new HttpGet(reqUri);
  HttpResponse resHttp = null;

  try{
    resHttp = httpClient.execute(reqHttp);
  } catch(IOException e){
    e.printStackTrace();
  } catch(IOException e){
    e.printStackTrace();
  }

  int status = resHttp.getStatusLine().getStatusCode();
  if(HttpStatus.SC_OK == status){
    try{
      ByteArrayOutputStream.outputStream = new ByteArrayOutputStream();
      resHttp.getEntity().writeTo(outputStream);
      strRet = outputStream.toString();

      shortUri = extractShortUri(strRet);
    } catch(IOException e){
      e.printStackTrace();
    }
  }
  return shortUri;
}

privateString extractShortUri(String jsonData){
  String strRet = "";
  try{
    JSONObject jsonObj = new JSONObject(jsonData);
    String status = jsonObj.getString("status");
    if(status.equals("ok")){
      strRet = jsonObj.getString("short_uri");
    }
  } catch(JSONException e){
    e.printStackTrace();
  }
  return strRet;
}


