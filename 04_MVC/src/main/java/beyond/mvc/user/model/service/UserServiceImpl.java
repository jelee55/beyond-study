package beyond.mvc.user.model.service;

import beyond.mvc.common.jdbc.JDBCTemplate;
import beyond.mvc.user.model.dao.UserDao;
import beyond.mvc.user.model.dao.UserDaoImpl;
import beyond.mvc.user.model.vo.User;

import java.sql.Connection;

import static beyond.mvc.common.jdbc.JDBCTemplate.close;
import static beyond.mvc.common.jdbc.JDBCTemplate.getConnection;
import static beyond.mvc.common.jdbc.JDBCTemplate.commit;
import static beyond.mvc.common.jdbc.JDBCTemplate.rollback;

public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl() {
        userDao = new UserDaoImpl();
    }

    @Override
    public User login(String userId, String userPwd) {
        Connection connection = getConnection();
        User user = userDao.getUserById(connection, userId);

        if (user == null || !user.getPassword().equals(userPwd)) {
            return null;
        }
        close(connection);

        return user;
    }

    @Override
    public int save(User user) {
        int result = 0;

        Connection connection = getConnection();

        result = userDao.insertUser(connection, user);

        if (result > 0) {
            commit(connection);
        }else{
            rollback(connection);
        }

        close(connection);

        return result;
    }
}
