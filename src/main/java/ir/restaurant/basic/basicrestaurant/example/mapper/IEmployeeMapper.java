package ir.restaurant.basic.basicrestaurant.example.mapper;

import ir.restaurant.basic.basicrestaurant.basicMapper.IBasicMapper;
import ir.restaurant.basic.basicrestaurant.example.entity.employee.EmployeeEntity;
import ir.restaurant.basic.basicrestaurant.example.model.EmployeeModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IEmployeeMapper extends IBasicMapper<EmployeeEntity, EmployeeModel> {
}
