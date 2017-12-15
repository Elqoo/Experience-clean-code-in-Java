package academy.elqoo.cleancode.methods.badswitch;

public class OrderCompletedState implements OrderState{


    @Override
    public OrderState next() {
        return new OrderCompletedState();
    }

    @Override
    public OrderStatus getStatus() {
        return OrderStatus.COMPLETED;
    }
}
