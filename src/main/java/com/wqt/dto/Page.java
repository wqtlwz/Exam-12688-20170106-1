package com.wqt.dto;


import java.util.List;

public class Page {

    private List<Film> list;

    public Page(List<Film> list) {
        this.list = list;
    }

    public List<Film> getList() {
        return list;
    }

    public void setList(List<Film> list) {
        this.list = list;
    }
}
