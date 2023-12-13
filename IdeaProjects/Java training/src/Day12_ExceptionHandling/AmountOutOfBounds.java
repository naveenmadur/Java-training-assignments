package Day12_ExceptionHandling;

class AmountOutOfBounds extends Exception{
    public AmountOutOfBounds() { }

    public AmountOutOfBounds(String message){
        super(message);
    }

    public AmountOutOfBounds(Throwable cause){
        super(cause);
    }

    public AmountOutOfBounds(String message, Throwable cause){
        super(message,cause);
    }
}

