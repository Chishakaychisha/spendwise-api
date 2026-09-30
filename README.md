# SpendWise API

A Spring Boot REST API for personal-finance transactions. Built as the backend companion to SpendWise Web.

## Highlights

- Spring Boot REST controller design
- JPA entity and repository persistence
- Jakarta request validation
- CORS enabled for a separate React frontend
- H2 in-memory database for quick local development

## Run

```bash
./gradlew bootRun
```

The API starts on `http://localhost:8080`.

## Endpoints

| Method | Endpoint | Purpose |
| --- | --- | --- |
| `GET` | `/api/transactions` | List transactions |
| `POST` | `/api/transactions` | Create transaction |
| `DELETE` | `/api/transactions/{id}` | Delete transaction |

Example body:

```json
{"name":"Groceries","category":"Food","amount":84.20}
```

## Roadmap

PostgreSQL, authentication, user ownership, pagination, spending summaries, OpenAPI documentation, and service-layer tests.

**Stack:** Java 21 · Spring Boot · Spring Data JPA · H2 · Gradle
