package academy.elqoo.cleancode.methods.badswitch;

public interface OrderState {

    OrderState next();

    OrderStatus getStatus();

}
