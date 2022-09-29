package com.movietime.show.service;

import com.movietime.show.entity.Show;
import com.movietime.show.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowService {

    @Autowired
    private ShowRepository showRepository;

    public List<Show> getAllShow() {
        return showRepository.findAll();
    }

    public List<Show> getShowByCityTheaterMovie(Long cityId, Long theaterId, Long movieId) {
        return showRepository.getShowByCityTheaterMovie(cityId, theaterId, movieId);
    }

    public Show addShow(Show s) {
        return showRepository.save(s);
    }
}
