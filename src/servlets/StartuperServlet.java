package servlets;

import helpers.Helper;
import models.Startuper;
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

@WebServlet(name = "StartuperServlet")
public class StartuperServlet extends HttpServlet {
    PeopleService peopleService;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = (User)req.getSession().getAttribute("user");
        Map<String,Object> root = new HashMap<>();
        Startuper startuper = peopleService.getStartuper(user.getId());

        root.put("user", user);
        root.put("startuper",startuper);
        Helper.render(req, resp, "startuperProfile.ftl", root);
    }

    @Override
    public void init() throws ServletException {
        peopleService = new PeopleService();
    }
}
