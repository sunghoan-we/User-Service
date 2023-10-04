package springboot.demo.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.demo.userservice.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
