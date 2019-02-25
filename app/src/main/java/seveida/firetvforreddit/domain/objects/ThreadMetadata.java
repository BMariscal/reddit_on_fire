package seveida.firetvforreddit.domain.objects;

import android.net.Uri;


import org.threeten.bp.Instant;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;

import androidx.annotation.NonNull;
import seveida.firetvforreddit.response.objects.Child;
import seveida.firetvforreddit.response.objects.Data_;

public class ThreadMetadata {

    @NonNull public final String threadId;
    @NonNull public final Uri previewImageUrl;
    @NonNull public final String title;
    @NonNull public final UserMetadata op;
    @NonNull public final VoteCount voteCount;
    @NonNull public final LocalDateTime created;
    public final int commentCount;

    public ThreadMetadata(@NonNull String threadId, @NonNull Uri previewImageUrl,
                          @NonNull String title, @NonNull UserMetadata op,
                          @NonNull VoteCount voteCount, @NonNull LocalDateTime created,
                          int commentCount) {
        this.threadId = threadId;
        this.previewImageUrl = previewImageUrl;
        this.title = title;
        this.op = op;
        this.voteCount = voteCount;
        this.created = created;
        this.commentCount = commentCount;
    }

    static ThreadMetadata fromResponse(Child response) {
        Data_ data = response.data;

        String id = data.id;
        Uri imageUri = Uri.parse(data.thumbnail);
        String title = data.title;

        String opName = data.author;
        String opId = data.authorFullname;
        UserMetadata op = new UserMetadata(opId, opName);

        VoteCount voteCount = new VoteCount(data.ups, data.downs);

        LocalDateTime created = Instant.ofEpochMilli(data.created).atZone(ZoneId.systemDefault()).toLocalDateTime();
        int commentCount = data.numComments;
        return new ThreadMetadata(id, imageUri, title, op, voteCount, created, commentCount);
    }

}
