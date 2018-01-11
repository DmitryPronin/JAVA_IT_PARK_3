package ru.itpark.repository;

import java.util.List;

public interface CrudRepository <T> {
    void save(T model);
    T find (int id);
    void update(T model);

    void delete(int id);

    List <T> findAll();
}
