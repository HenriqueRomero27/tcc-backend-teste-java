package application.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.user.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
