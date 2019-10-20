package lk.icoder.queryapp.service.impl;

import lk.icoder.queryapp.entity.User;
import lk.icoder.queryapp.repository.UserRepository;
import lk.icoder.queryapp.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @Project query-app
 * @Author DILAN on 10/20/2019
 */
@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findUserByUserId(Long userId) {
        return userRepository.findUserByUserId(userId);
    }
}
