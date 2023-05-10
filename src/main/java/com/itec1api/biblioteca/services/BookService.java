package com.itec1api.biblioteca.services;

import java.util.List;

public interface BookService<REQUEST, RESPONSE> {
    public RESPONSE save(REQUEST request);
    public RESPONSE update(REQUEST request);
    public RESPONSE delete(Integer id);
    public RESPONSE findOne(Integer id);
    public List<RESPONSE> findAll();
    public List<RESPONSE> findByName(String name);
}
