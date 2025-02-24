package ma.formationangular.spring_boot_ecommerce.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "product")
@Getter
@Setter
@JsonInclude(JsonInclude.Include.ALWAYS) // Inclut toutes les propriétés, même NULL
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @JsonProperty("id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    @JsonProperty("category")
    private ProductCategory category;

    @Column(name = "sku")
    @JsonProperty("sku")
    private String sku;

    @Column(name = "name")
    @JsonProperty("name")
    private String name;

    @Column(name = "description")
    @JsonProperty("description")
    private String description;

    @Column(name = "unit_price")
    @JsonProperty("unitPrice")
    private BigDecimal unitPrice;

    @Column(name = "image_url")
    @JsonProperty("imageUrl")
    private String imageUrl;

    @Column(name = "units_in_stock")
    @JsonProperty("unitsInStock")
    private Integer unitsInStock;

    @Column(name = "date_created")
    @JsonProperty("dateCreated")
    private LocalDateTime dateCreated;

    @Column(name = "last_updated")
    @CreationTimestamp
    @JsonProperty("lastUpdated")
    private LocalDateTime lastUpdated;

    @Column(name = "active", columnDefinition = "TINYINT(1)")
    @JsonProperty("active")
    private Boolean active;
}

//package ma.formationangular.spring_boot_ecommerce.entity;
//
//import java.math.BigDecimal;
//import java.time.LocalDateTime;
//
//import org.hibernate.annotations.CreationTimestamp;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;
//import lombok.Getter;
//import lombok.Setter;
//
//@Entity
//@Table(name = "product")
//@Getter
//@Setter
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) // Pour éviter les problèmes avec Hibernate
//public class Product {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "category_id", nullable = false)
//    private ProductCategory category;
//
//    @Column(name = "sku")
//    private String sku;
//
//    @Column(name = "name")
//    private String name;
//
//    @Column(name = "description")
//    private String description;
//
//    @Column(name = "unit_price")
//    private BigDecimal unitPrice;
//
//    @Column(name = "image_url")
//    private String imageUrl;
//
//    @Column(name = "units_in_stock")
//    private Integer unitsInStock;
//
//    @Column(name = "date_created")
//    @CreationTimestamp
//    private LocalDateTime dateCreated;
//
//    @Column(name = "last_updated")
//    @CreationTimestamp
//    private LocalDateTime lastUpdated;
//
//    @Column(name = "active", columnDefinition = "TINYINT(1)")
//    private Boolean active;
//}