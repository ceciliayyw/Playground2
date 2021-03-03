import java.util.*;
public class ArrayNum {

    public static int[] searchNum(int[] arr, int targetNum) {
        int[] result = new int[2];
        // loop for the first ptr (big loop)
        for (int firstPt = 0; firstPt < arr.length; firstPt++) {
            int curNum = arr[firstPt];
            // loop for the second ptr(sub loop)
            for (int secondPt = 1; secondPt < arr.length; secondPt++) {
                int secondNum = arr[secondPt];
                if (curNum + secondNum == targetNum) {
                    result[0] = secondPt;
                }
            }
            result[1] = firstPt;
        }
        System.out.println(Arrays.toString(result));
        return result;
    }



    public static void main(String arg[]) {
        int A[] = { 0,-2,3,-4,8,6,7 };
        searchNum(A,-6);


    }
}
