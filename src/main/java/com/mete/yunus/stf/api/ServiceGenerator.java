
package com.mete.yunus.stf.api;

import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.client.OkClient;

import com.squareup.okhttp.OkHttpClient;

/**
 * Created by yunusm on 07.11.2016.
 */
public class ServiceGenerator {

   public static String               API_BASE_URL = "localhost:7100/api/v1";

   private static RestAdapter.Builder builder      = new RestAdapter.Builder().setEndpoint(API_BASE_URL)
                                                                              .setClient(new OkClient(new OkHttpClient()));

   public static <S> S createService(Class<S> serviceClass, final String baseURL, final String accessToken) {
      if (accessToken != null) {
         builder.setEndpoint(baseURL).setRequestInterceptor(new RequestInterceptor() {
            public void intercept(RequestFacade requestFacade) {
               requestFacade.addHeader("Authorization", "Bearer " + accessToken);
            }
         });
      }

      RestAdapter adapter = builder.build();
      return adapter.create(serviceClass);
   }
}
