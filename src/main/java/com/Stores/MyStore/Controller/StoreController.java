package com.Stores.MyStore.Controller;

import com.Stores.MyStore.Entity.Product;
import com.Stores.MyStore.Entity.Store;
import com.Stores.MyStore.Repositories.ProductRepository;
import com.Stores.MyStore.Repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;

@Controller
public class StoreController {

    @Autowired
    StoreRepository storeRepository;

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/post")
    public   String methodGetForPost() throws Exception {

        Store store= new Store("Second magas","Yagotin");


Product product=new Product("Moloko+Ryajanka",12.03f,"dobre");
Product product2=new Product("Vaflya",87.045f,"Artek");

//productRepository.save(product);

        store.addProduct(product);
        store.addProduct(product2);

        storeRepository.save(store);
        return "index";
    }



}
