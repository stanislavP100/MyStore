package com.Stores.MyStore;

//import com.Stores.MyStore.Controller.StoreController;
import com.Stores.MyStore.Entity.Product;
import com.Stores.MyStore.Entity.Store;
import com.Stores.MyStore.Repositories.ProductRepository;
import com.Stores.MyStore.Repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MyStoreApplication {
	@Autowired
			static
	StoreRepository storeRepository;

	@Autowired
	ProductRepository productRepository;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MyStoreApplication.class, args);


	}




}
