package hhan.fiserv.com.retrofitproject.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by hhan on 2/05/17.
 */

public class ApiClient {
    // Base url for the service
    public static final String BASE_URL = "http://api.themoviedb.org/3";
    private static Retrofit retrofit = null;

    public static Retrofit getClient(){
         if (retrofit == null) {
             retrofit = new Retrofit.Builder()
                     .baseUrl(BASE_URL)
                     .addConverterFactory(GsonConverterFactory.create())
                     .build();
         }

        return retrofit;

    }
}
