package academy.elqoo.cleancode.names;

import academy.elqoo.cleancode.names.shouldrevealintent.A;
import academy.elqoo.cleancode.names.shouldrevealintent.ABoard;
import academy.elqoo.cleancode.names.shouldrevealintent.StatusInfo;
import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class NamesTest {

    @Test
    public void a() {
        A host = A.woThisIsACoolCreateMethod(10, 20);
        A enemy = A.woThisIsACoolCreateMethod(10, 10);
        host.c(enemy);
        assertThat(enemy.getStatusInfo(), equalTo(StatusInfo.ALIVE));
    }

    @Test
    public void b() {
        List<A> a = goPlay(5);
        List<A> a1 = goPlay(5);
        ABoard.viSmartCopy(a, a1);
        assertThat(a.get(3).getHp(), equalTo(a1.get(1).getHp()));
    }

    private List<A> goPlay(int amount){
        return Stream.iterate(A.randomizer(), a -> A.randomizer())
	      .limit(amount)
	      .collect(toList());
    }

}
