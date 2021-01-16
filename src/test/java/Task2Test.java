import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

public class Task2Test {

    private int[] arr;
    private boolean result;
    Task2 task2;

    @Before

    public void init(){
        task2 = new Task2();

    }

    public Task2Test(int[] arr, boolean result) {
        this.arr = arr;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]>data(){
        return Arrays.asList(new Object[][]{
                {new int []{1, 1, 1, 4, 4, 1, 4, 4}, true},
                {new int []{1, 1, 1, 1, 1, 1}, false},
                {new int []{4, 4, 4, 4}, false},
                {new int []{1, 4, 4, 1, 1, 4, 3}, false},
        });
    }

    @Test
    public void testTask2(){
        Assert.assertEquals(result, task2.task2(arr));
    }
}
