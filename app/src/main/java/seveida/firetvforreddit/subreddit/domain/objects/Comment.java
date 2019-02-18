package seveida.firetvforreddit.subreddit.domain.objects;

import java.text.DateFormat;

import androidx.annotation.NonNull;

public class Comment {

    @NonNull public final String commentId;
    @NonNull public final UserMetadata userMetadata;
    @NonNull public final VoteCount voteCount;
    @NonNull public final DateFormat created;
    @NonNull public final String content;

    public Comment(@NonNull String commentId, @NonNull UserMetadata userMetadata,
                   @NonNull VoteCount voteCount, @NonNull DateFormat created,
                   @NonNull String content) {
        this.commentId = commentId;
        this.userMetadata = userMetadata;
        this.voteCount = voteCount;
        this.created = created;
        this.content = content;
    }

}

