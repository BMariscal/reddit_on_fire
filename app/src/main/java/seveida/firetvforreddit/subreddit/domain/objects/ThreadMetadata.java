package seveida.firetvforreddit.subreddit.domain.objects;

import android.net.Uri;


import java.time.LocalDateTime;

import androidx.annotation.NonNull;

public class ThreadMetadata {

    @NonNull public final Integer threadId;
    @NonNull public final Uri imageUrl;
    @NonNull public final String title;
    @NonNull public final String op;
    @NonNull public final VoteCount voteCount;
    @NonNull public final LocalDateTime created;
    public final int commentCount;

    public ThreadMetadata(@NonNull Integer threadId, @NonNull Uri imageUrl,
                          @NonNull String title, @NonNull String op,
                          @NonNull VoteCount voteCount, @NonNull LocalDateTime created,
                          int commentCount) {
        this.threadId = threadId;
        this.imageUrl = imageUrl;
        this.title = title;
        this.op = op;
        this.voteCount = voteCount;
        this.created = created;
        this.commentCount = commentCount;
    }


}
