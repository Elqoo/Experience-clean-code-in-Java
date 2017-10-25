package academy.elqoo.cleancode.names;

import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class CleanNamesTest {

    @Test
    public void shouldAttackEnemy() {
        Ship host = Ship.createWithHealthAndPower(10, 20);
        Ship enemy = Ship.createWithHealthAndPower(10, 10);
        host.attack(enemy);
        assertThat(enemy.getStatus(), equalTo(ShipStatus.DEAD));
    }

    @Test
    public void shouldCloneGameObjects() {
        List<Ship> source = randomCreateShips(5);
        List<Ship> target = randomCreateShips(5);
        GameBoard.clone(source, target);
        assertThat(source.get(3).getHealth(), equalTo(target.get(3).getHealth()));
    }

    private List<Ship> randomCreateShips(int amount){
        return Stream.iterate(Ship.createWithRandomHealthAndPower(), ship -> Ship.createWithRandomHealthAndPower())
	      .limit(amount)
	      .collect(toList());
    }

}
