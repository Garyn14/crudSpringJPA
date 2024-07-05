package unmsm.springJPA.tare8.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unmsm.springJPA.tare8.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
