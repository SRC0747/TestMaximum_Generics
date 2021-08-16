package com.testmaximumgenerics;

public class TestMaximum {
    public static void toPrint(Integer[] inputArray) {
            for (int element : inputArray) {
                System.out.println(element);
            }
            System.out.println();
        }
    public static int compareTo(Integer[] inputArray)
    {
        int max = inputArray[0];
        for (int element : inputArray) {
            if (inputArray[1] > max)
                max = inputArray[1];
            if (inputArray[2] > max)
                max = inputArray[2];
        }
        return max;
    }
    public static void main(String[] args)
    {
        Integer[] intArray = {30,50,40};
        TestMaximum.toPrint(intArray);
        int maximum = TestMaximum.compareTo(intArray);
        System.out.println("Maximum integer number is:"+maximum);
    }
}
