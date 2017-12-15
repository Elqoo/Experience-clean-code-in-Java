package academy.elqoo.cleancode.methods.badswitch;

public class PendingOrderState implements OrderState{

    @Override
    public OrderState next() {
        return new AwaitingPaymentOrderState();
    }

    @Override
    public OrderStatus getStatus() {
        return OrderStatus.PENDING;
    }

}
