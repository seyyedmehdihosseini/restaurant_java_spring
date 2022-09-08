package ir.restaurant.basic.basicrestaurant.example.entity.customer;

import ir.restaurant.basic.basicrestaurant.example.entity.PersonEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class CustomerEntity extends PersonEntity {
    // نام و نام خانوادگی
    @Column(name = "CUSTOMER_FULL_NAME", nullable = false )
    private String fullName;
    // شماره مبایل
    @Column(name = "CUSTOMER_MOBILE")
    private String mobil;
    // شماره ملی
    @Column(name = "CUSTOMER_NATIONAL_CODE")
    private String nationalCode;
    // آدرس
    @Column(name = "CUSTOMER_ADDRESS")
    private String address;
    // شماره اشتراک
    @Column(name = "CUSTOMER_SHARING_NUMBER")
    private Long sharingNumber;

}
