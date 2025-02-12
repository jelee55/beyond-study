package beyond.mvc.user.model.dao;

import beyond.mvc.user.model.vo.User;

import java.sql.Connection;

public interface UserDao {
    User getUserById(Connection connection, String userId);

    int insertUser(Connection connection, User user);

    int updateUser(Connection connection, User user);

    int delete(Connection connection, int no);

    int updateDeleteStatus(Connection connection, int no, String status);
}

