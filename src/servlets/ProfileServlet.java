package servlets;

import helpers.Helper;
import models.HelperTable;
import models.User;
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

@WebServlet( name="ProfileServlet")
public class ProfileServlet extends HttpServlet {
    UserService userService;
    HelperTableService helperTableService;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute("user");
        List<HelperTable>  helperTables = helperTableService.getAllById(user.getId());
        Map<String, Object> root = new HashMap<>();
        root.put("user", user);
        root.put("helpertables", helperTables);
        Helper.render(req, resp, "profile.ftl", root);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute("user");
        int user_id = user.getId();
        String helpertable = req.getParameter("helpertable");
        helperTableService.add(helpertable, user_id);
        doGet(req, resp);

    }

    @Override
    public void init() throws ServletException {
        userService = new UserService();
        helperTableService = new HelperTableService();
    }
}
