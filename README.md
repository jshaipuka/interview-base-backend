# Interview Base Back End
Awesome description is coming soon. Really.

## Parameters to run the application
`-Ddb.url=jdbc:postgresql://localhost:5432/interview_base -Ddb.username=root -Ddb.password=root`, where URL, username and password are ones of a running PostgreSQL database.

## cURL commands

### Get interviews
```bash
curl -v http://localhost:8080/api/interviews
```

### Get questions from the particular interview
```bash
curl -v http://localhost:8080/api/interviews/1/questions
```
