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

    public void selectProduct(){
        if(status != Status.IDENTIFIED && status != Status.PAYMENT && status != Status.PRODUCT_SELECTED){
            throw new StatusException("You need to be identified");
        }
        status = Status.PRODUCT_SELECTED;
    }

    public void checkOut(){
        if(status != Status.PRODUCT_SELECTED && status != Status.PAY_ERROR){
            throw new StatusException("You have no products selected!");
        }
        status = Status.PAYMENT;
    }

    public void buyFails(){
        if(status != Status.PAYMENT){
            throw new StatusException("No payment currently running");
        }
        status = Status.PAY_ERROR;
    }

    public void pay(){
        if(status!=Status.PAYMENT){
            throw new StatusException("No payment currently running");
        }
        status = Status.PAID;
    }

    public void abort(){
        status = Status.ABORT;
    }
}
