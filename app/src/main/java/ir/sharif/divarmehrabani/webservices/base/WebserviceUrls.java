package ir.sharif.divarmehrabani.webservices.base;

import ir.sharif.divarmehrabani.webservices.webservices.rest_auth.register.RegisterRequest;
import ir.sharif.divarmehrabani.webservices.webservices.rest_auth.register.RegisterResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface WebserviceUrls {

    @POST(WebserviceAdresses.VOLUNTEER_REGISTER)
    Call<RegisterResponse> register(@Body RegisterRequest request);

}
