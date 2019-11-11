import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ArrayMethodsMassTest {

    @Parameterized.Parameters

    public static Collection<int[][]> data() {
        return Arrays.asList(new int[][][]{
                {{4,2,4,2,2,2,2},{2,2,2,2}},
                {{1,2,3,4,5,6},{4,5,6,7}},
                {{1,2,3,4,5,6},{5,6}},
                {{1,2,3},{1,2,3}},
                {{1,2,3,4,5,6},{5,7}}
        });
    }
    private int[] a, b;

    public ArrayMethodsMassTest(int[] a, int[] b){
        this.a = a;
        this.b = b;
    }

    private ArrayMethods am;

    @Before
    public void init(){
        am = new ArrayMethods();
    }

    @Test
    public void cutAfter4Test1(){
        System.out.println(Arrays.toString(b) + " : " + Arrays.toString(am.cutAfter4(a)));
        Assert.assertArrayEquals(b , am.cutAfter4(a));
    }

}
