package ir.restaurant.basic.basicrestaurant.basicRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

@NoRepositoryBean
public interface IBasicRepository<E, P> extends PagingAndSortingRepository<E, P>, CrudRepository<E,P> {
}
