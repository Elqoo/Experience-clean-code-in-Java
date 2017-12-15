package academy.elqoo.cleancode.methods;

import academy.elqoo.cleancode.methods.error.Error;

public class Errors {

    public Error doSomething(){
        return Error.READ_TIMEOUT;
    }

}
