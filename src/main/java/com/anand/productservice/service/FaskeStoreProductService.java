package com.anand.productservice.service;

import com.anand.productservice.dto.AddFakeStoreProductDto;
import com.anand.productservice.dto.FakeStoreProductDto;
import com.anand.productservice.models.Catrgory;
import com.anand.productservice.models.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FaskeStoreProductService implements ProductService{

    private RestTemplate restTemplate;

    @Autowired
    public FaskeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Products getSingleProduct(Long id) {
       FakeStoreProductDto productDto = restTemplate.getForObject(
            "https://fakestoreapi.com/products/" + id,
                FakeStoreProductDto.class);
        return convertFaskeStoreProductToProduct(productDto);
    }

    @Override
    public Products addNewProducts(FakeStoreProductDto addFakeStoreProductDto) {

        FakeStoreProductDto productDto = restTemplate.postForObject(
                "https://fakestoreapi.com/products",
                addFakeStoreProductDto,
                FakeStoreProductDto.class
        );
        return convertFaskeStoreProductToProduct(productDto);
    }

    @Override
    public List<FakeStoreProductDto> getInCategoryProducts(String category) {
        ResponseEntity<List<FakeStoreProductDto>> productDto = restTemplate.exchange(
                "https://fakestoreapi.com/products/category/" + category,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<FakeStoreProductDto>>() {}
        );
        return productDto.getBody();
    }

    @Override
    public List<FakeStoreProductDto> getAllProducts() {
        ResponseEntity<List<FakeStoreProductDto>> productDto = restTemplate.exchange(
                "https://fakestoreapi.com/products",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<FakeStoreProductDto>>() {}
        );
        return productDto.getBody();
    }

    @Override
    public List<String> getAllCategoryProducts() {
        ResponseEntity<List<String>> productDto = restTemplate.exchange(
                "https://fakestoreapi.com/products/categories",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<String>>() {}
        );
        return productDto.getBody();
    }

    @Override
    public Products updateProduct(FakeStoreProductDto fakeStoreProductDto,Long id) {
        restTemplate.put(
                "https://fakestoreapi.com/products/" +id,
                fakeStoreProductDto
        );
        return convertFaskeStoreProductToProduct(fakeStoreProductDto);
    }

    @Override
    public Products deleteProduct(Long id) {
        restTemplate.delete(
                "https://fakestoreapi.com/products/" + id
        );
        return new Products();
    }

    private Products convertFaskeStoreProductToProduct(FakeStoreProductDto fakeStoreProductDto){
        Products products = new Products();
        products.setTitle(fakeStoreProductDto.getTitle());
        products.setId(fakeStoreProductDto.getId());
        products.setPrice(fakeStoreProductDto.getPrice());
        products.setDescription(fakeStoreProductDto.getDescription());
        products.setImage(fakeStoreProductDto.getImage());
        products.setCategory(new Catrgory());
        products.getCategory().setName(fakeStoreProductDto.getCategory());

        return products;
    }
}
