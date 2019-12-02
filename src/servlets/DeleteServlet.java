package servlets;

import services.HelperTableService;
import services.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteServlet")
public class DeleteServlet extends HttpServlet {
    UserService userService;
    HelperTableService helperTableService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getParameter("helpertable_id"));
        int helpertable_id = Integer.parseInt(req.getParameter("helpertable_id"));
        System.out.println(helpertable_id);
        helperTableService.deleteHelperTable(helpertable_id);
    }

    @Override
    public void init() throws ServletException {
        userService = new UserService();
        helperTableService = new HelperTableService();
    }
}
