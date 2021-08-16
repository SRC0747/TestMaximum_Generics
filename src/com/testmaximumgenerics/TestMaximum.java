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
    public static void toPrint(Double[] doubleArray) {
        for (double element : doubleArray) {
            System.out.println(element);
        }
        System.out.println();
    }
    public static double compareTo(Double[] doubleArray)
    {
        double max = doubleArray[0];
        for (double element : doubleArray) {
            if (doubleArray[1] > max)
                max = doubleArray[1];
            if (doubleArray[2] > max)
                max = doubleArray[2];
        }
        return max;
    }
    public static void toPrint(String[] stringArray) {
        for (String element : stringArray) {
            System.out.println(element);
        }
        System.out.println();
    }
    public static String compareTo(String[] stringArray)
    {
        String max = stringArray[0];
        for (String element : stringArray) {
            if (stringArray[1] > max)
                max = stringArray[1];
            if (stringArray[2] > max)
                max = stringArray[2];
        }
        return max;
    }
    public static void main(String[] args)
    {
        Integer[] intArray = {30,50,40};
        Double[] doubleArray = {6.6,7.7,8.8};
        String[] stringArray = {"Apple","Peach","Banana"};

        TestMaximum.toPrint(intArray);
        int maximum_int = TestMaximum.compareTo(intArray);
        System.out.println("Maximum integer number is:"+maximum_int);
        TestMaximum.toPrint(doubleArray);
        double maximum_float = TestMaximum.compareTo(doubleArray);
        System.out.println("Maximum floating number is:"+maximum_float);
        TestMaximum.toPrint(stringArray);
        String maximum_string = TestMaximum.compareTo(stringArray);
        System.out.println("Maximum integer number is:"+maximum_string);
    }
}
