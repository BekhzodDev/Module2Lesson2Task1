package task1.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import task1.task1.entity.Warehouse;

@Projection(types = Warehouse.class)
public interface WarehouseProjection {
    Integer getId();
    String getName();
    boolean getActive();
}
