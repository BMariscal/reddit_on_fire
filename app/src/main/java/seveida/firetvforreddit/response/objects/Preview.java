package seveida.firetvforreddit.response.objects;

import java.util.List;
import com.squareup.moshi.Json;

public class Preview {

    @Json(name = "images")
    public List<Image> images = null;
    @Json(name = "enabled")
    public boolean enabled;

    /**
     * No args constructor for use in serialization
     *
     */
    public Preview() {
    }

    /**
     *
     * @param enabled
     * @param images
     */
    public Preview(List<Image> images, boolean enabled) {
        super();
        this.images = images;
        this.enabled = enabled;
    }

}
