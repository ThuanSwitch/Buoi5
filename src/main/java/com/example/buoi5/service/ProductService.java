package com.example.buoi5.service;

import com.example.buoi5.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService {
    private List<Product> listproduct = new ArrayList<>();
    public  ProductService (){

    }
    public  void add (Product newProduct)
    {
        listproduct.add(newProduct);
    }
    public  List<Product> GetAll()
    {
        return  listproduct;
    }
    public Product get (int id){
        return listproduct.stream().filter( p->p.getId()==id).findFirst().orElse(null);
    }
    public void edit (Product editProduct)
    {

    }



}
