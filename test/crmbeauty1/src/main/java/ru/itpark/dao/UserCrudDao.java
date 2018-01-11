package ru.itpark.dao;

import ru.itpark.model.User;

import java.util.List;

public interface UserCrudDao extends CrudDao <User>{
    @Override
    void save(User model);

    @Override
    User find(int id);

    @Override
    void update(User model);

    @Override
    void delete(int id);

    @Override
    List<User> findAll();
}
