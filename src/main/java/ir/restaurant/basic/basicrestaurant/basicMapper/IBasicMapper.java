package ir.restaurant.basic.basicrestaurant.basicMapper;

import java.util.List;

public interface IBasicMapper<E,D> {
    E convertToEntity(D d);
    D convertToModel(E e);
    List<E> convertToEntity(List<D> ListModel);
    List<D> convertToModel(List<E> listEntity);
}
