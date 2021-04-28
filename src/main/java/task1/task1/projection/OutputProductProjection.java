package task1.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import task1.task1.entity.Output;
import task1.task1.entity.OutputProduct;
import task1.task1.entity.Product;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

@Projection(types = OutputProduct.class)
public interface OutputProductProjection {
    Integer id();

    Product product();

    double amount();

    double price();

    Output output();
}
