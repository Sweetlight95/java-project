package chapter17;

import java.util.stream.IntStream;

public class StreamMapReduce {
    public static void main(String[] args) {
        System.out.printf("Sum if the even ints from 2 through 20 is: %d%n",
                IntStream.rangeClosed(1, 10).map((int x) -> {return x * 2;}).sum());

        int total = 0;
        for (int i =1; i <= 10; i= i * 2) {
            total+=i;
        }
        System.out.println(total);
    }

}
