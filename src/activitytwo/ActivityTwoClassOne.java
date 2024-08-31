package activitytwo;

import java.util.Stack;

public class ActivityTwoClassOne {

    private int maxSize;
    double[] stack;
    int top;
    
    Stack <Double> newstack = new Stack<>();
    
    public ActivityTwoClassOne(int size) {
        maxSize = size;
        stack = new double[maxSize];
        top = -1;
    }
    public void push(double numberValue) {
        if (!isFull()) {
            stack[++top] = numberValue;
        }
        else {
            System.out.println("Your Stack Is Full!!");
        }
    }
    public double pop() {
        if (!isEmpty()) {
            return stack [top--];
        }
        else {
            System.out.println("Your Stack Is Empty!!");
            return -1;
        }
    }
    public void loop() {
        if (isEmpty()) {
            System.out.println("Your Stack Is Empty!!");
        }
        else {
            System.out.println("Stack: ");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
    
    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (top == maxSize - 1);
    }
    
}
    

