package com.wqt.controller;


import com.wqt.dto.Film;
import com.wqt.dto.Page;
import com.wqt.service.IFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
public class FilmController {
    @Autowired
    IFilmService filmService;

    @RequestMapping("/query")
    @ResponseBody
    public Page selectAll(String a){
        List<Film> list=null;
        try{
            list= filmService.selectAll();

        }catch (Exception e){
            e.printStackTrace();
        };
        System.out.println(list.get(88).getTitle());
        return new Page(list);
    }
     @RequestMapping("/insert")
    @ResponseBody
    public String insert(Film film){
         return filmService.insert(film);
     }

}
