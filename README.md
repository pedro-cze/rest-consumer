# rest-consumer

Once the application is started it tries to fetch a collection of Loans
from "https://api.zonky.cz/loans/marketplace" using the Spring Boot's RestController.

After successful call it prints fetched Loans into the console.

The process of fetching current Loans is repeated every five minutes.