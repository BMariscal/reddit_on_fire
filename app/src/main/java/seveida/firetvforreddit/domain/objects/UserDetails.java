package seveida.firetvforreddit.domain.objects;

import android.net.Uri;

import org.threeten.bp.LocalDateTime;

import java.util.List;

import androidx.annotation.NonNull;

public class UserDetails {


    @NonNull public final UserMetadata userMetadata;
    @NonNull public final Uri avatar;
    @NonNull public final Integer karma;
    @NonNull public final LocalDateTime cakeDay;
    @NonNull public final List<Comment> commentsMade;

    public UserDetails(@NonNull UserMetadata userMetadata,
                       @NonNull Uri avatar, @NonNull Integer karma,
                       @NonNull LocalDateTime cakeDay, @NonNull List<Comment> commentsMade) {
        this.userMetadata = userMetadata;
        this.avatar = avatar;
        this.karma = karma;
        this.cakeDay = cakeDay;
        this.commentsMade = commentsMade;
    }
}
