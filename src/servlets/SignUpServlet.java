package servlets;

import helpers.Helper;
import models.Roles;
import models.User;
import services.PeopleService;
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
    PeopleService peopleService;

    @Override
    public void init() throws ServletException {
        userService = new UserService();
        peopleService = new PeopleService();
    }

    @Override
    protected void doPost(
            HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String login = request.getParameter("email");
        String surname = request.getParameter("surname");
        String country = request.getParameter("country");
        String budget = request.getParameter("budget");
        String experience = request.getParameter("experience");
        int roleNumber = (Integer.parseInt(request.getParameter("role")));

        Roles[] roles = new Roles[] {
                Roles.STARTUPER,
                Roles.INVESTOR,
                Roles.DEVELOPER
        };

        Roles role = roles[roleNumber - 1];

        try {
            String password = userService.hash(request.getParameter("password"));
            System.out.println(role);
            userService.register(name,
                    login, password, role);
            User user = userService.getUser(login);
            switch (role.name()) {
                case "DEVELOPER":
                    peopleService.createDeveloper(user.getId(), name, surname, country);
                    break;
                case "INVESTOR":
                    peopleService.createInvestor(user.getId(), name, surname, country, budget);
                    break;
                case "STARTUPER":
                    peopleService.createStaruper(user.getId(), name, surname, country, experience);
                    break;
            }


            request.getSession().setAttribute("user", user);
            response.sendRedirect("/sign_in");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Helper.render(request, response, "sign_up.ftl", null);
    }
}
