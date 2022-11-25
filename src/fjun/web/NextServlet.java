package fjun.web;

import fjun.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author FJun
 * @ClassName NextServlet
 * @Description
 * @date 2022/11/21
 */
public class NextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //  1、获取请求的参数
        Object user = req.getSession().getAttribute("user");
//        String username = req.getParameter("username");

        // 如果等于null,说明登录 失败!
        if (user == null) {
            //   跳回登录页面
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        } else {
            //跳到成功页面login_success.html
            req.getRequestDispatcher("/pages/user/heart.jsp").forward(req, resp);
        }
    }
}
