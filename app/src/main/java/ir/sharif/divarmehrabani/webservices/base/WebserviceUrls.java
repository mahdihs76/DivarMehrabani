package ir.sharif.divarmehrabani.webservices.base;

import ir.sharif.divarmehrabani.webservices.webservices.rest_auth.register.RegisterRequest;
import ir.sharif.divarmehrabani.webservices.webservices.rest_auth.register.RegisterResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import webservices.rest_auth.login.LoginRequest;
import webservices.rest_auth.login.LoginResponse;

public interface WebserviceUrls {

    @POST(WebserviceAdresses.VOLUNTEER_REGISTER)
    Call<RegisterResponse> register(@Body RegisterRequest request);


    @POST(WebserviceAdresses.VOLUNTEER_LOGIN)
    Call<LoginResponse> Login(@Body LoginRequest request);


}
