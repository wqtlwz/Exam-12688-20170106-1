package com.wqt.service;


import com.wqt.dto.Film;

import java.util.List;

public interface IFilmService {
    public List<Film> selectAll();
    public String insert(Film film);
}
