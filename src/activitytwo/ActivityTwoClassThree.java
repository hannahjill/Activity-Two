package activitytwo;

import java.util.HashSet;
import java.util.Set;

public class ActivityTwoClassThree extends ActivityTwoClassTwo {
    
    public ActivityTwoClassThree(int Size) {
        super(Size);
    }
    public void remove() {
        Set <Double> delete = new HashSet<>();
        
        int newtop = -1;
        boolean duplicate = false;
        for (int i = 0; i <= top; i++) {
            if (!delete.contains(stack[i])) {
                delete.add(stack[i]);
                stack[++newtop] = stack[i];
                System.out.println("Stack Duplicate Recognized: " + stack[i]);
                duplicate = true;
            }
        }
        top = newtop;
        if (duplicate == false) {
            System.out.println("No Duplicate Recognized");
        }
    }
    
}
