package seveida.firetvforreddit.subreddit.domain.objects;

import android.net.Uri;

import java.util.Objects;

import androidx.annotation.NonNull;

public class ThreadMetadata {

    @NonNull public final Uri imageUrl;
    @NonNull public final String title;
    @NonNull public final String op;
    @NonNull public final Subreddit subreddit;
    @NonNull public final VoteCount voteCount;
    // TODO time created, what time class?
    public final int commentCount;

    public ThreadMetadata(@NonNull Uri imageUrl, @NonNull String title, @NonNull String op,
                          @NonNull Subreddit subreddit, @NonNull VoteCount voteCount,
                          int commentCount) {
        this.imageUrl = imageUrl;
        this.title = title;
        this.op = op;
        this.subreddit = subreddit;
        this.voteCount = voteCount;
        this.commentCount = commentCount;
    }
}
