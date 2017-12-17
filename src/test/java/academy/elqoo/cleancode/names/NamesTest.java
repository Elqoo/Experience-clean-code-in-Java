package academy.elqoo.cleancode.names;

import academy.elqoo.cleancode.names.domain.Piece;
import academy.elqoo.cleancode.names.domain.Knight;
import academy.elqoo.cleancode.names.shouldrevealintent.Ship;
import academy.elqoo.cleancode.names.shouldrevealintent.ShipStatus;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class NamesTest {

    @Test
    public void shouldRevealIntent() {
        Ship host = Ship.createWithHealthAndPower(10, 20);
        Ship enemy = Ship.createWithHealthAndPower(10, 10);
        host.fireOn(enemy);
        assertThat(enemy.getStatus(), equalTo(ShipStatus.ALIVE));
    }

    @Test
    public void shouldDropExcessBaggage(){
        Customer data = new Customer();
    }

    @Test
    public void shouldNotContainMisInformation(){
        List<Integer> numbers = new ArrayList<>();
    }

    @Test
    public void shouldBePrenouncable(){
        Rabbit rabbit = new Rabbit();
        SecureNetworkConnection connection = new SecureNetworkConnection();
    }

    @Test
    public void shouldBeSearchable(){
        int[] a = {1,2,3};
        assertEquals(2, Average.calculateAverage(a));
    }

    @Test
    public void avoidMeaningless(){
        int number = 1;
        // Renamed IBookInterface to Book
    }

    @Test
    public void shouldUseChessDomainName(){
        Piece piece = new Knight();
    }

    @Test
    public void shouldAvoidNoiseWords(){
        List<Integer> primes = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
    }

}
