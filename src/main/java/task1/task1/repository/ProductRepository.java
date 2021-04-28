package task1.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import task1.task1.entity.Category;
import task1.task1.entity.Product;
import task1.task1.projection.ProductProjection;

@RepositoryRestResource(path = "product", excerptProjection = ProductProjection.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {

boolean existsByNameAndCategoryId(String name, Integer category_id);
}
