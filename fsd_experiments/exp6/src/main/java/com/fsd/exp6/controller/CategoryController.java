package com.fsd.exp6.controller;

import com.fsd.exp6.entity.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
@CrossOrigin(origins = "http://localhost:5173")
public class CategoryController {

    private final List<Category> categories = new ArrayList<>();

    @GetMapping
    public List<Category> getCategories() {
        return categories;
    }
    
    @PostMapping
    public ResponseEntity<Category> createCategory(@RequestBody Category category) {
        categories.add(category);
        return ResponseEntity.ok(category);
    }
}
