package seveida.firetvforreddit.response.objects;

import java.util.List;
import com.squareup.moshi.Json;

public class Data {

    @Json(name = "modhash")
    public String modhash;
    @Json(name = "dist")
    public int dist;
    @Json(name = "children")
    public List<Child> children = null;
    @Json(name = "after")
    public String after;
    @Json(name = "before")
    public Object before;

    /**
     * No args constructor for use in serialization
     *
     */
    public Data() {
    }

    /**
     *
     * @param after
     * @param before
     * @param children
     * @param modhash
     * @param dist
     */
    public Data(String modhash, int dist, List<Child> children, String after, Object before) {
        super();
        this.modhash = modhash;
        this.dist = dist;
        this.children = children;
        this.after = after;
        this.before = before;
    }

}
