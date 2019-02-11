package webservices.rest_auth.login;

import ir.sharif.divarmehrabani.webservices.base.BaseProcess;
import ir.sharif.divarmehrabani.webservices.base.MyRetrofit;
import ir.sharif.divarmehrabani.webservices.base.WebserviceException;
import retrofit2.Call;

import java.io.IOException;

public class LoginProcess extends BaseProcess {
    private LoginRequest request;

    public LoginProcess(Boolean success) {
        this.request = new LoginRequest(success);
    }

    @Override
    public LoginResponse process() throws IOException, WebserviceException {
        Call<LoginResponse> Login = MyRetrofit.getInstance().getWebserviceUrls().Login(request);
        return send(Login);
    }
}
