# Demo Retrofit Spring Boot

This project demonstrates the use of Retrofit clients in a Spring Boot application. It defines two REST clients to consume both the Github API and the Rick and Morty API using the `retrofit` library.

## Building

The project uses Maven. To build the application run:

```bash
mvn package
```

## Running

Run the application with:

```bash
mvn spring-boot:run
```

Once started, the following endpoints will be available:

- `GET /users` &ndash; returns a list of Github users using the Github API.
- `GET /characters` &ndash; returns the second page of characters from the Rick and Morty API.
- `GET /characters/id` &ndash; returns data for character `2` from the Rick and Morty API.

## Configuration

The host URLs and timeout settings for the clients are configured in `src/main/resources/application.yaml`.

---

Generated as part of repository documentation.

