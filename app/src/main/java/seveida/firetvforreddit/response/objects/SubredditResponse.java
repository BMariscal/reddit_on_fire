package seveida.firetvforreddit.response.objects;

import com.squareup.moshi.Json;

public class SubredditResponse {

    @Json(name = "kind")
    public String kind;
    @Json(name = "data")
    public Data data;

    /**
     * No args constructor for use in serialization
     *
     */
    public SubredditResponse() {
    }

    /**
     *
     * @param data
     * @param kind
     */
    public SubredditResponse(String kind, Data data) {
        super();
        this.kind = kind;
        this.data = data;
    }

}
