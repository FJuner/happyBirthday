package fjun.web;

import fjun.pojo.User;
import fjun.service.UserService;
import fjun.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author FJun
 * @ClassName LoginServlet
 * @Description
 * @date 2022/9/3
 */
public class LoginServlet extends HttpServlet {
    private UserService userService =  new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //  1、获取请求的参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        // 调用 userService.login()登录处理业务
        User loginUser = userService.login(new User(null, username, password, null));
        // 如果等于null,说明登录 失败!
        if (loginUser == null) {
            //把错误的信息、回显表单项信息保存到Request域中
            req.setAttribute("msg","用户名或密码错误！");
            req.setAttribute("username",username);
            //   跳回登录页面
            System.out.println("登录失败！");
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        } else {
            // 登录 成功
            //跳到成功页面login_success.html
            System.out.println("登录成功！");
            req.getSession().setAttribute("user",loginUser);
            req.getRequestDispatcher("/pages/user/letter.jsp").forward(req, resp);
        }
    }
}
