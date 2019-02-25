package seveida.firetvforreddit.response.objects;

import java.util.List;
import com.squareup.moshi.Json;

public class Image {

    @Json(name = "source")
    public Source source;
    @Json(name = "resolutions")
    public List<Resolution> resolutions = null;
    @Json(name = "variants")
    public Variants variants;
    @Json(name = "id")
    public String id;

    /**
     * No args constructor for use in serialization
     *
     */
    public Image() {
    }

    /**
     *
     * @param id
     * @param source
     * @param variants
     * @param resolutions
     */
    public Image(Source source, List<Resolution> resolutions, Variants variants, String id) {
        super();
        this.source = source;
        this.resolutions = resolutions;
        this.variants = variants;
        this.id = id;
    }

}
