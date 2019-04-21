package seveida.firetvforreddit;

import android.app.Application;

import com.jakewharton.threetenabp.AndroidThreeTen;

import retrofit2.Retrofit;

public class RedditApplication extends Application {

    private Retrofit retrofit = RetrofitProvider.create();

    public SubredditRepo subredditRepo = new SubredditRepo(retrofit);

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
