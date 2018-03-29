//TileOverlay addTileOverlay(TileOverlayOptions options)
//TileOverlayOptions tileProvider(TileProvider tileProvider)
//
//UrlTileProvider(int width, int height)
//URL getTileUrl(int x, int y, int zoom)
//
//maps_Tile

FragmentManager fragmentManager = getSupportFragmentManager();
SupportMapFragment fragment = (SupportMapFragment) fragmentManager.findFragmentById(R.id.fragment);

GoogleMap map = fragment.getMap();

TitleProvider tileProvider = new UrlTileProvider(140, 27){
  @Override
  public URL getTileURi(int x, int y, int zone){
    URL url = null;
    try{
      url = new URL("http://image.gihyo.co.jp/assets/templates/gihyojp2007/image/gijyo_log.png");
    } catch(MalformedURLException e){
      e.printStackTrace();
    }
    return url;
  }
};

map.addTileOverlay(new TileOverlayOptions().tileProvider(tileProvider));


