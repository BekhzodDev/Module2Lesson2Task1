package task1.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import task1.task1.entity.Users;
import task1.task1.entity.Warehouse;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import java.util.Set;

@Projection(types = Users.class)
public interface UserProjection {
    int id();

    String firstName();

    String lastName();

    String phoneNumber();

    String code();

    String password();

    boolean active();

    Set<Warehouse> warehouses();
}
