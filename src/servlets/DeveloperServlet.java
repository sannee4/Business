package servlets;

import helpers.Helper;
import models.Developer;
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
        List<Developer> developers = peopleService.getAllDevelopers();
        Map<String, Object> root = new HashMap<>();
        root.put("developers", developers);
        Helper.render(req, resp, "developer.ftl", root);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    public void init() throws ServletException {
        peopleService = new PeopleService();
    }
}
