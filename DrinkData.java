import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DrinkData {
    @SerializedName("전통주명")
    @Expose
    private String name;

    @SerializedName("도수")
    @Expose
    private String level;

    @SerializedName("규격")
    @Expose
    private String size;

    @SerializedName("주원료")
    @Expose
    private String ingre;

    @SerializedName("제조사")
    @Expose
    private String manufacture;

    public String getName() {
        return name;
    }

    public String getLevel() {
        return level;
    }

    public String getSize() {
        return size;
    }

    public String getIngre() {
        return ingre;
    }

    public String getManufacture() {
        return manufacture;
    }
}
