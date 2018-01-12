package ru.itpark.repository.DaoUser;


         import ru.itpark.model.User;
         import javax.persistence.EntityManager;
         import javax.persistence.Query;
         import java.util.List;

         public class UsersRepositoryEntityManagerImpl implements UsersRepository {

           private EntityManager entityManager;

           public UsersRepositoryEntityManagerImpl(EntityManager entityManager) {
            this.entityManager = entityManager;
          }

             @Override
   public List<User> findAll() {
            return entityManager
                        .createQuery("from User users order by users.id", User.class)
                        .getResultList();

          }
             @Override
             public void save(User model) {
                 entityManager.getTransaction().begin();
                 entityManager.persist(model);
                 entityManager.getTransaction().commit();
             }
             @Override
             public void update(User model) {
               entityManager.getTransaction().begin();
               entityManager.merge(model);
               entityManager.getTransaction().commit();

             }

             @Override
             public void delete(int id) {
                 entityManager.getTransaction().begin();
                 Query query = entityManager.createQuery("DELETE FROM User users WHERE users.id= :id_delete");
                 int deletedCount = query.setParameter("id_delete",id).executeUpdate();
                 entityManager.getTransaction().commit();

             }

             @Override
             public User find(int id) {
                 return User.builder().build();


             }
         }