package academy.elqoo.cleancode.dummy;

public class Test {


    public PlaneDTO create(){
        Plane plane = PlaneFactory.withIdAndName("1234", "MyPlane");
        return PlaneDTOFactory.from(plane);
    }



}
