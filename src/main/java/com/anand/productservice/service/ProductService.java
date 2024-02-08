package com.anand.productservice.service;

import com.anand.productservice.dto.AddFakeStoreProductDto;
import com.anand.productservice.dto.FakeStoreProductDto;
import com.anand.productservice.models.Products;

import java.util.List;

public interface ProductService {

    Products getSingleProduct(Long id);

    Products addNewProducts(FakeStoreProductDto addFakeStoreProductDto);

    List<FakeStoreProductDto> getInCategoryProducts(String category);

    List<FakeStoreProductDto> getAllProducts();

    List<String> getAllCategoryProducts();

    Products updateProduct(FakeStoreProductDto fakeStoreProductDto,Long id);

    Products deleteProduct(Long id);
}
