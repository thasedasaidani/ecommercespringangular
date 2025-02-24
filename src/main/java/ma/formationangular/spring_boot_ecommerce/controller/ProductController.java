package ma.formationangular.spring_boot_ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ma.formationangular.spring_boot_ecommerce.entity.Product;
import ma.formationangular.spring_boot_ecommerce.repository.ProductRepository;

import java.util.List;

@RestController
@RequestMapping("/api/custom-products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}