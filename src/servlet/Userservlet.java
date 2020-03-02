package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import enity.User;
import service.UserService;
import service.impl.UserServiceimpl;
/**
 * 操作用户信息的servlet
 * @author 98209
 *
 */
//设置访问的URL信息,这个就是注解
@WebServlet("/Add")
public class Userservlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置请求数据的代码
		req.setCharacterEncoding("UTF-8");
		// 在servlet中去访问service中的数据
		UserService us=new UserServiceimpl();
		User user=new User();
		//获得页面上打的数据
		String name=req.getParameter("name");
		//页面上获得的数据是String类型，需要对数据进行强转，所以这里我们需要对这数据进行强转（包装类）
		int age=Integer.parseInt(req.getParameter("age"));
		user.setName("张三");
		//调用实体类中的setter方法为私有的属性赋值   注入
		user.setAge(20);
		us.save(user);
	}
	
}
