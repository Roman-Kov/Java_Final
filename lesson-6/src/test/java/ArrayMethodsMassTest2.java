import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ArrayMethodsMassTest2 {

    @Parameterized.Parameters

    public static Collection<int[]> data() {
        return Arrays.asList(new int[][]{
                {1,1,1,1,1,1},
                {4,4,4,4,4,4},
                {1,1,4,1,1,4},
                {4,1,4,1,4,1},
                {1,2,4,1,4,1},
        });
    }
    private int[] a;

    public ArrayMethodsMassTest2(int[] a){
        this.a = a;
    }

    private ArrayMethods am;

    @Before
    public void init(){
        am = new ArrayMethods();
    }

    @Test
    public void have1o4Test(){
        System.out.println(am.have1o4(a));
        Assert.assertTrue(am.have1o4(a));
    }

}
