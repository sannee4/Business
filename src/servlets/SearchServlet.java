package servlets;

import models.Project;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import services.ProjectService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SearchServlet")
public class SearchServlet extends HttpServlet {
    ProjectService projectService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String query = req.getParameter("query");
        List<Project> projects = projectService.getByLikePattern(query);

        JSONArray ja = new JSONArray();
        for (Project project: projects){
            ja.put(new JSONObject(project));
        }

        JSONObject jo = new JSONObject();
        try {
            jo.put("objects", ja);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        resp.setContentType("text/json");
        resp.getWriter().write(jo.toString());


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    public void init() throws ServletException {
        projectService = new ProjectService();
    }
}
