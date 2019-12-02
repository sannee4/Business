package servlets;

import models.User;
import org.json.JSONException;
import org.json.JSONObject;
import services.ProjectService;
import services.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

@WebServlet(name = "CommentServlet")
public class CommentServlet extends HttpServlet {

    private UserService userService;
    private ProjectService projectService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute("user");
        int project_id = Integer.parseInt(req.getParameter("project_id"));
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm dd.MM.yy");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        projectService.addComment(user.getName(),
                req.getParameter("text"), timestamp, project_id);
        JSONObject jo = new JSONObject();
        try {
            jo.put("user_name", user.getName());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            jo.put("date", "" + sdf.format(timestamp));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        resp.setContentType("text/json");
        resp.getWriter().write(jo.toString());
    }

    @Override
    public void init() throws ServletException {
            userService = new UserService();
            projectService = new ProjectService();
    }
}
