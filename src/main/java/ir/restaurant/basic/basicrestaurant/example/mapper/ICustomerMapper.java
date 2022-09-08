package ir.restaurant.basic.basicrestaurant.example.mapper;

import ir.restaurant.basic.basicrestaurant.basicMapper.IBasicMapper;
import ir.restaurant.basic.basicrestaurant.example.entity.customer.CustomerEntity;
import ir.restaurant.basic.basicrestaurant.example.model.CustomerModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICustomerMapper extends IBasicMapper<CustomerEntity, CustomerModel> {
}
