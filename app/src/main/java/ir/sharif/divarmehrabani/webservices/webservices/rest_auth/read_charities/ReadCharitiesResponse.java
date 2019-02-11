package webservices.rest_auth.read_charities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import ir.sharif.divarmehrabani.webservices.base.BaseResponse;

public class ReadCharitiesResponse extends BaseResponse {
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
    private Boolean sort_sorted;
    @Expose @SerializedName("sort.unsorted")
    private Boolean sort_unsorted;
    @Expose @SerializedName("unpaged")
    private Boolean unpaged;

    public ReadCharitiesResponse(String filter, int offset, int pageNumber, int pageSize, Boolean paged, Boolean sort, Boolean sort1, Boolean unpaged) {
        this.filter = filter;
        this.offset = offset;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.paged = paged;
        this.sort_sorted = sort;
        this.sort_unsorted = sort1;
        this.unpaged = unpaged;
    }


    public String getFilter() {
        return filter;
    }

    public int getOffset() {
        return offset;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public Boolean getPaged() {
        return paged;
    }

    public Boolean getSort_sorted() {
        return sort_sorted;
    }

    public Boolean getSort_unsorted() {
        return sort_unsorted;
    }

    public Boolean getUnpaged() {
        return unpaged;
    }

    public String getDescription() {
        return description;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAgeLowerBound() {
        return ageLowerBound;
    }

    public int getAgeUpperBound() {
        return ageUpperBound;
    }

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }

    public int getDistrict() {
        return district;
    }

    public Timestamp getDeadLine() {
        return deadLine;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public Set<String> getProfessions() {
        return professions;
    }

    public Integer getFoundationId() {
        return foundationId;
    }

    public long getNumWeeks() {
        return numWeeks;
    }

    public String getSchedule() {
        return schedule;
    }

    public Integer getCharityId() {
        return charityId;
    }

    @Expose @SerializedName("description")
    private String description;
    @Expose @SerializedName("gender")
    private Gender gender;
    @Expose @SerializedName("ageLowerBound")
    private int ageLowerBound;
    @Expose @SerializedName("ageUpperBound")
    private int ageUpperBound;
    @Expose @SerializedName("province")
    private String province;
    @Expose @SerializedName("city")
    private String city;
    @Expose @SerializedName("district")
    private int district;
    @Expose @SerializedName("deadLine")
    private Timestamp deadLine;
    @Expose @SerializedName("startTime")
    private Timestamp startTime;
    @Expose @SerializedName("professions")
    private Set<String> professions;
    @Expose @SerializedName("foundationId")
    private Integer foundationId;
    @Expose @SerializedName("numWeeks")
    private long numWeeks;
    @Expose @SerializedName("schedule")
    private String schedule;
    @Expose @SerializedName("charityId")
    private Integer charityId;



}
