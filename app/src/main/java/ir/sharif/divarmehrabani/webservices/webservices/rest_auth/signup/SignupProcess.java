package webservices.rest_auth.signup;

import ir.sharif.divarmehrabani.webservices.base.BaseProcess;
import ir.sharif.divarmehrabani.webservices.base.MyRetrofit;
import ir.sharif.divarmehrabani.webservices.base.WebserviceException;
import retrofit2.Call;

import java.io.IOException;
import java.util.List;

public class SignupProcess extends BaseProcess {
    private SignupRequest request;

    public SignupProcess(int age, String city, int district, String gender, String interests, String name, String phone, List<String> professions, String province) {
        this.request = new SignupRequest(age,city,district,gender,interests,name,phone,professions,province);
    }

    @Override
    public SignupResponse process() throws IOException, WebserviceException {
        Call<SignupResponse> Signup = MyRetrofit.getInstance().getWebserviceUrls().signup(request);
        return send(Login);
    }
}