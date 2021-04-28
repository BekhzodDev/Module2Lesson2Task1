package task1.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import task1.task1.entity.Currency;
import task1.task1.entity.Input;
import task1.task1.entity.Supplier;
import task1.task1.entity.Warehouse;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

@Projection(types = Input.class)
public interface InputProjection {
    Integer id();

    Warehouse warehouse();

    Supplier supplier();

    Currency currency();

    String factureNumber();

    String code();

}
