import java.util.*;
public class ArrayNum {

    public static int[] searchNum(int[] arr,  int targetNum) {
        //declare a new int[] and store ans in it
        int[] result = new int[2];

        // loop for the first ptr (big loop)
        for (int firstPt = 0; firstPt < arr.length ; firstPt++) {
            int curNum = arr[firstPt];
            // loop for the second ptr(sub loop)
            for (int secondPt = firstPt+1; secondPt<arr.length; secondPt++) {
                int secondNum = arr[secondPt];
                if (curNum + secondNum == targetNum) {
                    result[0] = firstPt;
                    result[1] = secondPt;
                    System.out.println(Arrays.toString(result));
                    return result;
                }
            }
        }
        return result;
    }



    public static void main(String arg[]) {
        int a[] = { 1,2,4,3 };
        //
        searchNum(a,6);


    }
}
