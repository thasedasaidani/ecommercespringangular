//package ma.formationangular.spring_boot_ecommerce.projections;
//
//import ma.formationangular.spring_boot_ecommerce.entity.Product;
//
//import org.springframework.data.rest.core.config.Projection;
//
//import java.math.BigDecimal;
//import java.util.Date;
//
//@Projection(name = "fullProduct", types = Product.class )
//public interface FullProductProjection {
//    Long getId();
//    String getSku();
//    String getName();
//    BigDecimal getUnitPrice();
//    String getImageUrl();
//    Boolean getActive();
//    Integer getUnitsInStock();
//    Date getDateCreated();
//    Date getLastUpdated();
//}


package ma.formationangular.spring_boot_ecommerce.projections;

import ma.formationangular.spring_boot_ecommerce.entity.Product;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.math.BigDecimal;
import java.util.Date;

@Projection(name = "fullProduct", types = { Product.class })
public interface FullProductProjection {
    Long getId();
    String getSku();
    String getName();
    String getDescription();
    BigDecimal getUnitPrice();
    String getImageUrl();
    Boolean getActive();
    Integer getUnitsInStock();
    Date getDateCreated();
    Date getLastUpdated();
    
    @Value("#{target.category.categoryName}")
    String getCategoryName();
}