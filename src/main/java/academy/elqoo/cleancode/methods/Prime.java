package academy.elqoo.cleancode.methods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

public class Prime {

    public static int[] generatePrimeNumbersUntil(int limit) {
        int[] primeNumbers = new int[0];
        if (isValidGeneratePrimeNumberLimit(limit)) {
	  primeNumbers = convertToPrimitiveArray(listPrimeNumbersUntil(limit));
        }
        return primeNumbers;
    }

    private static boolean isValidGeneratePrimeNumberLimit(int limit) {
        return limit > 1;
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
	  if (num % i == 0) return false;
        return true;
    }

    private static List<Integer> listPrimeNumbersUntil(int limit) {
        int number = 2;
        List<Integer> primes = new ArrayList<>();
        while (number < limit) {
	  boolean isPrime = isPrime(number);
	  if (isPrime) {
	      primes.add(number);
	  }
	  number++;
        }
        return primes;
    }

    private static int[] convertToPrimitiveArray(List<Integer> ints) {
        int[] result = new int[ints.size()];
        Iterator<Integer> iterator = ints.iterator();
        for (int i = 0; i < result.length; i++) {
	  result[i] = iterator.next();
        }
        return result;
    }

}
