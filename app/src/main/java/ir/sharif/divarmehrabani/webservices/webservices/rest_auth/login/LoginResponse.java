package webservices.rest_auth.login;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import ir.sharif.divarmehrabani.webservices.base.BaseResponse;

public class LoginResponse extends BaseResponse {
    @Expose
    @SerializedName("success")
    private Boolean success;


    public LoginResponse(Boolean success) {
        this.success = success;
    }

    public Boolean getSuccess() {
        return success;
    }
}
