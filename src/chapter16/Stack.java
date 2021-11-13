package chapter16;

import java.io.ObjectStreamException;

public class Stack {
    private  int numberOfElement;
    private int[] elements;

    public Stack(int capacity){
        elements = new int[capacity];
    }
    public void push(int element) {
        if(isFull()) throw new UnderFlowException("Is full");
            elements[numberOfElement++] = element;
////        numberOfElement++;}
//            catch(ArrayIndexOutOfBoundsException ex){
//                throw new ObjectStreamException("stack is full");
//            }
        }

    private boolean isFull() {
        return size() == elements.length;
    }

    public int size() {
        return numberOfElement;
    }

    public int pop() {
        if (isEmpty()) throw new UnderFlowException("Stack is empty");
//        numberOfElement--;
        return --numberOfElement;
    }

    public boolean isEmpty() {
        return numberOfElement == 0;
    }

    public int peek() {
        if(isEmpty()) throw new UnderFlowException ("is empty");
        return elements[numberOfElement - 1];
    }

    public static class UnderFlowException extends RuntimeException {
        public UnderFlowException(String message) {
            super(message);
        }
    }
    public static class OverflowException extends RuntimeException {

    }
}
