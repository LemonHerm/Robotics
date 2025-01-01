public class PracticeProblems {
    static int count0ccurances(int[] arr, int n) {
        int occurances = 0;
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] == n) {
                occurances += 1;
            }
        }
        return occurances;
    }
    
    static int[] reverseArray(int[] testarr) {
        int[] newArray = new int[testarr.length];
        int counter = testarr.length - 1;
        int counter_up = 0;
        for (int number : testarr) {
            newArray[counter_up] = testarr[counter];
            counter --;
            counter_up ++;
        }
    return newArray;
    }

    static int sumGrid(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i ++) {
            for (int i_2 = 0; i_2 < grid[i].length; i_2 ++)
                sum += grid[i][i_2];
        }
        return sum;
    }   
    static int fab(int num) {
        int Counter = 3;
        boolean NumberMet = false;
        int SecPrev = 0;
        int Prev = 1;
        while (NumberMet == false) {
            int CurrentNum = SecPrev + Prev;
            if (CurrentNum != num) {
                if (CurrentNum < num) {
                    SecPrev = Prev;
                    Prev = CurrentNum;
                    Counter ++;
                } else {
                    NumberMet = true;
                }
            } else {
                NumberMet = true;
                return Counter;
            }
        }
    return 0;
    }
}
