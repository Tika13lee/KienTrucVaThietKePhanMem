package org.example.lethithuykieu_jms.repository;

import org.example.lethithuykieu_jms.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
