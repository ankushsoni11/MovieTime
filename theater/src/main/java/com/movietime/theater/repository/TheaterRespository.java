package com.movietime.theater.repository;

import com.movietime.theater.entity.Theater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TheaterRespository extends JpaRepository<Theater, Long> {

    @Query(value = "select * from theater t where t.city_id = ?1", nativeQuery = true)
    public List<Object[]> getTheaterByCityId(long city_id);

}
