package ma.formationangular.spring_boot_ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ma.formationangular.spring_boot_ecommerce.entity.ProductCategory;

@RepositoryRestResource(collectionResourceRel = "productCategory" , path="product-category")

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

}
