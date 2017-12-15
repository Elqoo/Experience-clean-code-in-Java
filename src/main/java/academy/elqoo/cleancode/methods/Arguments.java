package academy.elqoo.cleancode.methods;

public class Arguments {

    public static int calculate(int startingNumber, int number, boolean add){
        if(add){
            return startingNumber + number;
        }else{
            return startingNumber - number;
        }
    }

}
