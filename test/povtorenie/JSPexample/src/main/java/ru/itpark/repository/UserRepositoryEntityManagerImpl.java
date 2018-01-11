package ru.itpark.repository;

import ru.itpark.models.User;

import javax.persistence.EntityManager;
import java.util.List;

public class UserRepositoryEntityManagerImpl implements UserRepository {
    private EntityManager entityManager;



    public UserRepositoryEntityManagerImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List <User> findAll() {
        return entityManager
                .createQuery("from  User user order by user.id", User.class)
                .getResultList();

    }
}
