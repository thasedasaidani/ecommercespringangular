package ma.formationangular.spring_boot_ecommerce.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.mapping.ExposureConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import ma.formationangular.spring_boot_ecommerce.entity.Product;
import ma.formationangular.spring_boot_ecommerce.entity.ProductCategory;
import ma.formationangular.spring_boot_ecommerce.projections.FullProductProjection;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
    	  HttpMethod[] unsupportedActions = {HttpMethod.POST, HttpMethod.PUT, HttpMethod.DELETE};

          // Désactiver les méthodes HTTP pour Product
          config.getExposureConfiguration()
                  .forDomainType(Product.class)
                  .withItemExposure((metadata, httpMethods) -> httpMethods.disable(unsupportedActions))
                  .withCollectionExposure((metadata, httpMethods) -> httpMethods.disable(unsupportedActions));

          // Désactiver les méthodes HTTP pour ProductCategory
          config.getExposureConfiguration()
                  .forDomainType(ProductCategory.class)
                  .withItemExposure((metadata, httpMethods) -> httpMethods.disable(unsupportedActions))
                  .withCollectionExposure((metadata, httpMethods) -> httpMethods.disable(unsupportedActions));

        config.setBasePath("/api");  // Laissez juste la configuration de base
        config.exposeIdsFor(Product.class, ProductCategory.class); // Expose les IDs pour Product et ProductCategory
    }
}
