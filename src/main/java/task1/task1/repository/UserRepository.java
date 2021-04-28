package task1.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import task1.task1.entity.Users;
import task1.task1.projection.UserProjection;

@RepositoryRestResource(path = "user", excerptProjection = UserProjection.class)
public interface UserRepository extends JpaRepository<Users, Integer> {
    boolean existsByPhoneNumber(String phoneNumber);
}
