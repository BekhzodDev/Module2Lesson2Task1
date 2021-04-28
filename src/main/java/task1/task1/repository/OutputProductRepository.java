package task1.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import task1.task1.entity.OutputProduct;
import task1.task1.projection.OutputProductProjection;

@RepositoryRestResource(path = "outputproduct", excerptProjection = OutputProductProjection.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {
}
