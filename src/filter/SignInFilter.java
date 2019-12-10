package filter;

import models.Roles;
import models.User;
import services.UserService;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebFilter(filterName = "SignInFilter")
public class SignInFilter implements Filter {

    UserService userService;

    public void init(FilterConfig config) throws ServletException {
        userService = new UserService();
    }

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        User user = (User) request.getSession().getAttribute("user");
        Cookie[] cookies = request.getCookies();
        for (Cookie c : cookies) {
            if (user == null && "user".equals(c.getName())) {
                request.getSession().setAttribute("user", userService.getUser(c.getValue()));
                break;
            }
        }

        List<String> profilePaths = new ArrayList<String>();
        profilePaths.add("/profile");
        profilePaths.add("/inv");
        profilePaths.add("/dev");
        profilePaths.add("/st");
        profilePaths.add("/helpertable");
        profilePaths.add("/settings");

        if (user == null && (profilePaths.contains(request.getServletPath()))) {

            response.sendRedirect("/sign_in");
        } else if (user != null && (request.getServletPath().equals("/sign_in")
                || request.getServletPath().equals("/sign_up"))) {
            response.sendRedirect("/profile");
        }  else {
            chain.doFilter(req, resp);
        }
    }
}
