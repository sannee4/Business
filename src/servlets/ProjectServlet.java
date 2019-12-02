package servlets;

import helpers.Helper;
import models.*;
import services.HelperTableService;
import services.ProjectService;
import services.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "ProjectServlet")
public class ProjectServlet extends HttpServlet {
    private ProjectService projectService;
    private UserService userService;
    private HelperTableService helperTableService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int project_id = Integer.parseInt(req.getParameter("project_id"));
        System.out.println(project_id);
        Project project =  projectService.getProject(project_id);
        List<Developer> developers = projectService.getDevelopers(project_id);
        List<Investor> investors = projectService.getInvestors(project_id);
        List<Startuper> startupers = projectService.getStartupers(project_id);
        List<Comment> comments = projectService.getComments(project_id);
        List<HelperTable> helperTables = new ArrayList<>();
        User  user = (User) req.getSession().getAttribute("user");
        if (user!= null){
            helperTables =helperTableService.getAllById(user.getId());
        }

        Map<String, Object>  root = new HashMap<>();
        root.put("user", user);
        root.put("project", project);
        root.put("developers", developers);
        root.put("investors", investors);
        root.put("startupers", startupers);
        root.put("comments", comments);
        root.put("helpertables", helperTables);
        Helper.render(req, resp, "project.ftl", root);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute("user");
        int project_id = Integer.parseInt(req.getParameter("project_id"));
        helperTableService.addProjects(req.getParameter("input"), user.getId(), project_id);
    }

    @Override
    public void init() throws ServletException {
        projectService = new ProjectService();
        userService = new UserService();
        helperTableService = new HelperTableService();
    }
}
