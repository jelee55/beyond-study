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


@WebServlet(name = "enrollServlet", urlPatterns = "/user/enroll")
public class UserEnrollServlet extends HttpServlet {


    @Serial
    private static final long serialVersionUID = -2523714655574792644L;

    private final UserService userService;

    public UserEnrollServlet() {
        this.userService = new UserServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 회원 가입 페이지로 전환
        request.getRequestDispatcher("/views/user/enroll.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();

        user.setId(request.getParameter("userId"));
        user.setPassword(request.getParameter("userPwd"));
        user.setName(request.getParameter("userName"));
        user.setPhone(request.getParameter("phone"));
        user.setEmail(request.getParameter("email"));
        user.setAddress(request.getParameter("address"));

        String hobbies = request.getParameterValues("hobby") != null ?
                String.join(",", request.getParameterValues("hobby")) : null;


        System.out.println(hobbies);

        int result = userService.save(user);

        if(result > 0) {
            // 회원 가입 완료
            request.setAttribute("msg","회원 가입 완료");
            request.setAttribute("location", "/");
        }else{
            // 회원 가입 실패
            request.setAttribute("msg","회원 가입 실패");
            request.setAttribute("location", "/user/enroll");
        }

        request.getRequestDispatcher("/views/common/msg.jsp").forward(request, response);

    }
}
