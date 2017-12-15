package academy.elqoo.cleancode.methods;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

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

}
