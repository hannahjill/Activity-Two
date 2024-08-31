package activitytwo;

public class ActivityTwoClassFour extends ActivityTwoClassThree {
    
    public ActivityTwoClassFour(int Size) {
        super(Size);
    }
    
    public double peek() {
        if (!isEmpty()) {
            return stack[top];
        }
        else {
            System.out.println("Top Element Is Empty");
            return -1;
        }
    }
    public double bottom() {
        if (!isEmpty()) {
            return stack[0];
        }
        else {
            System.out.println("Bottom Element Is Empty");
            return -1;
        }
    }
    
}
