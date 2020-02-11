package com.qa.database.services;

import java.util.List;

public interface CrudServices<T> {

    public List<T> readAll();
     
    T create(T t);
     
    T update(T t);
 
    void delete (long id);

}
