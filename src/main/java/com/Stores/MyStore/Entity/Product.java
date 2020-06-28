package com.Stores.MyStore.Entity;

import javax.persistence.*;

@Entity
@Table(name="products", catalog = "stores")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private Long id;

    @Column(name = "product_name")
    private String name;

    @Column(name = "product_price")
    private Float price;

    @Column(name = "product_description")
    private String description;



    @ManyToOne
    @JoinColumn(name="store_id", nullable=false)
    private Store store;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setStore(Store store) {
        this.store = store;
    }
    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Store getStore() {
        return store;
    }



//    public Category getCategory() {
//        return category;
//    }

//    public void setCategory(Category category) {
//        this.category = category;
//    }

    public Product() {
    }

//    private Category category;

    public Product(String name,
                   Float price,
                   String description
                 //  Store store
//                   Category category
   ) {
        this.name = name;
        this.price = price;
        this.description = description;
       // this.store = store;
      //  this.category = category;
    }
}
