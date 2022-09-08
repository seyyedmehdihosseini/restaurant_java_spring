package ir.restaurant.basic.basicrestaurant.example.repository;

import ir.restaurant.basic.basicrestaurant.basicRepository.IBasicRepository;
import ir.restaurant.basic.basicrestaurant.example.entity.employee.EmployeeEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends IBasicRepository<EmployeeEntity,Long> {
EmployeeEntity findByNationalCode(String nationalCode);
boolean existsByNationalCode(String nationalCode);
}
