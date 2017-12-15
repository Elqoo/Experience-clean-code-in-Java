package academy.elqoo.cleancode.methods.badswitch;

public class Order {

    private OrderState state;

    public Order(OrderStatus status) {
        this.state = OrderStateFactory.create(status);
    }

    public OrderStatus getStatus() {
        return state.getStatus();
    }

    public void nextState(){
        this.state  = state.next();
    }

}
