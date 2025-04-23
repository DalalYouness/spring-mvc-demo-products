package ma.enset.springmvcdemo;

import ma.enset.springmvcdemo.entites.Product;
import ma.enset.springmvcdemo.repository.IProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication
public class SpringMvcDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringMvcDemoApplication.class, args);
    }

    @Bean
    CommandLineRunner start(IProductRepository productRepository) {
        return args -> {
            Product product = Product.builder()
                    .name("Sumsung")
                    .price(7500)
                    .quantity(3)
                    .build();
                    productRepository.save(product);

                    productRepository.save(Product.builder().
                            name("Iphone").price(1450).quantity(2).build());

                    productRepository.save(Product.builder().
                    name("Nokia").price(166.5d).quantity(7).build());

            List<Product> products = productRepository.findAll();
            products.forEach(p -> System.out.println(p.toString()));
        };
    }

}
