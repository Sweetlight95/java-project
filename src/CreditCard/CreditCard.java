package CreditCard;

public class CreditCard {
    private long cardNumber;

    public void collectNumber(long cardNumber) {
        validateCardLength(cardNumber);
//        isValid(cardNumber);
        this.cardNumber = cardNumber;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    private void validateCardLength(long number) {
        String cardLength = String.format("%d", number);
        if (cardLength.length() < 16 || cardLength.length() > 16) throw new CardException("Invalid card number");
    }

    public void evenCardLength() {
    }

    public void oddCardLength() {

    }

//    private boolean isValid(long result) {
//        if(cardNumber / result )
//            return true;
//        else:
//        return false;
//    }
//}
}