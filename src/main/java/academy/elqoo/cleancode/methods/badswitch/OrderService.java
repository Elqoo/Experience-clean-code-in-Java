package academy.elqoo.cleancode.methods.badswitch;

public class OrderService {

    public void transitionOrder(Order order){
        switch (order.getStatus()){
	  case PENDING:
	      transitionToAwaitingPayment(order);
	      break;
	  case AWAITING_PAYMENT:
	      transitionToAwaitingShipment(order);
	      break;
	  case AWAITING_SHIPMENT:
	      transitionToAwaitingPickup(order);
	      break;
	  case AWAITING_PICKUP:
	      transationToComplete(order);
	      break;
	  case COMPLETED:
	      throw new IllegalStateException("Cannot transition beyond complete");
        }
    }

    private void transitionToAwaitingPayment(Order order){
        System.out.println("Preparing awaiting payment workflow");
        order.setStatus(OrderStatus.AWAITING_PAYMENT);
    }

    private void transitionToAwaitingShipment(Order order){
        System.out.println("Preparing awaiting shipment workflow");
        order.setStatus(OrderStatus.AWAITING_SHIPMENT);
    }

    private void transitionToAwaitingPickup(Order order){
        System.out.println("Preparing pickup workflow");
        order.setStatus(OrderStatus.AWAITING_PICKUP);
    }

    private void transationToComplete(Order order){
        System.out.println("Preparing complete workflow");
        order.setStatus(OrderStatus.COMPLETED);
    }

}
