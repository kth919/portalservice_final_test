package main.repository;

import main.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 2016-06-15.
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
