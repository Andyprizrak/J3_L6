package ru.geekbrains.home_j3_lesson6;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class HT2Test {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {true, new int[]{2,1,4,4,1,1}},
                {true, new int[]{4,4,4,4,4}},
                {true, new int[]{1,1}},
                {false,new int[]{0,0,3}},
                {true, new int[]{1,1,4,4,4,4,1,1}},
        });
    }
    private HomeTask2 t;
    private boolean a;
    private int[] b;
    public HT2Test(boolean a, int[] b) {
        this.a = a;
        this.b = b;
    }
    @Before
    public void init() {
        t = new HomeTask2();
    }
    @Test
    public void testTask2() {
        Assert.assertEquals(a, t.doTask2(b));
    }
}


