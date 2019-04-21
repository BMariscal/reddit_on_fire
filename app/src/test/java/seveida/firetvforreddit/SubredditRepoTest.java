package seveida.firetvforreddit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import io.reactivex.functions.Consumer;
import retrofit2.Retrofit;
import seveida.firetvforreddit.domain.objects.SubredditDetails;
import seveida.firetvforreddit.domain.objects.ThreadMetadata;
import seveida.firetvforreddit.response.objects.SubredditResponse;

import static org.junit.Assert.*;

@RunWith(RobolectricTestRunner.class)
public class SubredditRepoTest {

    @Test
    public void t() {
        Retrofit retrofit = RetrofitProvider.create();

        SubredditRepo repo = new SubredditRepo(retrofit);

        repo.getSubreddit("boobs")
                .subscribe(subreddit -> {
                    subreddit.threadMetadataList.forEach(thread -> {
                        System.out.println(thread.title);
                    });
                });

        try {
            Thread.sleep(10_000);
        } catch (Exception e) {

        }

    }

}