package com.example.shoppingcart_service.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "SHOPPING_CART")
public class CartEntity {

    @Id
    private Long userId;
    private Long cartId;
    private Integer totalItems;
    private Double totalCost;
    private String products;
}

