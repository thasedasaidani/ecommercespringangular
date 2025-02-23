package ma.formationangular.spring_boot_ecommerce.entity;



import java.util.Set;

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
@Table (name ="product_category")
@Getter
@Setter
public class ProductCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //auto incrémente 
	@Column (name = "id")
	private Long id ;
	@Column (name = " category_name ")
	private String  CategoryName ;

	@OneToMany(cascade = CascadeType.ALL , mappedBy = "category")
	private Set<Product>products; 

}
