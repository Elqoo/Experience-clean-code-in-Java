package academy.elqoo.cleancode.methods.badswitch;

public class AwaitingPaymentOrderState implements OrderState{

    @Override
    public OrderState next() {
        return new AwaitingShipmentOrderState();
    }

    @Override
    public OrderStatus getStatus() {
        return OrderStatus.AWAITING_PAYMENT;
    }
}
