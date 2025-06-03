package com.global.demo.api;

import com.global.demo.github.User;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;
import java.util.Map;

/**
 * Retrofit interface for a few endpoints of the Rick and Morty API.
 */
public interface RickAndMortyApi {

    /**
     * Retrieves a page of characters from the API.
     *
     * @param page the page number to request
     * @return a call returning a map containing the API response
     */
    @Headers({"Accept: application/json", "Content-type: application/json"})
    @GET("character")
    Call<Map<String, Object>> allCharacters(@Query("page") int page);

    /**
     * Retrieves a single character by its identifier.
     *
     * @param id character identifier
     * @return a call returning a map with the character data
     */
    @Headers({"Accept: application/json", "Content-type: application/json"})
    @GET("character/{id}")
    Call<Map<String, Object>> singleCharacter(@Path(value = "id") int id);
}
