package seveida.firetvforreddit.subreddit.domain.objects;

import java.net.URI;
import java.text.DateFormat;
import java.util.List;

import androidx.annotation.NonNull;

public class UserDetails {


    @NonNull public final UserMetadata userMetadata;
    @NonNull public final URI avatar;
    @NonNull public final Integer karma;
    @NonNull public final DateFormat cakeDay;
    @NonNull public final List<Comment> commentList;

    public UserDetails(@NonNull UserMetadata userMetadata,
                       @NonNull URI avatar, @NonNull Integer karma,
                       @NonNull DateFormat cakeDay, @NonNull List<Comment> commentList) {
        this.userMetadata = userMetadata;
        this.avatar = avatar;
        this.karma = karma;
        this.cakeDay = cakeDay;
        this.commentList = commentList;
    }
}
