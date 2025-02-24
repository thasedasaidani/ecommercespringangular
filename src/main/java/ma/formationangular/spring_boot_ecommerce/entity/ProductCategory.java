package ma.formationangular.spring_boot_ecommerce.entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "product_category")
@Getter
@Setter
@JsonInclude(JsonInclude.Include.ALWAYS) // Inclut toutes les propriétés, même NULL
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "products"}) // Ignorer les proxies Hibernate et la relation inverse
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @JsonProperty("id")
    private Long id;

    @Column(name = "category_name")
    @JsonProperty("categoryName")
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Product> products; // Ignoré via JsonIgnoreProperties
}

//package ma.formationangular.spring_boot_ecommerce.entity;
//
//import java.util.Set;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.Table;
//import lombok.Getter;
//import lombok.Setter;
//
//@Entity
//@Table(name = "product_category")
//@Getter
//@Setter
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "products"}) // Ignorer "products" pour éviter la récursion
//public class ProductCategory {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
//
//    @Column(name = "category_name")
//    private String categoryName;
//
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
//    private Set<Product> products;
//}