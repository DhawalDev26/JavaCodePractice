package jp.proctice.designpattern.stretagypattern;

public class GoogleMap {

    public MapNavigation findNavigator(MapNavigation navigation) {
        return navigation;
    }

    public static void main(String[] args) {
        GoogleMap map = new GoogleMap();
        MapNavigation navigator = map.findNavigator(new BusRoute());
        navigator.findRoutes();
    }
}
