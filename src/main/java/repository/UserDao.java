package repository;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by admin on 2016-06-11.
 */
public interface UserDao extends JpaRepository<SecurityProperties.User, Integer> {
}
