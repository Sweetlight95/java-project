package chapter7.se;

import java.util.Scanner;

public class NumberPrintMain {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            NumberPrinting segment = new NumberPrinting();
            System.out.println("Enter 8 digit base two numbers 0's and 1's: ");
            int userInput = scanner.nextInt();
            segment.setUpShapes(String.valueOf(userInput));


            NumberPrinting.displayShape();
          //  SevenSegment.clearShape();

        }
    }

