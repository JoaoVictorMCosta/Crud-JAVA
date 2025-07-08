package com.example.crud.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.domain.product.Product;
import com.example.crud.domain.product.ProductRepository;
import com.example.crud.domain.product.RequestProduct;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @GetMapping
    // Era: public ResponseEntity getAllProducts()
    public ResponseEntity<List<Product>> getAllProducts() { // Agora retorna uma lista de Product
        var allProducts = repository.findAll();
        return ResponseEntity.ok(allProducts);
    }

    @PostMapping
    // Era: public ResponseEntity registerProduct(@RequestBody @Valid RequestProduct data)
    public ResponseEntity<Void> registerProduct(@RequestBody @Valid RequestProduct data) { // Retorna Void porque não há corpo na resposta 200 OK
        Product newProduct = new Product(data);
        System.out.println(data);
        repository.save(newProduct);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    @Transactional
    // Era: public ResponseEntity updateProduct(@RequestBody @Valid RequestProduct data)
    public ResponseEntity<Product> updateProduct(@RequestBody @Valid RequestProduct data){ // Retorna o Product atualizado
        Optional<Product> optionalProduct = repository.findById(data.id());
        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();
            product.setName(data.name());
            product.setPrice_in_cents(data.price_in_cents());
            product.setStock_units(data.stock_units());
            return ResponseEntity.ok(product);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    @Transactional
    // Era: public ResponseEntity deleteProductById(@PathVariable String id)
    public ResponseEntity<Void> deleteProductById(@PathVariable String id) { // Retorna Void para 204 No Content
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/batch")
    @Transactional
    // Era: public ResponseEntity deleteProductsByIds(@RequestBody List<String> ids)
    public ResponseEntity<?> deleteProductsByIds(@RequestBody List<String> ids) { // Retorna Void para 204 No Content
        if (ids == null || ids.isEmpty()) {
            return ResponseEntity.badRequest().body("A lista de IDs não pode estar vazia.");
        }

        repository.deleteAllById(ids);
        return ResponseEntity.noContent().build();
    }
}