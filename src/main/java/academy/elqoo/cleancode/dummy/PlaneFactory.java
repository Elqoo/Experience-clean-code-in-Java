package academy.elqoo.cleancode.dummy;

public class PlaneFactory {

    public static Plane withIdAndName(String id, String name){
        Plane plane = new Plane();
        plane.setId(id);
        plane.setName(name);
        return plane;
    }

}
