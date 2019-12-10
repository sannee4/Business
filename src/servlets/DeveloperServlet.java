package servlets;

import helpers.Helper;
import models.Developer;
import models.User;
import services.PeopleService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "DeveloperServlet")
public class DeveloperServlet extends HttpServlet {

    PeopleService peopleService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute("user");
        Map<String, Object> root = new HashMap<>();
        Developer developer = peopleService.getDeveloper(user.getId());
        System.out.println(developer.getCountry());


        root.put("user", user);
        root.put("developer", developer);

        Helper.render(req, resp, "developerProfile.ftl", root);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    public void init() throws ServletException {
        peopleService = new PeopleService();
    }
}
