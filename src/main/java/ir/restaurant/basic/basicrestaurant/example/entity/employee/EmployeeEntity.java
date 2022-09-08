package ir.restaurant.basic.basicrestaurant.example.entity.employee;

import ir.restaurant.basic.basicrestaurant.example.entity.PersonEntity;
import ir.restaurant.basic.basicrestaurant.example.enums.Gender;
import ir.restaurant.basic.basicrestaurant.example.enums.Responsibility;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PERSONNEL")
@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity extends PersonEntity {
    @Temporal(TemporalType.DATE)
    @Column(name = "PERSONNEL_BIRTHDATE")
    private Date birthDate;
    @Column(name = "PERSONNEL_NATIONAL_CODE",unique = true)
    private String nationalCode;
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "PERSONNEL_RESPONSIBILITY")
    private Responsibility responsibility;
    @Column(name = "PERSONNEL_GENDER")
    private Gender gender;
    @Column(name = "PERSONNEL_ADDRESS")
    private String address;
    @Column(name = "PERSONNEL_CODE",unique = true)
    private long personnelCode;
    @ManyToOne
    @JoinColumn
    private EmployeeEntity personnel;
    @OneToOne
    @PrimaryKeyJoinColumn
    private AccountBankEntity accountBank;

}
