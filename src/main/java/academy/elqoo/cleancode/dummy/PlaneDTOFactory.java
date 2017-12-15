package academy.elqoo.cleancode.dummy;

public class PlaneDTOFactory {

    public static PlaneDTO from(Plane plane){
        PlaneDTO planeDTO = new PlaneDTO();
        planeDTO.setName(plane.getName());
        planeDTO.setId(plane.getId());
        return planeDTO;
    }

}
