package seveida.firetvforreddit;

import androidx.annotation.NonNull;

import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Path;
import seveida.firetvforreddit.domain.objects.SubredditDetails;
import seveida.firetvforreddit.response.objects.SubredditResponse;

public class SubredditRepo {

    @NonNull private SubredditApi api;

    SubredditRepo(@NonNull Retrofit retrofit) {
        api = retrofit.create(SubredditApi.class);
    }

    public Observable<SubredditDetails> getSubreddit(String subreddit) {
        return api.getSubreddit(subreddit)
                .map(response -> SubredditDetails.fromResponse(response));
    }
}

interface SubredditApi {
    @GET("/r/{sub}.json")
    Observable<SubredditResponse> getSubreddit(@Path("sub") String subreddit);
}

