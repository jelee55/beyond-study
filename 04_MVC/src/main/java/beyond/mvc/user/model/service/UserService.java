package beyond.mvc.user.model.service;

import beyond.mvc.user.model.vo.User;

public interface UserService {
    User login(String userId, String userPwd);

}
