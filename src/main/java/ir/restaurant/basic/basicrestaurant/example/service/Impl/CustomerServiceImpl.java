package ir.restaurant.basic.basicrestaurant.example.service.Impl;

import ir.restaurant.basic.basicrestaurant.example.entity.customer.CustomerEntity;
import ir.restaurant.basic.basicrestaurant.example.mapper.ICustomerMapper;
import ir.restaurant.basic.basicrestaurant.example.model.CustomerModel;
import ir.restaurant.basic.basicrestaurant.example.repository.CustomerRepository;
import ir.restaurant.basic.basicrestaurant.example.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customRepo;
    private ICustomerMapper customMap;

    @Override
    public CustomerModel save(CustomerModel customerModel) {
        CustomerEntity customerEntity = customMap.convertToEntity(customerModel);
        CustomerEntity newEntity = customRepo.save(customerEntity);
        if (newEntity.getID()!=null){
            return customMap.convertToModel(newEntity);
        }
        return null; // throw exception
    }

    @Override
    public CustomerModel findByCode(Long id) {
        CustomerEntity customerEntity = customRepo.findById(id).get();
        if (customerEntity.getID()!=null){
            return customMap.convertToModel(customerEntity);
        }
        return null; // throw exception
    }

    @Override
    public boolean existByCode(Long id) {
        return customRepo.existsById(id);
    }

    @Override
    public boolean deleteByCode(Long id) {
        CustomerEntity customerEntity = customRepo.findById(id).get();
        if (customerEntity.getID()!=null){
            customerEntity.setDeleted(true);
            customRepo.save(customerEntity);
            return true;
        }
        return false;
    }

    @Override
    public List<CustomerModel> findAll() {
        List<CustomerEntity> findList= (List<CustomerEntity>) customRepo.findAll();
        if (!findList.isEmpty()){
            return customMap.convertToModel(findList);
        }
        return null; // throw exception
    }
}
