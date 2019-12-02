package servlets;

import helpers.Helper;
import models.Project;
import services.ProjectService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name  = "TopServlet")
public class TopServlet extends HttpServlet {
    ProjectService projectService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Project> projects = projectService.getTopProjects();
        Map<String, Object> root = new HashMap<>();
        root.put("projects", projects);
        Helper.render(req, resp, "top.ftl", root);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    public void init() throws ServletException {
       projectService = new ProjectService();
    }
}
