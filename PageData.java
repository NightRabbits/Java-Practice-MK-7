import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PageData {

    @SerializedName("page")
    @Expose
    private int page;

    @SerializedName("perPage")
    @Expose
    private int perPage;

    @SerializedName("totalCount")
    @Expose
    private int totalCount;

    @SerializedName("currentCount")
    @Expose
    private int currentCount;

    @SerializedName("data")
    @Expose
    private DrinkData[] data;


    public int getPage() {
        return page;
    }

    public int getPerPage() {
        return perPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public int getCurrentCount() {
        return currentCount;
    }

    public DrinkData[] getData() {
        return data;
    }
}
