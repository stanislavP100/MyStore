package com.Stores.MyStore.Repositories;

import com.Stores.MyStore.Entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
}
