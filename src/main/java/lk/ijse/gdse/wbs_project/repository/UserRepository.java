package lk.ijse.gdse.wbs_project.repository;


import lk.ijse.gdse.wbs_project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
