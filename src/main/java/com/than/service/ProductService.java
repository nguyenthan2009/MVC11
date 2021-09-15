package com.than.service;

import com.than.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService {
    private static ArrayList<Product> products = new ArrayList<>();
    static {
        products.add(new Product(1,"Xe may",300,"Honda"));
        products.add(new Product(2,"O to",700,"Meserdest"));
        products.add(new Product(3,"Tu lanh",100,"Panasonic"));
        products.add(new Product(4,"Dien thoai",200,"Appple"));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void save(Product product) {
       products.add(product);
    }

    @Override
    public Product findById(int id) {
       return products.get(id);
    }

    @Override
    public Product findByName(String name) {
        Product product = null;
        for (int i =0;i< products.size();i++){
            if(products.get(i).getName().equals(name)){
                product = products.get(i);
            }
        }
        return product;

    }

    @Override
    public void update(int id, Product product) {
      products.add(id,product);
    }

    @Override
    public void remove(int id) {
      products.remove(id);
    }
}
