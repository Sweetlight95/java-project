package chapter7;

import java.util.Scanner;

public class Graders {
    public static void main(String[] args) {
        int[][] score;
        Scanner input = new Scanner(System.in);
        System.out.println("How many student? ");
        int student = input.nextInt();
        System.out.println("How many subject? ");
        int subject = input.nextInt();
        score = new int[student][subject];
        int total = 0;
        int highestScore;
        int lowestScore;
        double average;
        for (int row = 0; row < student; row++) {
            for (int column = 0; column < subject; column++) {
                System.out.println("Student " + (row + 1) + " Subject " + (column + 1) + ":");
                score[row][column] = input.nextInt();
            }
        }
        System.out.print("          ");
        for (int column = 0; column < subject; column++)
            System.out.print(" Subj" + (column + 1) + "    ");
        System.out.print("Total");
        System.out.print("  Average");
        System.out.println();

        for (int row = 0; row < student; row++) {
            total = 0;
            average = 0.0;
            System.out.print("Student " + (row + 1) + ": ");
            for (int column = 0; column < subject; column++) {
                System.out.printf("%6d", score[row][column]);
                total += score[row][column];
                average = total / subject;
            }
            System.out.printf("%7s", total);
            System.out.printf("%7s", average);
            System.out.println();
        }
        highestScore = Integer.MIN_VALUE;
        lowestScore = Integer.MAX_VALUE;
        for (int row = 0; row < student; row++) {
            total = 0;
            for (int column = 0; column < subject; column++) {
                total += score[row][column];
            }
                if (total > highestScore) {
                    highestScore = total;
                }
                if (total < lowestScore) {
                    lowestScore = total;
                }
            }
        System.out.println("The lowest score: " + lowestScore);
        System.out.println("The highest score: " + highestScore);
    }

    }

