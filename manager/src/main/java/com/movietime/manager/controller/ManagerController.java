package com.movietime.manager.controller;

import com.movietime.manager.client.*;
import com.movietime.manager.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManagerController extends IManagerController {

    @Autowired
    private CityClient cityClient;

    @Autowired
    private MovieClient movieClient;

    @Autowired
    private SeatClient seatClient;

    @Autowired
    private ShowClient showClient;

    @Autowired
    private TheaterClient theaterClient;


    @Override
    public ResponseEntity<MovieData> addMovie(@RequestBody MovieData movieData) {
        Long cityId;
        Long theaterId;
        Long movieId;
        Long showId;
        ResponseEntity<City> city = cityClient.getCitiByName(movieData.getCity().getCity_name());
        if (city.getBody()==null) {
            city = cityClient.addCity(movieData.getCity());
            cityId = city.getBody().getCityId();
        } else {
            cityId = city.getBody().getCityId();
        }


        ResponseEntity<Theater> theater = theaterClient.getTheaterByCityIdAndName(cityId, movieData.getTheater().getTheater_name());
        if (theater.getBody()==null) {
            Theater theaterObject = movieData.getTheater();
            theaterObject.setCity_id(cityId);
            theater = theaterClient.addTheater(theaterObject);
            theaterId = theater.getBody().getTheater_id();
        } else {
            theaterId = theater.getBody().getTheater_id();
        }


        ResponseEntity<Movie> movie = movieClient.getMovieByTheaterIdAndMovieName(theaterId, movieData.getMovie().getMovie_name());
        if (movie.getBody()==null) {
            Movie movieObject = movieData.getMovie();
            movieObject.setCity_id(cityId);
            movieObject.setTheater_id(theaterId);
            movie = movieClient.addMovie(movieObject);
            movieId = movie.getBody().getMovie_id();
        } else {
            movieId = movie.getBody().getMovie_id();
        }


        ResponseEntity<Show> show = showClient.getShowbyMovieIdShowDateShowTime(movieId, movieData.getShow().getShow_date(),
                movieData.getShow().getShow_time());
        if (show.getBody()==null) {
            Show showObject = movieData.getShow();
            showObject.setMovie_id(movieId);

            show = showClient.addShow(showObject);
            showId = show.getBody().getShow_id();
        } else {
            showId = show.getBody().getShow_id();
        }

        return null;
    }

    @Override
    public ResponseEntity<City> getCity(@PathVariable(name = "cityId") Long cityId) {
        return cityClient.getCitiById(cityId);
    }
}
