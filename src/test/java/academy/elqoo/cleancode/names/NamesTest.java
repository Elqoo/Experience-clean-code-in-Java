package academy.elqoo.cleancode.names;

import academy.elqoo.cleancode.names.domain.ChessThing;
import academy.elqoo.cleancode.names.domain.Horse;
import academy.elqoo.cleancode.names.shouldrevealintent.A;
import academy.elqoo.cleancode.names.shouldrevealintent.ABoard;
import academy.elqoo.cleancode.names.shouldrevealintent.StatusInfo;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class NamesTest {

    @Test
    public void shouldRevealIntent() {
        A host = A.woThisIsACoolCreateMethod(10, 20);
        A enemy = A.woThisIsACoolCreateMethod(10, 10);
        host.c(enemy);
        assertThat(enemy.getStatusInfo(), equalTo(StatusInfo.ALIVE));
    }

    @Test
    public void shouldDropExcessBaggage(){
        CustomerData data = new CustomerData();
    }

    @Test
    public void shouldBeNameYouCanSay(){
        SSLConnection connection = new SSLConnection();
        Wabbit whereIsTheWabbit = new Wabbit();
    }

    @Test
    public void shouldNotContainMisInformation(){
        List<Integer> intMap = new ArrayList<>();
    }

    @Test
    public void shouldBePrenouncable(){
        Wabbit wabbit = new Wabbit();
        SSLConnection connection = new SSLConnection();
    }

    @Test
    public void shouldBeSearchable(){
        int[] a = {1,2,3};
        assertEquals(2, Average.calculateAverage(a));
    }

    @Test
    public void avoidMeaningless(){
        int m_a = 1;
        // fix IBookInterface
    }

    @Test
    public void shouldUseChessDomainName(){
        ChessThing thing = new Horse();
    }

    @Test
    public void shouldAvoidNoiseWords(){
        List<Integer> listOfPrimes = new ArrayList<>();
        List<Integer> evenNumbersList = new ArrayList<>();
    }

}
