## Intent

The is movie ticker booking application based on microservice architecture

## Services


Real world example
* City Service: This Service deal with City related data.
```java
abstract class ICityContoller {

    @Operation(summary = "Get all city", description = "Get all the cities")
    @ApiResponses(
            value = {
                 @ApiResponse(responseCode = "200", description = "Accepted")
            }
    )
    @GetMapping("/v1/cities")
    abstract ResponseEntity<List<City>> getCities();
```
* Theater : This Service deal with Theater for a given city.
* Movie: This Service deal with Movie data for a given theater.
* Show: This Service deal with Show for a given movie.
* Seat: This Service deal with Show for a given show.
* booking: This Service deal with booking movie and manage movie.


## Technology Stack
![alt text](./images/Intimation.jpeg "Technology Stack")



