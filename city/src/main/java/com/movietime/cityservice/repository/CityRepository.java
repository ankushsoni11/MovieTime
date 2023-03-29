package com.movietime.cityservice.repository;

import com.movietime.cityservice.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

    @Query(value = "select * from city where city_name = ?1", nativeQuery = true)
    public City findByCityName(String cityName);

}
