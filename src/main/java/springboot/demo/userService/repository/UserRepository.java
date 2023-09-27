package springboot.demo.userService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.demo.userService.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
