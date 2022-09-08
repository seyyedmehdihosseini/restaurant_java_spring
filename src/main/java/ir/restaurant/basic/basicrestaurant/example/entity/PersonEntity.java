package ir.restaurant.basic.basicrestaurant.example.entity;

import ir.restaurant.basic.basicrestaurant.basicEntity.BasicEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class PersonEntity extends BasicEntity {
    @Column(name = "PERSONNEL_NAME")
    private String name;
    @Column(name = "PERSONNEL_FAMILY")
    private String family;
    @Column(name = "PERSONNEL_PHONE_NUMBER")
    private String phoneNumber;

}
