package com.anand.productservice.controller;

import com.anand.productservice.dto.AddFakeStoreProductDto;
import com.anand.productservice.dto.FakeStoreProductDto;
import com.anand.productservice.models.Products;
import com.anand.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public List<FakeStoreProductDto> getAllProducts(){

        return productService.getAllProducts();
    }

    @GetMapping("/allCategory")
    public List<String> getAllCategoryProducts(){

        return productService.getAllCategoryProducts();
    }

    @GetMapping("/{id}")
    public Products getProduct( @PathVariable("id") Long id){

        return productService.getSingleProduct(id);
    }

    @GetMapping("/category/{id}")
    public List<FakeStoreProductDto> getInCategoryProduct( @PathVariable("id") String category){

        return productService.getInCategoryProducts(category);
    }

    @PostMapping("/")
    public Products addNewProduct(@RequestBody FakeStoreProductDto addFakeStoreProductDto){

        return productService.addNewProducts(addFakeStoreProductDto);
    }

    @PatchMapping("/{id}")
    public Products updateProduct( @PathVariable("id") Long id, @RequestBody Products products){
        return new Products();
    }

    @PutMapping("/{id}")
    public Products replaceProduct( @PathVariable("id") Long id, @RequestBody FakeStoreProductDto fakeStoreProductDto){
        return productService.updateProduct(fakeStoreProductDto,id);
    }

    @DeleteMapping("/{id}")
    public Products deleteProduct( @PathVariable("id") Long id){
        return productService.deleteProduct(id);
    }

}
