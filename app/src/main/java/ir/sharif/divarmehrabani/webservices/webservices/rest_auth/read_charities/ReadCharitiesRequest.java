package webservices.rest_auth.read_charities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import ir.sharif.divarmehrabani.webservices.base.BaseRequest;

public class ReadCharitiesRequest extends BaseRequest {
    @Expose @SerializedName("filter")
    private String filter;
    @Expose @SerializedName("offset")
    private int offset;
    @Expose @SerializedName("pageNumber")
    private int pageNumber;
    @Expose @SerializedName("pageSize")
    private int pageSize;
    @Expose @SerializedName("paged")
    private Boolean paged;
    @Expose @SerializedName("sort.sorted")
    private Boolean sort.sorted;
    @Expose @SerializedName("sort.unsorted")
    private Boolean sort.unsorted;
    @Expose @SerializedName("unpaged")
    private Boolean unpaged;

    public ReadCharitiesRequest(String filter, int offset, int pageNumber, int pageSize, Boolean paged, Boolean sort, Boolean sort1, Boolean unpaged) {
        this.filter = filter;
        this.offset = offset;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.paged = paged;
        this.sort = sort;
        this.sort = sort1;
        this.unpaged = unpaged;
    }
}
