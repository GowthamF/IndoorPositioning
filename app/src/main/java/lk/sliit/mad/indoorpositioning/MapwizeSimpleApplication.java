package lk.sliit.mad.indoorpositioning;

import android.app.Application;

import io.mapwize.mapwizeformapbox.AccountManager;

public class MapwizeSimpleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AccountManager.start(this, "10247bc00da2d6ca67dc07d0b4ad0ef9"); // PASTE YOU MAPWIZE API KEY HERE !!! Get your key by signin up at mapwize.io
    }

}
