package seveida.firetvforreddit.subreddit.domain.objects;

import java.util.List;

import androidx.annotation.NonNull;

public class SubredditDetails {

    @NonNull public final SubredditMetadata subredditMetadata;
    @NonNull public final List<ThreadMetadata> threadMetadataList;

    public SubredditDetails(@NonNull SubredditMetadata subredditMetadata,
                            @NonNull List<ThreadMetadata> threadMetadataList) {
        this.subredditMetadata = subredditMetadata;
        this.threadMetadataList = threadMetadataList;
    }
}
