package webservices.rest_auth.create_request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import ir.sharif.divarmehrabani.webservices.base.BaseRequest;

public class CreateRequestRequest extends BaseRequest {
    @Expose @SerializedName("charityId")
    private int charityId;
    @Expose @SerializedName("description")
    private String description;
    @Expose @SerializedName("state")
    private String state;
    @Expose @SerializedName("volunteerId")
    private int volunteerId;


    public CreateRequestRequest(int charityId, String description, String state, int volunteerId) {
        this.charityId = charityId;
        this.description = description;
        this.state = state;
        this.volunteerId = volunteerId;
    }
}
