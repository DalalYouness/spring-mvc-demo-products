package ma.enset.springmvcdemo.repository;

import ma.enset.springmvcdemo.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {

}
