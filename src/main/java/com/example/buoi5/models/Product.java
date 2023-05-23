package com.example.buoi5.models;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public class Product {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    private  int id;
    @NotBlank(message = "ten san pham ko dc de trong")
    private  String name;
    @Length(min=0,max = 50,message = "Hinh anh hon 50 ky tu")
    private  String img;
    @NotNull(message = "Ko dc de trong")
    @Min(value = 1,message = "ko nho hon 1")
    @Max(value = 99999999,message = "san pham ko lon hon 9999999999")
    private Long price;

    public Product() {

    }

    public Product(int id, String name, String img, Long price) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.price = price;
    }

}
