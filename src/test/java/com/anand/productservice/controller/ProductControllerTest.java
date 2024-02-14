package com.anand.productservice.controller;


import com.anand.productservice.dto.FakeStoreProductDto;
import com.anand.productservice.models.Products;
import com.anand.productservice.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
/*
@SpringBootTest
class ProductControllerTest {

    @Autowired
    private ProductController productController;

    @MockBean
    private ProductService productService;

    //Sam@2019

    @Test
    void testProductsSameAsService(){
        //arrange
        List<Products> products = new ArrayList<>();
        Products p1

        when(
                productService.getAllProducts()
        ).thenReturn(
                new ArrayList<>()
        );

        //Act
        List<FakeStoreProductDto> products = productController.getAllProducts();

        //assert

    }

}*/