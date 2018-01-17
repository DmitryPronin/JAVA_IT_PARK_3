package ru.itpark.servlets;

import ru.itpark.model.Orders;
import ru.itpark.model.User;
import ru.itpark.repository.DaoOrder.OrderRepository;
import ru.itpark.repository.DaoOrder.OrderRepositoryEntityManagerImpl;
import ru.itpark.repository.DaoUser.UsersRepository;
import ru.itpark.repository.DaoUser.UsersRepositoryEntityManagerImpl;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

public class OrderJspServlet extends HttpServlet {
    private OrderRepository orderRepository;
    private UsersRepository usersRepository;

    @Override
    public void init() throws ServletException {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");
        this.orderRepository = new OrderRepositoryEntityManagerImpl(factory.createEntityManager());
        this.usersRepository = new UsersRepositoryEntityManagerImpl(factory.createEntityManager());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("orders",orderRepository.findAll());
        req.getRequestDispatcher("jsp/users_order.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

//            LocalDateTime dateTime = LocalDateTime.parse(req.getParameter("datetime_add"));
//            int users_id = Integer.parseInt(req.getParameter("id_add"));
//            Orders orders= Orders.builder()
//                    .dateTime(dateTime)
//                    .users_id(users_id)
//                    .build();
//            orderRepository.save(orders);
//            resp.sendRedirect("/users_order");


            //редактирование
        req.setCharacterEncoding("UTF-8");
        LocalDateTime dateTime = LocalDateTime.parse(req.getParameter("datetime_update"));
        int users_id = Integer.parseInt(req.getParameter("user_id_update"));
        int id = Integer.parseInt(req.getParameter("id_update"));
        User user = usersRepository.find(users_id);
        Orders orders= Orders.builder()
                .id(id)
                .dateTime(dateTime)
                .user(user)
                .build();
        orderRepository.update(orders);
        resp.sendRedirect("/users_order");



    }
}
