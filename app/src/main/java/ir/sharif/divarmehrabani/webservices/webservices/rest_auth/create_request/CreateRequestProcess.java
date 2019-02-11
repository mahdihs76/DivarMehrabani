package webservices.rest_auth.create_request;

import ir.sharif.divarmehrabani.webservices.base.BaseProcess;
import ir.sharif.divarmehrabani.webservices.base.MyRetrofit;
import ir.sharif.divarmehrabani.webservices.base.WebserviceException;
import retrofit2.Call;

import java.io.IOException;

public class CreateRequestProcess extends BaseProcess {
    private CreateRequestRequest request;

    public CreateRequestProcess(int charityId, String description, String state, int volunteerId) {
        this.request = new CreateRequestRequest(charityId, description, state, volunteerId);
    }

    @Override
    public CreateRequestResponse process() throws IOException, WebserviceException {
        Call<CreateRequestResponse> register = MyRetrofit.getInstance().getWebserviceUrls().raadcharities(request);
        return send(register);
    }
}