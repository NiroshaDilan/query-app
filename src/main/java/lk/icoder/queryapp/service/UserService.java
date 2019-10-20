package lk.icoder.queryapp.service;

import lk.icoder.queryapp.entity.User;

import java.util.List;

/**
 * @Project query-app
 * @Author DILAN on 10/20/2019
 */
public interface UserService {

    User addUser(User user);

    List<User> findAllUsers();

    User findUserByUserId(Long userId);
}
