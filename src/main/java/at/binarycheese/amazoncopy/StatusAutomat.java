package at.binarycheese.amazoncopy;

import at.binarycheese.amazoncopy.exceptions.StatusException;

/**
 * Created by Joyce on 13.06.2014.
 */
public class StatusAutomat {
    private Status status;

    public Status getStatus() {
        return status;
    }

    public StatusAutomat(){
        this.status = Status.UNIDENTIFIED;
    }

    public void identify(){
        if(status != Status.UNIDENTIFIED){
            throw new StatusException("You are already identified");
        }
        status = Status.IDENTIFIED;
    }
}
