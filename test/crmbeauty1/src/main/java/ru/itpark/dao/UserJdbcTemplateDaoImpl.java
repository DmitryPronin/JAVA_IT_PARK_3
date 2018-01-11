package ru.itpark.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import ru.itpark.model.User;
//import sun.applet.Main;

import javax.persistence.EntityManager;
import java.util.List;

public class UserJdbcTemplateDaoImpl implements UserCrudDao {
    private final Configuration configuration = new Configuration()
            .configure("hibernate.cfg.xml");
    private final SessionFactory sessionFactory = configuration.buildSessionFactory();

    private EntityManager entityManager;

    public UserJdbcTemplateDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public void save(User user) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(user);
        session.getTransaction();
        session.close();


    }

    @Override
    public User find(int id) {
        Session session = sessionFactory.openSession();
        Query<User> userQuery = session.createQuery("from User user where user.id = 1");
        User user = userQuery.getSingleResult();
        return user;

    }

    @Override
    public void update(User user) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        if (user != null){
            session.merge(user); //работает и так
            //session.update(user); //работает и так
        }
        session.getTransaction().commit();
        session.close();



    }

    @Override
    public void delete(int id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        User user = (User) session.load(User.class, 11);
        if (user != null){
            session.delete(user);
        }
        session.getTransaction().commit();
        session.close();

    }

    @Override
    public List<User> findAll() {
//        return entityManager
//                .createQuery("from User users order by users.id", User.class)
//                .getResultList();
        Session session = sessionFactory.openSession();
        Query<User> userQuery = session.createQuery("from User user");
        List <User> userList = userQuery.getResultList();
        return userList;
    }

    public void showList(List <User> userList){
        for (User users: userList){
            System.out.println(users);
        }
    }
}
