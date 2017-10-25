package academy.elqoo.cleancode.names;


import java.util.List;

public class GameBoard {

    public static void clone(List<A> a1, List<A> a2){ // clones the data from one list of ships to another
        for (A sourceA : a1) {
	  for (A destinationA : a2) {
	      destinationA.clone(sourceA);
	  }
        }
    }


}
