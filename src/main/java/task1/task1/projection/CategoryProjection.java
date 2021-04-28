package task1.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import task1.task1.entity.Category;

@Projection(types = Category.class)
public interface CategoryProjection {
    Integer getId();
    String getName();
    Category getParentCategory();
    boolean getActive();
}
