package academy.elqoo.cleancode.methods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

public class Prime {

    public static int[] generatePrimeNumbersUntil(int limit){
        if(limit <1){
            return new int[0];
        }
        int number = 2;
        List<Integer> primes = new ArrayList<>();
        while(number<limit){
            boolean isPrime = isPrime(number);
            if(isPrime){
                primes.add(number);
            }
            number++;
        }
        int[] ret = new int[primes.size()];
        Iterator<Integer> iterator = primes.iterator();
        for (int i = 0; i < ret.length; i++)
        {
            ret[i] = iterator.next();
        }
        return ret;
    }


    private static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }

}
