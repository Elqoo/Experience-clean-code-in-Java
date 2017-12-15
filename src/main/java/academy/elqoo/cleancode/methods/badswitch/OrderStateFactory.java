package academy.elqoo.cleancode.methods.badswitch;

import java.util.HashMap;
import java.util.Map;

public class OrderStateFactory {

    public static OrderState create(OrderStatus status){
        return buildStateMap().get(status);
    }

    private static Map<OrderStatus, OrderState> buildStateMap(){
        Map<OrderStatus,OrderState> states = new HashMap<>();
        states.put(OrderStatus.PENDING, new PendingOrderState());
        states.put(OrderStatus.AWAITING_PAYMENT, new AwaitingPaymentOrderState());
        states.put(OrderStatus.AWAITING_SHIPMENT, new AwaitingShipmentOrderState());
        states.put(OrderStatus.AWAITING_PICKUP, new AwaitingPickupOrderState());
        states.put(OrderStatus.COMPLETED, new OrderCompletedState());
        return states;
    }



}
