package seveida.firetvforreddit.subreddit.domain.objects;

import androidx.annotation.NonNull;

public class VoteCount {

    @NonNull public final Integer up;
    @NonNull public final Integer down;

    public VoteCount(@NonNull Integer up, @NonNull Integer down) {
        this.up = up;
        this.down = down;
    }

}
