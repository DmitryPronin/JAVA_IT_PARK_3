package ru.itpark.servlets;

import ru.itpark.repository.DaoOrder.OrderRepository;
import ru.itpark.repository.DaoOrder.OrderRepositoryEntityManagerImpl;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OrderJspServlet extends HttpServlet {
    private OrderRepository orderRepository;

    @Override
    public void init() throws ServletException {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");
        this.orderRepository = new OrderRepositoryEntityManagerImpl(factory.createEntityManager());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("orders",orderRepository.findAll());
        req.getRequestDispatcher("jsp/users_order");
    }
}
