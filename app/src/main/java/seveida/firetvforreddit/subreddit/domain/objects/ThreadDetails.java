package seveida.firetvforreddit.subreddit.domain.objects;


import java.util.List;

import androidx.annotation.NonNull;

public class ThreadDetails {

    @NonNull public final ThreadMetadata threadMetadata;
    @NonNull public final String content;
    @NonNull public final List<Comment> commentList;
    public final int commentCount;

    public ThreadDetails(@NonNull ThreadMetadata threadMetadata,
                         @NonNull String content, @NonNull List<Comment> commentList,
                         int commentCount) {
        this.threadMetadata = threadMetadata;
        this.content = content;
        this.commentList = commentList;
        this.commentCount = commentCount;
    }
}
