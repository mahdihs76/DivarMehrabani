package ir.sharif.divarmehrabani.webservices.webservices.rest_auth.register;

import ir.sharif.divarmehrabani.webservices.base.BaseProcess;
import ir.sharif.divarmehrabani.webservices.base.MyRetrofit;
import ir.sharif.divarmehrabani.webservices.base.WebserviceException;
import retrofit2.Call;

import java.io.IOException;

public class RegisterProcess extends BaseProcess {
    private RegisterRequest request;

    public RegisterProcess(String name, String email, String password, String lastName) {
        this.request = new RegisterRequest(name, email, password, lastName);
    }

    @Override
    public RegisterResponse process() throws IOException, WebserviceException {
        Call<RegisterResponse> register = MyRetrofit.getInstance().getWebserviceUrls().register(request);
        return send(register);
    }
}
