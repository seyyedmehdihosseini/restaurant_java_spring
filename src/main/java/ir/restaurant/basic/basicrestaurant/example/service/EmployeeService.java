package ir.restaurant.basic.basicrestaurant.example.service;

import ir.restaurant.basic.basicrestaurant.basicService.IBasicService;
import ir.restaurant.basic.basicrestaurant.example.model.AccountBankModel;
import ir.restaurant.basic.basicrestaurant.example.model.EmployeeModel;

public interface EmployeeService extends IBasicService<EmployeeModel,String> {
    EmployeeModel addAccountBankForPersonnel(String nationalCode , AccountBankModel accountBankModel);
}
