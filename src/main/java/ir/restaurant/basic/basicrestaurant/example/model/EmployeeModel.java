package ir.restaurant.basic.basicrestaurant.example.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import ir.restaurant.basic.basicrestaurant.example.enums.Gender;
import ir.restaurant.basic.basicrestaurant.example.enums.Responsibility;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.implementation.bind.annotation.Empty;

import javax.validation.constraints.*;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeModel {
    @Size(min = 2 , max = 40 , message = "employeeModel.valid.size.name")
    @NotEmpty(message = "employeeModel.valid.empty.name")
    private String name;
    @Size(min = 3 , max = 40 , message = "employeeModel.valid.size.family")
    @NotEmpty(message = "employeeModel.valid.empty.family")
    private String family;
    @Max(value = 11,message = "employeeModel.valid.mobil")
    @NotEmpty(message = "employeeModel.valid.empty.mobil")
    private String phoneNumber;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;
    @Max(value = 10,message = "employeeModel.valid.nationalCode")
    @NotEmpty(message = "employeeModel.valid.empty.nationalCode")
    private String nationalCode;
    private Responsibility responsibility;
    private Gender gender;
    @Size(min = 3 , max = 100 , message = "employee.valid.size.address")
    @NotEmpty(message = "employeeModel.valid.empty.address")
    private String address;
    //کد پرسنلی
    private long personnelCode;
    // جوین به خودشه
    private Long personnel;

}
