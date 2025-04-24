package ma.enset.springmvcdemo.web;



import ma.enset.springmvcdemo.entites.Product;
import ma.enset.springmvcdemo.repository.IProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {

    private IProductRepository productRepository;

    public ProductController(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/index")
    public String ListProducts(Model model) {
        List<Product> products = productRepository.findAll();
        model.addAttribute("list_products",products);
        return "listproducts";
    }

    @GetMapping("/deleteProduct")
    public String deleteProduct(@RequestParam(name = "ID") long id)
    {
        productRepository.deleteById(id);
        return "redirect:/index";
    }


}
