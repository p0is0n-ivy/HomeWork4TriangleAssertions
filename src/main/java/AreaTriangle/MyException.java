package AreaTriangle;

public class MyException extends Exception {
    String message;
    MyException(String s)
    {
        message = s;
    }
    public String toString() {

        return message;
    }

}