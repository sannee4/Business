package servlets;

import helpers.Helper;
import models.User;
import services.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "SettingsServlet")
public class SettingsServlet extends HttpServlet {
    UserService userService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, Object> root = new HashMap<>();
        User user = (User) req.getSession().getAttribute("user");
        root.put("user", user);
        Helper.render(req, resp, "settings.ftl", root);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User current_user = (User) req.getSession().getAttribute("user");
        int id = current_user.getId();
        String name = req.getParameter("user");
        String login = req.getParameter("login");
        try {
            String hashedPassword = null;

            String password = req.getParameter("password");
            if (!("".equals(password))) {
                hashedPassword = userService.hash(password);
            }

            userService.update(id, name, login, hashedPassword);

            User user = userService.getUser(id);
            req.getSession().setAttribute("user", user);
            resp.sendRedirect("/profile");

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void init() throws ServletException {
        userService = new UserService();
    }
}
