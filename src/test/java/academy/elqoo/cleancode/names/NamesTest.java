package academy.elqoo.cleancode.names;

import academy.elqoo.cleancode.names.shouldrevealintent.A;
import academy.elqoo.cleancode.names.shouldrevealintent.ABoard;
import academy.elqoo.cleancode.names.shouldrevealintent.StatusInfo;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.hamcrest.CoreMatchers.equalTo;
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
    public void shouldNotContainMisinformation(){
        List<Integer> intMap = new ArrayList<>();
    }

    @Test
    public void shouldBePrenouncable(){
        Wabbit wabbit = new Wabbit();
        SSLConnection connection = new SSLConnection();
    }

}
