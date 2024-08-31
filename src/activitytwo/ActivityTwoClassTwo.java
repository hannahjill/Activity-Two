package activitytwo;

public class ActivityTwoClassTwo extends ActivityTwoClassOne {
    
     public ActivityTwoClassTwo(int Size) {
        super(Size);
    }
    
    public void count() {
        if (!isEmpty()) {
            int total = top + 1;
            System.out.println("Elements: " + total);
        }
        else {
            System.out.println("Your Stack Is Empty!!");
        }
    }
    
    
    
    
    
}
