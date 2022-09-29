package com.movietime.movie.service;

import com.movietime.movie.entity.Movie;
import com.movietime.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getMovieByCityId(Long city_id) {
        return movieRepository.getMovieByCityId(city_id);
    }

    public List<Movie> getMovieByTheaterId(Long theater_id) {
        return movieRepository.getMovieByTheaterId(theater_id);
    }

    public List<Movie> getMovieByTheaterAndCityId(Long city_id, Long theater_id) {
        return movieRepository.getMovieByTheaterAndCityId(city_id, theater_id);
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie addMovie(Movie m) {
        return movieRepository.save(m);
    }
}
