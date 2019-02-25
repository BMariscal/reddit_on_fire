package seveida.firetvforreddit.domain.objects;

import android.net.Uri;

import androidx.annotation.NonNull;
import seveida.firetvforreddit.response.objects.SubredditResponse;

public class SubredditMetadata {

    @NonNull public final Uri urlPath;
    @NonNull public final Uri avatarImage;
    @NonNull public final String subredditId;
    @NonNull public final String displayName;

    public SubredditMetadata(@NonNull Uri urlPath, @NonNull Uri avatarImage,
                             @NonNull String subredditId, @NonNull String displayName) {
        this.urlPath = urlPath;
        this.avatarImage = avatarImage;
        this.subredditId = subredditId;
        this.displayName = displayName;
    }

    static SubredditMetadata fromResponse(SubredditResponse response) {
        String subredditName = response.data.children.get(0).data.subreddit;
        String subredditId = response.data.after;

        Uri urlPath = Uri.parse("www.example.com"); // TODO
        Uri image = Uri.parse("www.example.com"); // TODO

        return new SubredditMetadata(urlPath, image, subredditId, subredditName);
    }
}
