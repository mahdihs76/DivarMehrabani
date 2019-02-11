package ir.sharif.divarmehrabani.webservices.webservices.rest_auth.register;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import ir.sharif.divarmehrabani.webservices.base.BaseRequest;

public class RegisterRequest extends BaseRequest {
    @Expose @SerializedName("name")
    private String name;
    @Expose @SerializedName("email")
    private String email;
    @Expose @SerializedName("password")
    private String password;
    @Expose @SerializedName("lastName")
    private String lastName;

    public RegisterRequest(String name, String email, String password, String lastName) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.lastName = lastName;
    }
}
