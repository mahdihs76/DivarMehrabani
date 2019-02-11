package webservices.rest_auth.login;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import ir.sharif.divarmehrabani.webservices.base.BaseRequest;

public class LoginRequest extends BaseRequest {
    @Expose @SerializedName("success")
    private Boolean success;


    public LoginRequest(Boolean success) {
        this.success = success;
    }
}
