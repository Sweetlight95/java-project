package CreditCard;

import java.util.Scanner;

public class CreditCardMain {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a credit card number: ");
//        long cardNumber = input.nextLong();
        CreditCard card = new CreditCard();
        card.collectNumber(4578293536464633L);
    }

}