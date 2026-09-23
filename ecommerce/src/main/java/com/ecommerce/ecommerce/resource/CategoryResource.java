package com.ecommerce.ecommerce.resource;


import com.ecommerce.ecommerce.dto.CategoryDTO;
import com.ecommerce.ecommerce.entity.Category;
import com.ecommerce.ecommerce.service.CategoryService;
import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping (value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryService service;

    @GetMapping
    public ResponseEntity <List<CategoryDTO>> findAll(){
        List<CategoryDTO> list = service.findAll();

        return ResponseEntity.ok(list);
    }

    @GetMapping (value = "/{id}" )
    public ResponseEntity<CategoryDTO> findById(@PathVariable Long id){

            CategoryDTO dto = service.findById(id);
            return ResponseEntity.ok().body(dto);
    }
}
