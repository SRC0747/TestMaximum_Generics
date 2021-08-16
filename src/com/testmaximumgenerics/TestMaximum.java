package com.testmaximumgenerics;

public class MaximumTest <T extends Comparable<T>> {
    T x,y,z;
    public MaximumTest(T x, T y, T z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public T maximum()
    {
        return MaximumTest.maximum(x,y,z);
    }
    //Determine the largest of three Comparable objects.
    public static <T extends Comparable<T>> T maximum(T x,T y,T z)
    {
        T max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        printMax(x,y,z,max);
        return max;
    }
    public static String testMaximum(String x, String y, String z)
    {
        String max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        printMax(x,y,z,max);
        return max;
    }
    public static <T> void printMax(T x, T y, T z, T max)
    {
        System.out.println(max);
    }

    public static void main(String[] args)
    {
        Integer xInt=3, yInt=4, zInt=5;
        Float xF1=6.6f, yF1=7.7f, zF1=8.8f;
        String xStr="Apple", yStr="Peach", zStr="Banana";

        MaximumTest.testMaximum(xStr, yStr, zStr);
        new MaximumTest(xInt, yInt, zInt).maximum();
        new MaximumTest(xF1, yF1, zF1).maximum();
        new MaximumTest(xStr, yStr, zStr).maximum();

    }
}