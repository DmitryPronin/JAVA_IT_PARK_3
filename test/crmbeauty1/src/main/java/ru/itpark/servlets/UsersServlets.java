package ru.itpark.servlets;

import ru.itpark.dao.UserCrudDao;
import ru.itpark.dao.UserJdbcTemplateDaoImpl;
import ru.itpark.model.User;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class UsersServlets extends HttpServlet {
    private UserCrudDao userCrudDao;

    @Override
    public void init() throws ServletException {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");

        this.userCrudDao = new UserJdbcTemplateDaoImpl(factory.createEntityManager());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");

        PrintWriter printWriter = resp.getWriter();
        String color = "#000000";
        printWriter.write("<h1>Hello</h1>");
        printWriter.write("<table border="+1+" background ="+color+">");
        printWriter.write("<tr>");
        printWriter.write("<th>ID</th>");
        printWriter.write("<th>ИМЯ</th>");
        printWriter.write("<th>ФАМИЛИЯ</th>");
        printWriter.write("<th>Возраст</th>");
        printWriter.write("<th>Мобильный Телефон</th>");
        printWriter.write("</tr>");

        List<User> userList = userCrudDao.findAll();
        printWriter.write("<h1>"+userList.get(2).getMobilePhone()+"</h1>");

        for (User user: userList){
            //String color = "#000000";
            printWriter.write("<tr>");
            printWriter.write("<th background ="+"color"+">"+user.getId()+"</th>");
            printWriter.write("<th>"+user.getName()+"</th>");
            printWriter.write("<th>"+user.getSurname()+"</th>");
            printWriter.write("<th>"+user.getAge()+"</th>");
            printWriter.write("<th>"+user.getMobilePhone()+"</th>");
            printWriter.write("</tr>");
        }
        printWriter.write("</table>");



    }
}
