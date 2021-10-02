package CreditCard;

public class CardException extends RuntimeException {
    public CardException () {

    }
    public CardException(String message){
            super(message);
    }
}
