package beyond.mvc.user.controller;

import beyond.mvc.user.model.service.UserService;
import beyond.mvc.user.model.service.UserServiceImpl;
import beyond.mvc.user.model.vo.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Serial;

@WebServlet(name = "loginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    @Serial
    private static final long serialVersionUID = -2782185896523259818L;

    private final UserService userService;

    public LoginServlet() {
        userService = new UserServiceImpl();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = request.getParameter("userId");
        String userPwd = request.getParameter("userPwd");

        User LoginUser = userService.login(userId, userPwd);

        System.out.println(LoginUser);

        response.sendRedirect(request.getContextPath() + "/");
    }
}
