import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)


public class Task1Test {



    private int[] arrIn;
    private int[] arrOut;
    private int[] arrayWithout4;
    Task1 arr1;
    Task1 arr2;

    @Before

    public void init(){
        arr1 = new Task1();
        arr2 = new Task1();
        arrayWithout4 = new int[]{1,2,3};


    }

    public Task1Test(int[] arrIn, int[] arrOut) {
            this.arrIn = arrIn;
            this.arrOut = arrOut;
    }


    @Test (expected = RuntimeException.class)
    public void testArrException(){
        arr1.task1(arrayWithout4);
    }

   @Parameterized.Parameters
    public static Collection<Object[]> data() {
        System.out.println("Parametrized test");
        return Arrays.asList(new Object[][]{
                {new int []{1, 1, 4}, new int []{}},
                {new int []{1, 1, 4, 4, 1},new int []{1}},
                {new int []{1, 4, 3, 4, 5}, new int []{5}},
                {new int []{1, 2, 3, 4, 5, 6, 7}, new int []{5, 6, 7}},
        });
    }


    @Test
    public void task1Test() {
        Assert.assertArrayEquals(arrOut, arr2.task1(arrIn));

    }

}




