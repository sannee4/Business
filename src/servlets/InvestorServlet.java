package servlets;

import helpers.Helper;
import models.Investor;
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
        List<Investor> investors = peopleService.getAllInvestors();
        System.out.println(investors.size());
        Map<String, Object> root = new HashMap<>();
        root.put("investors", investors);
        Helper.render(req, resp, "investors.ftl", root);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    public void init() throws ServletException {
        peopleService = new PeopleService();
    }
}
