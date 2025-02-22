package ma.formationangular.spring_boot_ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.formationangular.spring_boot_ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
