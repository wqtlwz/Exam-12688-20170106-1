package com.wqt.service.impl;


import com.wqt.controller.FilmController;
import com.wqt.dto.Film;
import com.wqt.dto.Language;
import com.wqt.mapper.IFilmMapper;
import com.wqt.mapper.LanguageMapper;
import com.wqt.service.IFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FilmServiceImpl implements IFilmService{
    @Autowired
    IFilmMapper mapper;
    @Autowired
    LanguageMapper languageMapper;
    private List<Film> list;
    @Override
    public List<Film> selectAll() {
        List<Film> list=null;
try{
    list= mapper.selectAll();
    for (int i = 0; i <list.size() ; i++) {
        Language language=languageMapper.findById(list.get(i).getLanguageId());
        System.out.println(language.getName()+"erer====");
        list.get(i).setName(language.getName());
    }
}catch (Exception e){
    throw new RuntimeException(e);
}
        return list;
    }

    @Override
    public String insert(Film film) {
        return mapper.insert();
    }

}
