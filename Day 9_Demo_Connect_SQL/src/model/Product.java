package model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Product {
    private int productId;
    private String productName;
    private String productMadeIn;
    private int productStatus;
}
