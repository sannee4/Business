package servlets;

import helpers.Helper;
import models.User;
import services.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

//registration
@WebServlet(name = "SingUpServlet")
@MultipartConfig
public class SignUpServlet extends HttpServlet {

    UserService userService;

    @Override
    public void init() throws ServletException {
        userService = new UserService();
    }

    @Override
    protected void doPost(
            HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String login = request.getParameter("login");
        String password = null;
        try {
            password = userService.hash(request.getParameter("password"));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        User user = userService.getUser(login);
        request.getSession().setAttribute("user", user);
        response.sendRedirect("/sign_in");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Helper.render(request, response, "sign_up.ftl", null);
    }
}
