package ca.gbc.productservice.controller;

import ca.gbc.productservice.DTO.ProductRequest;
import ca.gbc.productservice.DTO.ProductResponse;
import ca.gbc.productservice.model.Product;
import ca.gbc.productservice.service.ProductService;
import io.micrometer.core.ipc.http.HttpSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest) {
        productService.createProduct(productRequest);
    }

}
