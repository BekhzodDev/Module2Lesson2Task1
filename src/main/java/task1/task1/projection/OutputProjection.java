package task1.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import task1.task1.entity.Client;
import task1.task1.entity.Currency;
import task1.task1.entity.Output;
import task1.task1.entity.Warehouse;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@Projection(types = Output.class)
public interface OutputProjection {
    Integer id();

    Timestamp date();

    Warehouse warehouse();

    Client client();

    Currency currency();

    String factureNumber();

    String code();
}
