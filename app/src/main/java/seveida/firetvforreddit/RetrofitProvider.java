package seveida.firetvforreddit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.moshi.MoshiConverterFactory;

class RetrofitProvider {

    static Retrofit create() {
        OkHttpClient client = new OkHttpClient();

        return new Retrofit.Builder()
                .baseUrl("https://www.reddit.com")
                .client(client)
                .addConverterFactory(MoshiConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }
}
