package academy.elqoo.cleancode.methods.badswitch;

public class OrderService {

    public void transitionOrder(Order order){
        order.nextState();
    }

}
