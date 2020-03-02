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
 * �����û���Ϣ��servlet
 * @author 98209
 *
 */
//���÷��ʵ�URL��Ϣ,�������ע��
@WebServlet("/Add")
public class Userservlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//�����������ݵĴ���
		req.setCharacterEncoding("UTF-8");
		// ��servlet��ȥ����service�е�����
		UserService us=new UserServiceimpl();
		User user=new User();
		//���ҳ���ϴ������
		String name=req.getParameter("name");
		//ҳ���ϻ�õ�������String���ͣ���Ҫ�����ݽ���ǿת����������������Ҫ�������ݽ���ǿת����װ�ࣩ
		int age=Integer.parseInt(req.getParameter("age"));
		user.setName("����");
		//����ʵ�����е�setter����Ϊ˽�е����Ը�ֵ   ע��
		user.setAge(20);
		us.save(user);
	}
	
}
