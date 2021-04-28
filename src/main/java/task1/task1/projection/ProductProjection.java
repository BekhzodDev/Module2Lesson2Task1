package task1.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import task1.task1.entity.Attachment;
import task1.task1.entity.Category;
import task1.task1.entity.Measurement;
import task1.task1.entity.Product;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Projection(types = Product.class)
public interface ProductProjection {
    Integer getId();

    String getName();

    boolean getActive();

    Category category();

    Attachment attachment();

    String code();

    Measurement measurement();
}
