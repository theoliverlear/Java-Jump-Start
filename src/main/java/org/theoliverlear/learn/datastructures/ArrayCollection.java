package org.theoliverlear.learn.datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayCollection {
    //===============================-Main-===================================
    public static void main(String[] args) {
        //----------------------Fixed-Size-Array------------------------------
        int[] fixedArray = new int[5];
        fixedArray[0] = 1;
        fixedArray[1] = 2;
        fixedArray[2] = 3;
        fixedArray[3] = 4;
        fixedArray[4] = 5;
        //----------------Fixed-Size-Array-Alternative------------------------
        int[] altFixedArray = {1, 2, 3, 4, 5};
        //-------------------Multidimensional-Array---------------------------
        int[][] multiDimensionalArray = new int[3][3];
        multiDimensionalArray[0][0] = 1;
        multiDimensionalArray[0][1] = 2;
        multiDimensionalArray[0][2] = 3;
        multiDimensionalArray[1][0] = 4;
        multiDimensionalArray[1][1] = 5;
        multiDimensionalArray[1][2] = 6;
        multiDimensionalArray[2][0] = 7;
        multiDimensionalArray[2][1] = 8;
        multiDimensionalArray[2][2] = 9;
        //-------------Multidimensional-Array-Alternative---------------------
        int[][] altMultiDimensionalArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        //---------------------Dynamic-Size-Array-----------------------------
        List<Integer> dynamicArray = new ArrayList<>();
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.add(5);
        //---------------Dynamic-Size-Array-Alternative-----------------------
        List<Integer> altDynamicArray = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> anotherAltDynamicArray = Arrays.stream(altFixedArray).boxed().toList();
        anotherAltDynamicArray.forEach(System.out::println);
        //------------Multidimensional-Dynamic-Size-Array---------------------
        List<List<Integer>> multiDimensionalDynamicArray = new ArrayList<>();
        multiDimensionalDynamicArray.get(0).add(1);
        multiDimensionalDynamicArray.get(0).add(2);
        multiDimensionalDynamicArray.get(0).add(3);
        multiDimensionalDynamicArray.get(1).add(4);
        multiDimensionalDynamicArray.get(1).add(5);
        multiDimensionalDynamicArray.get(1).add(6);
        multiDimensionalDynamicArray.get(2).add(7);
        multiDimensionalDynamicArray.get(2).add(8);
        multiDimensionalDynamicArray.get(2).add(9);
        //-------Multidimensional-Dynamic-Size-Array-Alternative--------------
        List<List<Integer>> altMultiDimensionalDynamicArray = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
    }
}
