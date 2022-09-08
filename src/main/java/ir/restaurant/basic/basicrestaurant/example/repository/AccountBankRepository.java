package ir.restaurant.basic.basicrestaurant.example.repository;

import ir.restaurant.basic.basicrestaurant.basicRepository.IBasicRepository;
import ir.restaurant.basic.basicrestaurant.example.entity.employee.AccountBankEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountBankRepository extends IBasicRepository<AccountBankEntity,Long> {
}
