package ma.formationangular.spring_boot_ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import ma.formationangular.spring_boot_ecommerce.entity.Product;

@CrossOrigin(origins = "http://localhost:4200") // Autorise uniquement localhost:4200
public interface ProductRepository extends JpaRepository<Product, Long> {
}