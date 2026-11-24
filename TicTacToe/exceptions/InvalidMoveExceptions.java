package exceptions;

public class InvalidMoveExceptions extends RuntimeException{
    public InvalidMoveExceptions(String message){
        super(message);
    }
}