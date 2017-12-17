package academy.elqoo.cleancode.names;

public class Average {

    public static int calculateAverage(int[] numbers){
        int sum = 0;
        for (int currentNumber : numbers) {
	  sum += currentNumber;
        }
        return sum/numbers.length;
    }

}
