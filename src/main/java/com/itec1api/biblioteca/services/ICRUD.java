package com.itec1api.biblioteca.services;

import java.util.List;

public interface ICRUD<REQUEST, RESPONSE> {
    public RESPONSE save(REQUEST request);
    public RESPONSE update(REQUEST request);
    public RESPONSE delete(String bookNameToDelete);
    public RESPONSE findById(Long id);
    public List<RESPONSE> findAll();
}
