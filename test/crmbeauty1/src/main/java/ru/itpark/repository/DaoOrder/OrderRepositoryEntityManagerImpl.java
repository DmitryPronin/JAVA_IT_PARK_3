package ru.itpark.repository.DaoOrder;

import ru.itpark.model.Orders;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class OrderRepositoryEntityManagerImpl implements OrderRepository {
    private EntityManager entityManager;

    public OrderRepositoryEntityManagerImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void save(Orders model) {
        entityManager.getTransaction().begin();
        entityManager.persist(model);
        entityManager.getTransaction().commit();
    }

    @Override
    public Orders find(int id) {
        return null;
    }

    @Override
    public void update(Orders model) {
        entityManager.getTransaction().begin();
        entityManager.merge(model);
        entityManager.getTransaction().commit();
    }

    @Override
    public void delete(int id) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("DELETE FROM Orders orders WHERE orders.id= :id_delete");
        int deletedCount = query.setParameter("id_delete",id).executeUpdate();
        System.out.println(deletedCount);
        entityManager.getTransaction().commit();
    }

    @Override
    public List<Orders> findAll() {
        return entityManager
                .createQuery("from Orders orders order by orders.id", Orders.class)
                .getResultList();
    }
}
