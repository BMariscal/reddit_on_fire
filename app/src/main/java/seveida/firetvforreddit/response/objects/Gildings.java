package seveida.firetvforreddit.response.objects;

import com.squareup.moshi.Json;

public class Gildings {

    @Json(name = "gid_1")
    public int gid1;
    @Json(name = "gid_2")
    public int gid2;
    @Json(name = "gid_3")
    public int gid3;

    /**
     * No args constructor for use in serialization
     *
     */
    public Gildings() {
    }

    /**
     *
     * @param gid1
     * @param gid3
     * @param gid2
     */
    public Gildings(int gid1, int gid2, int gid3) {
        super();
        this.gid1 = gid1;
        this.gid2 = gid2;
        this.gid3 = gid3;
    }

}
