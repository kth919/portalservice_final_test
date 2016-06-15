package repository;

import model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by admin on 2016-06-15.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
