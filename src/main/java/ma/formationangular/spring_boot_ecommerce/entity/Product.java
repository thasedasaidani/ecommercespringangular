package ma.formationangular.spring_boot_ecommerce.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Table(name="product")
@Data

public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //auto incrémente 
	@Column (name = "id")
     private Long id;

    
	 @Column (name = "sku")
  	  private String sku;
	
	  @Column (name = "name")
	  private String name;
	
	 @Column (name = "description")
	  private String description;
	
	 @Column (name = "unit_price")
	  private BigDecimal unitPrice;
	 
	  @Column (name = "image_url")
      private String imageUrl;
	  
	  @Column (name = "active")
      private Boolean active;
	  
   	@Column (name = "unit_stock")
      private Integer unitsInStock;
   	
    @Column(name = "date_created")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name = "last_updated")
    @CreationTimestamp
    private Date lastUpdated;

}
