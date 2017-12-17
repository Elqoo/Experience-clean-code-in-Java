package academy.elqoo.cleancode.names.shouldrevealintent;


import java.util.List;

public class GameBoard {

    public static void copy(List<Ship> source, List<Ship> destination){
        for (Ship sourceShip : source) {
	  for (Ship destinationShip : destination) {
	      destinationShip.clone(sourceShip);
	  }
        }
    }


}
