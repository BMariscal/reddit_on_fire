package seveida.firetvforreddit.subreddit.domain.objects;

import android.net.Uri;

import androidx.annotation.NonNull;

public class SubredditMetadata {

    @NonNull public final Uri url_path;
    @NonNull public final Uri avatar;
    @NonNull public final String subredditId;
    @NonNull public final String name;

    public SubredditMetadata(@NonNull Uri url_path, @NonNull Uri avatar,
                             @NonNull String subredditId, @NonNull String name) {
        this.url_path = url_path;
        this.avatar = avatar;
        this.subredditId = subredditId;
        this.name = name;
    }

}
