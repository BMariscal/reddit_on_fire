package seveida.firetvforreddit.domain.objects;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import seveida.firetvforreddit.response.objects.Child;
import seveida.firetvforreddit.response.objects.SubredditResponse;

public class SubredditDetails {

    @NonNull public final SubredditMetadata subredditMetadata;
    @NonNull public final List<ThreadMetadata> threadMetadataList;

    public SubredditDetails(@NonNull SubredditMetadata subredditMetadata,
                            @NonNull List<ThreadMetadata> threadMetadataList) {
        this.subredditMetadata = subredditMetadata;
        this.threadMetadataList = threadMetadataList;
    }

    public static SubredditDetails fromResponse(SubredditResponse response) {
        SubredditMetadata metadata = SubredditMetadata.fromResponse(response);

        List<ThreadMetadata> threads = new ArrayList<>(25);
        for (Child child : response.data.children) {
            threads.add(ThreadMetadata.fromResponse(child));
        }

        return new SubredditDetails(metadata, threads);
    }
}
