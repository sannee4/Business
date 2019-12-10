package servlets;

import helpers.Helper;
import models.Investor;
import models.User;
import services.PeopleService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "InvestorServlet")
public class InvestorServlet extends HttpServlet {

    PeopleService peopleService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute("user");
        Map<String, Object> root = new HashMap<>();

        Investor investor = peopleService.getInvestor(user.getId());

        System.out.println(investor.getId() + "- (as investor) name");

        root.put("user", user);
        root.put("investor", investor);
        Helper.render(req, resp, "investorProfile.ftl", root);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    public void init() throws ServletException {
        peopleService = new PeopleService();
    }
}
