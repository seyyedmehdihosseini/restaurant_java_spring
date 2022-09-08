package ir.restaurant.basic.basicrestaurant.example.exception_handler;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BasicException extends RuntimeException{
    public BasicException() {
        super();
    }

    public BasicException(String message) {
        super(message);
    }
}
