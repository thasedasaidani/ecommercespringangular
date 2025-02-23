//package ma.formationangular.spring_boot_ecommerce.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
//import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
//import org.springframework.http.HttpMethod;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//
//import ma.formationangular.spring_boot_ecommerce.entity.Product;
//import ma.formationangular.spring_boot_ecommerce.entity.ProductCategory;
//import ma.formationangular.spring_boot_ecommerce.projections.FullProductProjection;
//
//@Configuration
//public class MyDataRestConfig implements RepositoryRestConfigurer {
//
//    @Override
//    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
//        
//        config.setBasePath("/api");
//        config.exposeIdsFor(Product.class, ProductCategory.class);
//        
//        // Activer les projections globalement
//        config.getProjectionConfiguration()
//              .addProjection(FullProductProjection.class);
//        
//  
//        // Désactivation des méthodes non désirées
//        HttpMethod[] unsupported = {HttpMethod.POST, HttpMethod.PUT, HttpMethod.DELETE};
//        
//        config.getExposureConfiguration()
//            .forDomainType(Product.class)
//            .disablePutForCreation()
//            .withItemExposure((metadata, methods) -> methods.disable(unsupported))
//            .withCollectionExposure((metadata, methods) -> methods.disable(unsupported));
//
//        config.getExposureConfiguration()
//            .forDomainType(Product.class)
//            .withItemExposure((metadata, httpMethods) -> httpMethods.enable(HttpMethod.GET))
//            .withCollectionExposure((metadata, httpMethods) -> httpMethods.enable(HttpMethod.GET));
//    }
//}

package ma.formationangular.spring_boot_ecommerce.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import ma.formationangular.spring_boot_ecommerce.entity.Product;
import ma.formationangular.spring_boot_ecommerce.entity.ProductCategory;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        
        config.setBasePath("/api");
        config.exposeIdsFor(Product.class, ProductCategory.class);
        
  
        // Désactivation des méthodes non désirées
        HttpMethod[] unsupported = {HttpMethod.POST, HttpMethod.PUT, HttpMethod.DELETE};
        
        config.getExposureConfiguration()
            .forDomainType(Product.class)
            .disablePutForCreation()
            .withItemExposure((metdata, methods) -> methods.disable(unsupported))
            .withCollectionExposure((metdata, methods) -> methods.disable(unsupported));
        
        config.getExposureConfiguration()
        .forDomainType(Product.class)
        .withItemExposure((metadata, httpMethods) -> httpMethods.enable(HttpMethod.GET))
        .withCollectionExposure((metadata, httpMethods) -> httpMethods.enable(HttpMethod.GET));

    }
}