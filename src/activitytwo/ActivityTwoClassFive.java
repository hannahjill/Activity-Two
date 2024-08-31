
package activitytwo;

public class ActivityTwoClassFive extends ActivityTwoClassFour {
    
    public ActivityTwoClassFive(int Size) {
        super(Size);
    }
    
    public void add() {
        for (int i = 0; i <= top; i++) {
            if (!isFull()) {
                System.out.println("More Stack Element Added To Another Stack: " + stack[i]);
                newstack.push(stack[i]);
            }
            else {
                System.out.println("Your Stack Is Full!!");
            }
        }
    }
    
    public void newloop() {
        if (isEmpty()) {
            System.out.println("Your Stack Is Empty!!");
        }
        else {
            System.out.println("New Stack Added: ");
            int loopLimit = Math.min(top,newstack.size() - 1);
            for (int i = 0; i <= loopLimit; i++) {
                System.out.println(newstack.get(i));
            }
        }
    }
    
}
