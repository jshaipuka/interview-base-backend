# Interview Base Back End
Awesome description is coming soon. Really.

## Parameters to run the application
`-Ddb.url=jdbc:mysql://localhost:3306/sandbox -Ddb.username=root -Ddb.password=root`, where URL, username and password are ones of a running MySQL database.

## cURL command to create a notification
```bash
curl -v -H "Content-Type: application/json" --data '{"type":"Some Type", "name":"Some Name"}' http://localhost:8080/notifications
```
