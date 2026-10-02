package exceptionhandling;

public class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super(msg);
    }
}
