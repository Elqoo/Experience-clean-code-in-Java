package academy.elqoo.cleancode.methods;


import academy.elqoo.cleancode.methods.error.ReadTimeoutException;

public class Errors {

    public void doSomething(){
        throw new ReadTimeoutException();
    }

}
