package com.wqt.mapper;

import com.wqt.dto.Film;

import java.util.List;

public interface IFilmMapper {

    public List<Film> selectAll();
    public String insert();
}
