package academy.elqoo.cleancode.names;


import java.util.List;

public class GameBoard {

    public static void clone(List<Ship> source, List<Ship> destination){ // clones the data from one list of ships to another
        for (Ship sourceShip : source) {
	  for (Ship destinationShip : destination) {
	      destinationShip.clone(sourceShip);
	  }
        }
    }


}
