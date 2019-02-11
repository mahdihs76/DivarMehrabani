package ir.sharif.divarmehrabani.webservices.base;

import ir.sharif.divarmehrabani.webservices.webservices.rest_auth.register.RegisterRequest;
import ir.sharif.divarmehrabani.webservices.webservices.rest_auth.register.RegisterResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import webservices.rest_auth.create_request.CreateRequestRequest;
import webservices.rest_auth.create_request.CreateRequestResponse;
import webservices.rest_auth.login.LoginRequest;
import webservices.rest_auth.login.LoginResponse;
import webservices.rest_auth.read_charities.ReadCharitiesRequest;
import webservices.rest_auth.read_charities.ReadCharitiesResponse;
import webservices.rest_auth.signup.SignupRequest;
import webservices.rest_auth.signup.SignupResponse;

public interface WebserviceUrls {

    @POST(WebserviceAdresses.VOLUNTEER_REGISTER)
    Call<RegisterResponse> register(@Body RegisterRequest request);


    @POST(WebserviceAdresses.VOLUNTEER_LOGIN)
    Call<LoginResponse> Login(@Body LoginRequest request);

    @POST(WebserviceAdresses.VOLUNTEER_SIGNUP)
    Call<SignupResponse> signup(@Body SignupRequest request);

    @GET(WebserviceAdresses.VOLUNTEER_READ_CHARITIES)
    Call<ReadCharitiesResponse> raadcharities(@Body ReadCharitiesRequest request);

    @POST(WebserviceAdresses.VOLUNTEER_CREATE_REQUEST)
    Call<CreateRequestResponse> createRequest(@Body CreateRequestRequest request);

}
