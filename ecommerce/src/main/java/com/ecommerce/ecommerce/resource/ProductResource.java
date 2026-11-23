package com.ecommerce.ecommerce.resource;


import com.ecommerce.ecommerce.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/produtos")
@AllArgsConstructor
public class ProductResource {

    private final ProductService productService;

}
