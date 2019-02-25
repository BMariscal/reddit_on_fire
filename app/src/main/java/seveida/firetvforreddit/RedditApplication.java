package seveida.firetvforreddit;

import android.app.Application;

import com.jakewharton.threetenabp.AndroidThreeTen;

public class RedditApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AndroidThreeTen.init(this);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        // TODO clear caches here
    }
}
