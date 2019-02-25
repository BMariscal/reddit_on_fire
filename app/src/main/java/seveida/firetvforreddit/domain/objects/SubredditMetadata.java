package seveida.firetvforreddit.domain.objects;

import android.net.Uri;

import androidx.annotation.NonNull;

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

}
