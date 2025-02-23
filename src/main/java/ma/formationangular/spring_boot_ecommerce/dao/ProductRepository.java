//package ma.formationangular.spring_boot_ecommerce.dao;
//
//import org.springframework.data.repository.PagingAndSortingRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//import ma.formationangular.spring_boot_ecommerce.entity.Product;
//import ma.formationangular.spring_boot_ecommerce.projections.FullProductProjection;
//
//@RepositoryRestResource(excerptProjection = FullProductProjection.class)
//public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
//}

//
//
package ma.formationangular.spring_boot_ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.formationangular.spring_boot_ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}