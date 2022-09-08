package ir.restaurant.basic.basicrestaurant.example.entity.order;

import ir.restaurant.basic.basicrestaurant.basicEntity.BasicEntity;
import ir.restaurant.basic.basicrestaurant.example.entity.customer.CustomerEntity;
import ir.restaurant.basic.basicrestaurant.example.entity.employee.EmployeeEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class OrderEntity extends BasicEntity {

    @ManyToOne
    @JoinColumn
    private EmployeeEntity employeeEntity;

    @ManyToOne
    @JoinColumn
    private CustomerEntity customerEntity;


}
