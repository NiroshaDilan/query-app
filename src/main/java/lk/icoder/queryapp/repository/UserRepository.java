package lk.icoder.queryapp.repository;

import lk.icoder.queryapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Project query-app
 * @Author DILAN on 10/20/2019
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByUserId(Long userId);
}
