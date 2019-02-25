package seveida.firetvforreddit.domain.objects;

import org.threeten.bp.LocalDateTime;

import java.util.List;

import androidx.annotation.NonNull;

public class Comment {

    @NonNull public final String commentId;
    @NonNull public final UserMetadata userMetadata;
    @NonNull public final VoteCount voteCount;
    @NonNull public final LocalDateTime created;
    @NonNull public final String content;
    @NonNull public final List<Comment> childComments;

    public Comment(@NonNull String commentId, @NonNull UserMetadata userMetadata,
                   @NonNull VoteCount voteCount, @NonNull LocalDateTime created,
                   @NonNull String content, @NonNull List<Comment> childComments) {
        this.commentId = commentId;
        this.userMetadata = userMetadata;
        this.voteCount = voteCount;
        this.created = created;
        this.content = content;
        this.childComments = childComments;
    }

}

