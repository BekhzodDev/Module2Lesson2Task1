package task1.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import task1.task1.entity.Category;
import task1.task1.entity.Client;

@Projection(types = Client.class)
public interface ClientProjection {

    Integer getId();

    String getName();

    boolean getActive();

    String phoneNumber();
}
