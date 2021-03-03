import org.junit.Test;
import static org.junit.Assert.*;

public class TestArrayNum {
    @Test
    public void testArrayNum(){
        int [] input = {1,2,4,3,5};
        int targetNum = 6;
        int[] output = {0,4};
        assertTrue(ArrayNum.searchNum(input, targetNum)[0]==(output[0]));
        assertTrue(ArrayNum.searchNum(input, targetNum)[1]==(output[1]));

        int [] input2 = {1,-2,-4,-3,5};
        int targetNum2 = -6;
        int[] output2 = {1,2};
        assertTrue(ArrayNum.searchNum(input2, targetNum2)[0]==(output2[0]));
        assertTrue(ArrayNum.searchNum(input2, targetNum2)[1]==(output2[1]));
    }
}
