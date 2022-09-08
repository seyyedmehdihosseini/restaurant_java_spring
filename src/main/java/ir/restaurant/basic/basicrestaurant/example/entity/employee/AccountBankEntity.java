package ir.restaurant.basic.basicrestaurant.example.entity.employee;

import ir.restaurant.basic.basicrestaurant.basicEntity.BasicEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "ACCOUNT_BANK")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class AccountBankEntity extends BasicEntity {
    @Column(name = "ACCOUNT_BANK_NUMBER")
    private String accNumber;
    @Column(name = "ACCOUNT_BANK_CARD_NUMBER")
    private Long cardNumber;
    @Column(name = "ACCOUNT_BANK_SHEBA_NUMBER")
    private String shebaNumber;
}
