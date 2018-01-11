package ru.itpark.servlets;

import ru.itpark.model.User;
import ru.itpark.repository.DaoUser.UsersRepository;
import ru.itpark.repository.DaoUser.UsersRepositoryEntityManagerImpl;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UsersJspServlet extends HttpServlet {

    private UsersRepository usersRepository;


    @Override
    public void init() throws ServletException {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");

        this.usersRepository = new UsersRepositoryEntityManagerImpl(factory.createEntityManager());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //req.setAttribute("hello", "Привет, Марсель!");

        req.setAttribute("users", usersRepository.findAll());
        req.getRequestDispatcher("jsp/users_with_tags.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        System.out.println(req.getParameter("id_delete"));
        if (req.getParameter("name_add")!=null && req.getParameter("age_add")!=null){
            String name = req.getParameter("name_add");
            int age = Integer.parseInt(req.getParameter("age_add"));
            User user = User.builder()
                    .name(name)
                    .age(age)
                    .build();
            usersRepository.save(user);
            resp.sendRedirect("/users_as_jsp");
        }

        if (req.getParameter("name_update")!=null && req.getParameter("age_update")!=null && req.getParameter("id_update")!=null){
            String name = req.getParameter("name_update");
            int age = Integer.parseInt(req.getParameter("age_update"));
            int id = Integer.parseInt(req.getParameter("id_update"));
            User user = User.builder()
                    .id(id)
                    .name(name)
                    .age(age)
                    .build();
            usersRepository.update(user);
            resp.sendRedirect("/users_as_jsp");
        }

        if (req.getParameter("id_delete")!=null){
            int id = Integer.parseInt(req.getParameter("id_delete"));
            usersRepository.delete(id);
            resp.sendRedirect("/users_as_jsp");

        }





        }




    }






