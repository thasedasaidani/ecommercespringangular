package ma.formationangular.spring_boot_ecommerce.entity;


import java.math.BigDecimal;
import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name="product") //ON FIXE LE NOM DE NOTRE TABLE QUI EST DANS ECOM DB
@Data  //POUR GENERER LES GITER ET LES SETTERS 
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //auto incrémente 
	@Column (name = "id")
	 private Long id;
	
		@ManyToOne
		@JoinColumn( name = "category_id", nullable = false)
	private ProductCategory category;
	
	
	 @Column (name = "sku")
	 private String sku ;
	 
	 @Column(name = "name")
	 private String name;
	 
	 @Column (name = "unit_price")
	  private BigDecimal unitPrice;
	 
	 @Column(name = "image_url")
	 private String imageUrl;
	
	 @Column(name = "units_in_stock")
	 private Integer unitsInStock;
	
	 @Column(name = "date_created")
	 @CreationTimestamp
	 private Date dateCreated;
	
	 @Column(name = "last_updated")
	 @CreationTimestamp
	 private Date lastUpdated;
}