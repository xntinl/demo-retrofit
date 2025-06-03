package com.global.demo.api;

import com.global.demo.github.User;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

/**
 * Retrofit interface used to access a subset of the Github REST API.
 */
public interface GithubApi {

    /**
     * Retrieves the list of users from Github.
     *
     * @return a call that when executed returns a list of {@link User}
     */
    @Headers({"Accept: application/json", "Content-type: application/json"})
    @GET("users")
    Call<List<User>> users();

}
