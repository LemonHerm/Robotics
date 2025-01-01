import java.util.*;

public class Main {
    public static void main(String[] args) {
    
        int[] arr = {2, 4, 5, 6, 7, 7};
    
        int[][] arr2 = { {1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
        int ReturnVal = PracticeProblems.fab(377);

        if (ReturnVal == 0) {
            System.out.println("This number is not in the fibonacci sequence");
        } else {
            System.out.println(ReturnVal);
        }


        System.out.println(PracticeProblems.count0ccurances(arr, 7));
        
        System.out.println(Arrays.toString(PracticeProblems.reverseArray(arr)));
        
        System.out.println(PracticeProblems.sumGrid(arr2));

        
    }
}