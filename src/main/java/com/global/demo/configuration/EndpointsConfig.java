package com.global.demo.configuration;

import lombok.Getter;
import lombok.Setter;
import okhttp3.logging.HttpLoggingInterceptor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class that exposes {@link Endpoint} beans for the different
 * remote services consumed by this application. The values are bound from the
 * {@code application.yaml} configuration file.
 */
@Configuration
public class EndpointsConfig {

    /**
     * Endpoint configuration for the Github API client.
     *
     * @return populated {@link Endpoint} instance
     */
    @Bean
    @ConfigurationProperties(prefix = "http-client.github.users")
    public Endpoint githubEndpoint() {
        return new Endpoint();
    }

    /**
     * Endpoint configuration for the Rick and Morty API client.
     *
     * @return populated {@link Endpoint} instance
     */
    @Bean
    @ConfigurationProperties(prefix = "http-client.rickandmortyapi.api")
    public Endpoint rickandmortyEndpoint() {
        return new Endpoint();
    }

    /**
     * Simple POJO that holds the configuration properties for each remote
     * endpoint used by the Retrofit clients.
     */
    @Getter
    @Setter
    public static class Endpoint {
        /** Base URL for the service. */
        private String baseUrl;
        /** Connection timeout in seconds. */
        private long connectTimeout;
        /** Read timeout in seconds. */
        private long readTimeout;
        /** Logging level for Retrofit's HTTP logging interceptor. */
        private HttpLoggingInterceptor.Level loggingLevel;
    }
}
