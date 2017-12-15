package academy.elqoo.cleancode.names.shouldrevealintent;


import java.util.List;

public class ABoard {

    public static void viSmartCopy(List<A> a1, List<A> a2){
        for (A sourceA : a1) {
	  for (A destinationA : a2) {
	      destinationA.clone(sourceA);
	  }
        }
    }


}
