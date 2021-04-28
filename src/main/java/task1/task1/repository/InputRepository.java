package task1.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import task1.task1.entity.Input;
import task1.task1.projection.InputProjection;

@RepositoryRestResource(path = "input", excerptProjection = InputProjection.class)
public interface InputRepository extends JpaRepository<Input, Integer> {
    boolean existsBySupplierIdAndFactureNumber(Integer supplier_id, String factureNumber);
}
