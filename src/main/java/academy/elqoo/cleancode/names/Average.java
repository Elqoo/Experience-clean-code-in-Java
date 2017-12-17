package academy.elqoo.cleancode.names;

public class Average {

    public static int calculateAverage(int[] i){
        int j = 0;
        for (int i1 : i) {
	  j += i1;
        }
        return j/i.length;
    }

}
