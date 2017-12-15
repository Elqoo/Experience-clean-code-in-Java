package academy.elqoo.cleancode.methods;

import academy.elqoo.cleancode.methods.badswitch.Order;
import academy.elqoo.cleancode.methods.badswitch.OrderService;
import academy.elqoo.cleancode.methods.badswitch.OrderStatus;
import academy.elqoo.cleancode.methods.error.ReadTimeoutException;
import org.junit.Test;

import static academy.elqoo.cleancode.methods.badswitch.OrderStatus.PENDING;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class MethodsTest {

    @Test
    public void shouldHaveOneAbstractionLevel(){
        // optimize the prime class so it follows the abstraction level rule
        int[] primes = {2, 3, 5, 7, 11};
        assertThat(primes, equalTo(Prime.generatePrimeNumbersUntil(12)));
    }

    @Test
    public void shouldUseMaxLevelThreeIdentation(){
        // the Identation class should be refactored to limit the number of identations
        assertTrue(Identation.isABigYellowBanana("banana",true,"yellow"));
    }

    @Test
    public void shouldNotHaveSwitchStatement(){
        // remove the switch in transition order
        OrderService orderService = new OrderService();

        Order order = new Order(PENDING);

        // TRANSITION to awaiting payment
        orderService.transitionOrder(order);
        assertEquals(OrderStatus.AWAITING_PAYMENT, order.getStatus());
        orderService.transitionOrder(order);
        assertEquals(OrderStatus.AWAITING_SHIPMENT, order.getStatus());
        orderService.transitionOrder(order);
        assertEquals(OrderStatus.AWAITING_PICKUP, order.getStatus());
        orderService.transitionOrder(order);
        assertEquals(OrderStatus.COMPLETED, order.getStatus());
    }

    @Test
    public void removeFlagArgumentAndReduceArguments(){
        // first is an addition
        int result = Arguments.addNumberTo(1, 0);
        assertEquals(1, result);

        // substraction
        result = Arguments.substractNumberFrom(1, 0);
        assertEquals(-1, result);
    }

    @Test
    public void shouldNotUseTheErrorsObject(){
        try {
            new Errors().doSomething();
        } catch (ReadTimeoutException e) {
            assertTrue(e!=null);
        }
    }

}
