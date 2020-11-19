package app.servlets;

import app.model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ListServlet extends HttpServlet {
    // Ответ без jsp страничек
//    @Override
//    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        PrintWriter writer = resp.getWriter();
//        writer.println("Method Get from List");
//    }

    //получаем из объекта запроса объект диспетчера запросов, куда передаем адрес jsp странички, которой мы хотим передать управление;
    //используя полученный объект — передаем управление в указанную jsp страницу, и не забываем вложить туда те объекты запроса и ответа, которые мы получили от Tomcat.
    @Override
    protected  void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        Model model = Model.getInstance();
        List<String> names = model.list();
        req.setAttribute("userNames", names);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/views/list.jsp");
        requestDispatcher.forward(req,resp);
    }

}
