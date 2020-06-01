package ru.geekbrains.home_j3_lesson6;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class HT1Test {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {new int[]{1,7}, new int[]{1,2,4,4,2,3,4,1,7}},
                {new int[]{1,2}, new int[]{1,2,0,0,2,3,0,1,7}},
                {new int[]{2,3,0,1,7}, new int[]{1,2,4,4,2,3,0,1,7}},
                {new int[]{0,2,3,0,1,7}, new int[]{1,2,4,0,2,3,0,1,7}},
        });
    }
    private HomeTask1 t;
    private int[] a;
    private int[] b;
    public HT1Test(int[] a, int[] b) {
        this.a = a;
        this.b = b;
    }
    @Before
    public void init() {
        t = new HomeTask1();
    }

    @Test
    public void testTask1() {
        Assert.assertTrue("Arrays not equals", Arrays.equals(a, t.doTask1(b)));
    }
}

