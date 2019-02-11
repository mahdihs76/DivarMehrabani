package ir.sharif.divarmehrabani.webservices.base;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static ir.sharif.divarmehrabani.webservices.base.WebserviceAdresses.BASE_URL;

public class MyRetrofit {

    private static MyRetrofit instance;

    public static MyRetrofit getInstance() {
        if (instance == null) {
            instance = new MyRetrofit();
        }
        return instance;
    }

    WebserviceUrls urls;

    public WebserviceUrls getWebserviceUrls() {
        if (urls == null) {
            urls = getUrls();
        }

        return urls;
    }


    private WebserviceUrls getUrls() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        OkHttpClient.Builder builder = new OkHttpClient.Builder();

        addLogginInterceptor(builder);
        addAuthHeader(builder);

        OkHttpClient client = builder.build();


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(client)
                .build();
        return retrofit.create(WebserviceUrls.class);
    }

    private void addLogginInterceptor(OkHttpClient.Builder client) {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        client.addInterceptor(interceptor);
    }

    private void addAuthHeader(OkHttpClient.Builder client) {
//        if (WebservicePrefSetting.getInstanceWithoutContext().isRegister()) {
//            client.addInterceptor(new Interceptor() {
//                @Override
//                public Response intercept(Interceptor.Chain chain) throws IOException {
//                    Request original = chain.request();
//                    Request request = original.newBuilder()
//                            .addHeader("Authorization", getToken())
//                            .build();
//
//                    return chain.proceed(request);
//                }
//            });
//        }
    }

    private String getToken() {
//        String key = WebservicePrefSetting.getInstanceWithoutContext().getToken();
//        System.out.println("WSToken -> " + " token " + key);
        return "token " ;
    }

}
