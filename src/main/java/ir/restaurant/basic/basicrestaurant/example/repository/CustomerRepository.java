package ir.restaurant.basic.basicrestaurant.example.repository;

import ir.restaurant.basic.basicrestaurant.basicRepository.IBasicRepository;
import ir.restaurant.basic.basicrestaurant.example.entity.customer.CustomerEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends IBasicRepository<CustomerEntity,Long> {

}
