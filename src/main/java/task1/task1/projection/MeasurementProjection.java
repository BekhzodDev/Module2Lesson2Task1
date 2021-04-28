package task1.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import task1.task1.entity.Category;
import task1.task1.entity.Measurement;

@Projection(types = Measurement.class)
public interface MeasurementProjection {
    Integer getId();
    String getName();
    boolean getActive();
}
