package academy.elqoo.cleancode.methods.badswitch;

public class AwaitingShipmentOrderState implements OrderState{

    @Override
    public OrderState next() {
        return new AwaitingPickupOrderState();
    }

    @Override
    public OrderStatus getStatus() {
        return OrderStatus.AWAITING_SHIPMENT;
    }

}
