package activitytwo;

import java.util.Scanner;

public class ActivityTwo {
    
    public static void main(String[] args) {
        
    Scanner scn = new Scanner(System.in);
    
        int stacksize;
        int select;
        boolean condition = false;
        
        System.out.println("Select size of Stack: ");               
        stacksize = scn.nextInt();
        
        ActivityTwoClassFive stack = new ActivityTwoClassFive(stacksize);
        System.out.println("The size of your Stack is: " + stacksize);
        
        while (!condition) {
    
            System.out.println("What Option Would You Like To Do?");
            System.out.println("1. Push Elements From The Stack");
            System.out.println("2. Pop Elements From The Stack");
            System.out.println("3. Peek The Top Element");
            System.out.println("4. Peek The Bottom Element");
            System.out.println("5. Input Loop Stack Element");
            System.out.println("6. Count All The Displayed Elements");
            System.out.println("7. Remove Duplicate Elements In The Stack");
            System.out.println("8. Add More Stack To Another Stack");
            System.out.println("9. Peek The Other Element");
            System.out.println("Input: ");
            select = scn.nextInt();
            
            switch (select) {
                case 1: 
                    System.out.println("Input Number");
                    int push = scn.nextInt();
                    stack.push(push);
                    break;
                case 2:
                    System.out.println("Popped Element: " + stack.pop());
                    break;
                case 3:
                    System.out.println("Top Element: " + stack.peek());
                    break;
                case 4:
                    System.out.println("Bottom Element: " + stack.bottom());
                    break;
                case 5:
                    stack.loop();
                    break;
                case 6:
                    stack.count();
                    break;
                case 7:
                    stack.remove();
                    break;
                case 8:
                    stack.add();
                    break;
                case 9:
                    stack.newloop();
                    break;
                default:
                    System.out.println("Incorrect");
                    condition = false;
                    break;
            }
        }
    }
}

