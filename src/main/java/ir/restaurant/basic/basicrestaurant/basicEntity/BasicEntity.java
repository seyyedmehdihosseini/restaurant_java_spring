package ir.restaurant.basic.basicrestaurant.basicEntity;

import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@MappedSuperclass
public abstract class BasicEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID ;
    @Version
    private Integer version;
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @CreatedBy
    private String createdBy;
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
    @LastModifiedBy
    private String lastModifiedBy;
    @Column(name = "deleted")
    private boolean deleted = false;

}