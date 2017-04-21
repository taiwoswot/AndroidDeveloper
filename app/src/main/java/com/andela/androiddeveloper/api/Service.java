package com.andela.androiddeveloper.api;

        import com.andela.androiddeveloper.model.ItemResponse;

        import retrofit2.Call;
        import retrofit2.http.GET;

/**
 * Created by Taiwo-Divine on 21/04/2017.
 */

public interface Service {
    @GET("/search/users?q=location:lagos+language:developer")
    Call<ItemResponse> getItems();
}
