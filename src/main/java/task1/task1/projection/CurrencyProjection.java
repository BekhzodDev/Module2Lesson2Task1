package task1.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import task1.task1.entity.Category;
import task1.task1.entity.Currency;

@Projection(types = Currency.class)
public interface CurrencyProjection {
    Integer getId();
    String getName();
    boolean getActive();
}
