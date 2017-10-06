package com.oshcherbak;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by oshcherbak on 10/6/17.
 */
public class Task02Test {
    private static Object[] generateArray(){
        return new Integer[]{3,4,5};
    }

    private static Collection generateCollection(){
        Collection col = new ArrayList();
        col.add(0);
        col.add(1);
        col.add(2);
        return col;
    }

    private final Collection expectedCollection = generateExpectedCollection();
    private Collection generateExpectedCollection(){
        Collection col = new ArrayList();
        col.add(0);
        col.add(1);
        col.add(2);
        col.add(3);
        col.add(4);
        col.add(5);
        return col;
    }

    @Test
    public void includeVar1Test(){
        Collection resultCollection = Task02.includeVar1(generateCollection(), generateArray());
        Assert.assertEquals(expectedCollection, resultCollection);
    }

    @Test
    public void includeVar2Test(){
        Collection resultCollection = Task02.includeVar2(generateCollection(), generateArray());
        Assert.assertEquals(expectedCollection, resultCollection);
    }

    @Test
    public void includeVar3Test(){
        Collection resultCollection = Task02.includeVar3(generateCollection(), generateArray());
        Assert.assertEquals(expectedCollection, resultCollection);
    }

    @Test
    public void includeVar4Test(){
        Collection resultCollection = Task02.includeVar4(generateCollection(), generateArray());
        Assert.assertEquals(expectedCollection, resultCollection);
    }

    @Test
    public void includeVar5Test(){
        Collection resultCollection = Task02.includeVar5(generateCollection(), generateArray());
        Assert.assertEquals(expectedCollection, resultCollection);
    }
}
