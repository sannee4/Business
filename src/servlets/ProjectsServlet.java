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

@WebServlet(name = "ProjectsServlet")
public class ProjectsServlet extends HttpServlet {

    private ProjectService projectService;

    @Override
    public void init() throws ServletException {
        projectService = new ProjectService();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Project> projects = projectService.getAllProject();
        Map<String, Object> root = new HashMap<>();
        root.put("projects", projects);
        Helper.render(req,resp, "projects.ftl", root);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);

    }


}
