package com.oshcherbak;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by oshcherbak on 10/6/17.
 *
 * Task:
 * Write a generic method that takes an array of objects and a collection, and puts all objects in the array into the collection.
 */
public class Task02 {
    public static Collection includeVar1(Collection col, Object[] array){
        for (Object ob : array){
            col.add(ob);
        }
        return col;
    }

    public static Collection includeVar2(Collection col, Object[] array){
        // most correct method
        Collections.addAll(col, array);
        return col;
    }

    public static Collection includeVar3(Collection col, Object[] array){
        col.addAll(Arrays.asList(array));
        return col;
    }

    public static Collection includeVar4(Collection col, Object[] array){
        Arrays.asList(array).forEach(item -> col.add(item));
        return col;
    }

    public static Collection includeVar5(Collection col, Object[] array){
        Arrays.asList(array).forEach(col::add);
        return col;
    }
}
