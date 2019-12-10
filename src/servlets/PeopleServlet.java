package servlets;

import helpers.Helper;
import models.User;
import services.PeopleService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name="PeopleServlet")
public class PeopleServlet extends HttpServlet {
    PeopleService peopleService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, Object> root = new HashMap<>();

        User user = (User) req.getSession().getAttribute("user");

        int user_id = user.getId();

        if (req.getParameter("investor_id")!=null){
            int id = Integer.parseInt(req.getParameter("investor_id"));
            root.put("people", peopleService.getInvestor(id, user_id));
        }
        if (req.getParameter("developer_id")!=null){
            int id = Integer.parseInt(req.getParameter("developer_id"));
            root.put("people", peopleService.getDeveloper(id, user_id));
        }
        if (req.getParameter("startuper_id")!=null){
            int id = Integer.parseInt(req.getParameter("startuper_id"));
            root.put("people", peopleService.getStartuper(id, user_id));
        }
        Helper.render(req, resp, "people.ftl", root);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    public void init() throws ServletException {
        peopleService = new PeopleService();
    }
}
