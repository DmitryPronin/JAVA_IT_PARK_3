package ru.itpark.servlets;

import ru.itpark.repository.UserRepository;
import ru.itpark.repository.UserRepositoryEntityManagerImpl;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserJspServlet extends HttpServlet {

    private UserRepository usersRepository;

    @Override
    public void init() throws ServletException {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("ru.itpark.persistence");

        this.usersRepository = new UserRepositoryEntityManagerImpl(factory.createEntityManager());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("hello", "Привет, Марсель!");

        req.setAttribute("users", usersRepository.findAll());
        req.getRequestDispatcher("/jsp/users_with_tags.jsp").forward(req, resp);
    }
}