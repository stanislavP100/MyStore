package com.Stores.MyStore.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Table(name = "store", catalog = "stores")

public class Store {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @Column(name="store_id")
    private Long id;
    
    @Column(name = "store_name")
    private String name;

    @Column(name = "store_address")
    private String address;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "store")

    private List<Product> productList;


   // private List <Category> categories;



    public Store(String name, String address) {

        this.name = name;
        this.address = address;
       this.productList = new ArrayList<>();

       // this.categories = new ArrayList<>();
    }

    public Store() {
    }

    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
               ", productList=" + productList +
              //  ", categories=" + categories +
                '}';
    }

    public void addProduct(Product product){
        this.setProductList(Arrays.asList(product));
        product.setStore(this);
    }



    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

//    public void setCategories(List<Category> categories) {
//        this.categories = categories;
//    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<Product> getProductList() {
        return productList;
    }

//    public List<Category> getCategories() {
//        return categories;
//    }
}
