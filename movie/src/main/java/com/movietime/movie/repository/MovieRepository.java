package com.movietime.movie.repository;

import com.movietime.movie.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    @Query(value = "select * from movie where city_id = ?1", nativeQuery = true)
    public List<Movie> getMovieByCityId(Long city_id);

    @Query(value = "select * from movie where theater_id = ?1", nativeQuery = true)
    public List<Movie> getMovieByTheaterId(Long theater_id);

    @Query(value = "select * from movie where theater_id = ?1 and movie_name = ?2", nativeQuery = true)
    public List<Movie> getMovieByTheaterIdAndMovieName(Long theater_id, String movieName);
}
