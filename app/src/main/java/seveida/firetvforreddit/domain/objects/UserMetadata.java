package seveida.firetvforreddit.domain.objects;

import androidx.annotation.NonNull;

public class UserMetadata {

    @NonNull public final String userId;
    @NonNull public final String username;

    public UserMetadata(@NonNull String userId, @NonNull String username) {
        this.userId = userId;
        this.username = username;
    }

}
