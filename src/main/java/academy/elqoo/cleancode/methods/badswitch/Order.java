package academy.elqoo.cleancode.methods.badswitch;

public class Order {

    private OrderStatus status;

    public Order(OrderStatus status) {
        this.status = status;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
