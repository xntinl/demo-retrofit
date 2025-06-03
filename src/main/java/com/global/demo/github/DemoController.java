package com.global.demo.github;

import com.global.demo.api.GithubApi;
import com.global.demo.api.RickAndMortyApi;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

import java.util.List;
import java.util.Map;

/**
 * Simple REST controller exposing endpoints that proxy calls to external APIs.
 */
@RestController
@RequiredArgsConstructor
public class DemoController {

    private final GithubApi githubApi;
    private final RickAndMortyApi rickAndMortyApi;


    /**
     * Fetches a list of Github users.
     */
    @GetMapping("/users")
    List<User> get() throws IOException {
        return githubApi.users().execute().body();
    }

    /**
     * Returns a paginated list of characters from the Rick and Morty API.
     */
    @GetMapping("/characters")
    Map<String, Object> allCharacters() throws IOException {
        return rickAndMortyApi.allCharacters(2).execute().body();
    }

    /**
     * Returns a single character with a fixed identifier from the Rick and
     * Morty API.
     */
    @GetMapping("/characters/id")
    Map<String, Object> singleCharacter() throws IOException {
        return rickAndMortyApi.singleCharacter(2).execute().body();
    }
}
