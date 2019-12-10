package servlets;

import helpers.Helper;
import models.User;
import services.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

@WebServlet(name = "SingInServlet")
public class SignInServlet extends HttpServlet {

    UserService userService;

    @Override
    public void init() throws ServletException {
        userService = new UserService();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = null;
        try {
            password = userService.hash(request.getParameter("password"));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        String checkbox = request.getParameter("check");
        try {
            if (userService.find(login, password)) {
                User n_user = userService.getUser(login);
                request.getSession().setAttribute("user", n_user);
                if (checkbox != null) {
                    Cookie cookie = new Cookie("user", login);
                    cookie.setMaxAge(60 * 60 * 24 * 14);
                    response.addCookie(cookie);
                }
                response.sendRedirect("/profile");
            } else {
                response.sendRedirect("/sign_up");
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Helper.render(request, response, "sign_in.ftl", null);
    }
}
