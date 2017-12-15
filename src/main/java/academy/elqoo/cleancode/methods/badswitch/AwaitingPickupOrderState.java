package academy.elqoo.cleancode.methods.badswitch;

public class AwaitingPickupOrderState implements OrderState{

    @Override
    public OrderState next() {
        return new OrderCompletedState();
    }

    @Override
    public OrderStatus getStatus() {
        return OrderStatus.AWAITING_PICKUP;
    }

}
