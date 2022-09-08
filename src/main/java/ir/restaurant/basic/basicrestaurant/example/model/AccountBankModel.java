package ir.restaurant.basic.basicrestaurant.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountBankModel {
    @Size(min = 5,max = 15 , message = "accountBankModel.valid.size.accNumber")
    private String accNumber;
    @Max(value = 16 , message = "accountBankModel.valid.cardNumber")
    private Long cardNumber;
    @Size(min = 16 , max = 28,message = "accountBankModel.valid.size.shebaNumber")
    private String shebaNumber;
}
