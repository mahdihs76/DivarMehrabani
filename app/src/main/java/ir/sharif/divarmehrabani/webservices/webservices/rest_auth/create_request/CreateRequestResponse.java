package webservices.rest_auth.create_request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import ir.sharif.divarmehrabani.webservices.base.BaseResponse;

public class CreateRequestResponse extends BaseResponse {
    @Expose @SerializedName("charityId")
    private int charityId;
    @Expose @SerializedName("description")
    private String description;
    @Expose @SerializedName("state")
    private String state;
    @Expose @SerializedName("volunteerId")
    private int volunteerId;

    public CreateRequestResponse(int charityId, String description, String state, int volunteerId) {
        this.charityId = charityId;
        this.description = description;
        this.state = state;
        this.volunteerId = volunteerId;
    }

    public int getCharityId() {
        return charityId;
    }

    public String getDescription() {
        return description;
    }

    public String getState() {
        return state;
    }

    public int getVolunteerId() {
        return volunteerId;
    }
}
