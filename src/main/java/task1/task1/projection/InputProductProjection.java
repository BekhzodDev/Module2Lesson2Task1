package task1.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import task1.task1.entity.Input;
import task1.task1.entity.InputProduct;
import task1.task1.entity.Product;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface InputProductProjection {
    Integer id();
    Double amount();
    Double price();
    Date expireDate();
    Product product();
    Input input();
}
