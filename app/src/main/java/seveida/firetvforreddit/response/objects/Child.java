package seveida.firetvforreddit.response.objects;

import com.squareup.moshi.Json;

public class Child {

    @Json(name = "kind")
    public String kind;
    @Json(name = "data")
    public Data_ data;

    /**
     * No args constructor for use in serialization
     *
     */
    public Child() {
    }

    /**
     *
     * @param data
     * @param kind
     */
    public Child(String kind, Data_ data) {
        super();
        this.kind = kind;
        this.data = data;
    }

}
