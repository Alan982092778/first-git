package service.impl;

import dao.UserDao;
import dao.impl.UserDaoimpl;
import enity.User;
import service.UserService;

public class UserServiceimpl implements UserService {
	//ҵ���������ݷ��ʲ������
	UserDao dao=new UserDaoimpl();
	@Override
	public void save(User user) {
		// ʹ�����ݷ��ʲ��е��࣬�������ķ�����ʵ�����ݵ����
		dao.save(user);

	}

}
