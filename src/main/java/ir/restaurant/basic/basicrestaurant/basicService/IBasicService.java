package ir.restaurant.basic.basicrestaurant.basicService;

import java.util.List;

public interface IBasicService<D,P> {
    D save(D d);
    D findByCode(P id);
    boolean existByCode(P id);
    boolean deleteByCode(P id);
    List<D> findAll();

}
