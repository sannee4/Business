package servlets;

import helpers.Helper;
import models.HelperTable;
import models.Project;
import services.HelperTableService;
import services.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "HelperTableServlet")
public class HelperTableServlet extends HttpServlet {

    HelperTableService helperTableService;
    UserService userService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int helpertable_id = Integer.parseInt(req.getParameter("helpertable_id"));
        HelperTable helperTable = helperTableService.getHelpertableById(helpertable_id);
        List<Project>  projects = helperTableService.getProject(helpertable_id);
        Map<String, Object> root = new HashMap<>();
        root.put("projects", projects );
        root.put("helpertable", helperTable);
        Helper.render(req, resp, "helpertable.ftl", root);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    public void init() throws ServletException {
        helperTableService = new HelperTableService();
        userService = new UserService();

    }
}
