package com.movietime.show.repository;

import com.movietime.show.entity.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowRepository extends JpaRepository<Show, Long> {

    @Query(value = "select * from show where city_id = ?1 and theater_id = ?2 and movie_id = ?3", nativeQuery = true)
    public List<Show> getShowByCityTheaterMovie(Long cityId, Long theaterId, Long movieId);
}
