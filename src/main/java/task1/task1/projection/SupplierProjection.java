package task1.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import task1.task1.entity.Supplier;

@Projection(types = Supplier.class)
public interface SupplierProjection {
    Integer getId();
    String getName();
    boolean getActive();
    String phoneNumber();
}
