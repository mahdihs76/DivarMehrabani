package webservices.rest_auth.read_charities;

import ir.sharif.divarmehrabani.webservices.base.BaseProcess;
import ir.sharif.divarmehrabani.webservices.base.MyRetrofit;
import ir.sharif.divarmehrabani.webservices.base.WebserviceException;
import retrofit2.Call;

import java.io.IOException;

public class ReadCharitiesProcess extends BaseProcess {
    private ReadCharitiesRequest request;

    public ReadCharitiesProcess(String filter, int offset, int pageNumber, int pageSize, Boolean paged, Boolean sort, Boolean sort1, Boolean unpaged) {
        this.request = new ReadCharitiesRequest(filter, offset, pageNumber, pageSize, paged, sort, sort1, unpaged);
    }

    @Override
    public ReadCharitiesResponse process() throws IOException, WebserviceException {
        Call<ReadCharitiesResponse> register = MyRetrofit.getInstance().getWebserviceUrls().raadcharities(request);
        return send(register);
    }
}