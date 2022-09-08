package ir.restaurant.basic.basicrestaurant.example.controller;

import ir.restaurant.basic.basicrestaurant.example.model.AccountBankModel;
import ir.restaurant.basic.basicrestaurant.example.model.EmployeeModel;
import ir.restaurant.basic.basicrestaurant.example.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personnel/")
@AllArgsConstructor
public class PersonnelController {
    private EmployeeService employeeService;

    @RequestMapping(value ="add-new-account-employee/" ,method = RequestMethod.POST)
    public ResponseEntity<?> addNewEmployee(@RequestBody EmployeeModel employeeModel){
        try {
            EmployeeModel newEmployeeModel = employeeService.save(employeeModel);
            return new ResponseEntity<>(newEmployeeModel, HttpStatus.CREATED);
        }catch (Exception ex){
            return ResponseEntity.ok(ex);
        }
    }

    @RequestMapping(value = "get-employee-by-{id}/",method = RequestMethod.POST)
    public ResponseEntity<?> findEmployeeByNationalCode(@PathVariable("id") String nationalCode){
        try {
            EmployeeModel employeeModel = employeeService.findByCode(nationalCode);
            return new ResponseEntity<>(employeeModel, HttpStatus.OK);
        }catch (Exception ex){
            return ResponseEntity.ok(ex);
        }
    }

    @RequestMapping(value = "inactive-account-by-{id}/",method = RequestMethod.POST)
    public ResponseEntity<?> inactiveAccountEmployee(@PathVariable("id") String nationalCode){
        try {
            boolean change= employeeService.deleteByCode(nationalCode);
            return new ResponseEntity<>(change,HttpStatus.OK);
        }catch (Exception ex){
            return ResponseEntity.ok(ex);
        }
    }


    @RequestMapping(value = "list-employee/",method = RequestMethod.POST)
    public ResponseEntity<?> getListAllEmployee(){
        try {
            List<EmployeeModel> listEmployee = employeeService.findAll();
            return new ResponseEntity<>(listEmployee,HttpStatus.OK);
        }catch (Exception ex){
            return ResponseEntity.ok(ex);
        }
    }


    @RequestMapping(value = "account-bank-employee-{id}/",method = RequestMethod.POST)
    public ResponseEntity<?> addAccountBankForEmployeeByNationalCode(@PathVariable("id") String nationalCode,@RequestBody AccountBankModel accountBankModel){
        try {
            EmployeeModel addAccountBank =
                    employeeService.addAccountBankForPersonnel(nationalCode, accountBankModel);
            return new ResponseEntity<>(addAccountBank,HttpStatus.OK);
        }catch (Exception ex){
            return ResponseEntity.ok(ex);
        }
    }



}
