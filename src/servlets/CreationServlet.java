package servlets;

import models.User;
import services.HelperTableService;
import services.UserService;

import javax.jws.soap.SOAPBinding;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CreationServlet")
public class CreationServlet extends HttpServlet {

    private UserService userService;
    private HelperTableService helperTableService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = (User)req.getSession().getAttribute("user");
        helperTableService.add(req.getParameter("input"), user.getId());
        req.getRequestDispatcher("/project").include(req,resp);
    }

    @Override
    public void init() throws ServletException {
        userService = new UserService();
        helperTableService = new HelperTableService();
    }
}
