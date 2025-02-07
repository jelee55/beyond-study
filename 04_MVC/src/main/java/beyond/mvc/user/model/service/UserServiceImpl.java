package beyond.mvc.user.model.service;

import beyond.mvc.user.model.dao.UserDao;
import beyond.mvc.user.model.dao.UserDaoImpl;
import beyond.mvc.user.model.vo.User;

public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl() {
        userDao = new UserDaoImpl();
    }

    @Override
    public User login(String userId, String userPwd) {
        User user = null;

        user = userDao.getUserById(userId);

        return user;
    }
}
