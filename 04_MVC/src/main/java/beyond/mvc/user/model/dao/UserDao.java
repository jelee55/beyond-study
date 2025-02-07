package beyond.mvc.user.model.dao;

import beyond.mvc.user.model.vo.User;

public interface UserDao {
    User getUserById(String userId);
}

