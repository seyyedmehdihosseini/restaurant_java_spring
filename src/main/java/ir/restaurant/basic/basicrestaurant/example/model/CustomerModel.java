package ir.restaurant.basic.basicrestaurant.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerModel {
    @Size(min = 3 ,max = 100 ,message = "customerModel.valid.size.fullName")
    @NotEmpty(message = "customerModel.valid.empty.fullName")
    private String fullName;
    @Max(value = 11,message = "customerModel.valid.mobil")
    private String mobil;
    @Max(value =10 ,message = "customerModel.valid.nationalCode")
    private String nationalCode;
    @Size(min = 3 , max = 150,message = "customerModel.valid.size.address")
    private String address;
    private Long sharingNumber;

}
