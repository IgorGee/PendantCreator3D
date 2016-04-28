package xyz.igorgee.Api;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import xyz.igorgee.Api.Cart.Cart;
import xyz.igorgee.Api.Model.ModelResponse;
import xyz.igorgee.utilities.ModelToUpload;

public interface ServerInterface {
    @GET("cart")
    Call<Cart> getCart();

    @POST("model")
    Call<ModelResponse> uploadToShop(@Body ModelToUpload modelToUpload);
}