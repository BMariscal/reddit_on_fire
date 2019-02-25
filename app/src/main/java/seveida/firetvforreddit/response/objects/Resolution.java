package seveida.firetvforreddit.response.objects;

import com.squareup.moshi.Json;

public class Resolution {

    @Json(name = "url")
    public String url;
    @Json(name = "width")
    public int width;
    @Json(name = "height")
    public int height;

    /**
     * No args constructor for use in serialization
     *
     */
    public Resolution() {
    }

    /**
     *
     * @param height
     * @param width
     * @param url
     */
    public Resolution(String url, int width, int height) {
        super();
        this.url = url;
        this.width = width;
        this.height = height;
    }

}
