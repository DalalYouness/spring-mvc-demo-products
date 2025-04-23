package ma.enset.springmvcdemo.entites;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Products")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder @ToString
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private long id;
    private String name;
    private double price;
    private int quantity;

}
