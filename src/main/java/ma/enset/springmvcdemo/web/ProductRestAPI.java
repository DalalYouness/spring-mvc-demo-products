package ma.enset.springmvcdemo.web;

import ma.enset.springmvcdemo.entites.Product;
import ma.enset.springmvcdemo.repository.IProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestAPI {
    private IProductRepository productRepository;

    public ProductRestAPI(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable(name = "id") long id) {
        return productRepository.findById(id).get();
    }
}
