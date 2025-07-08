package com.example.crud.domain.product;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="product")
@Entity(name="product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private Integer price_in_cents;

    private Integer stock_units; // Mantenha como Integer para consistência com RequestProduct

    // Construtor principal para criar um Product a partir de um RequestProduct
    public Product(RequestProduct requestProduct){
        this.name = requestProduct.name();
        this.price_in_cents = requestProduct.price_in_cents();
        // Se stock_units for nulo no RequestProduct, defina como 0, caso contrário, use o valor fornecido
        this.stock_units = (requestProduct.stock_units() != null) ? requestProduct.stock_units() : 0;
    }
}