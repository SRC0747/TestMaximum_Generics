package com.testmaximumgenerics;

public class TestMaximum {
    int x,y,z,p,q;
    public TestMaximum(int x, int y, int z, int p,int q){
        this.x = x;
        this.y = y;
        this.z = z;
        this.p = p;
        this.q = q;
    }
    double a,b,c,d,e;
    public TestMaximum(double a, double b, double c, double d,double e){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    String xx,yy,zz,pp,qq;
    public TestMaximum(String xx, String yy, String zz, String pp, String qq){
        this.xx = xx;
        this.yy = yy;
        this.zz = zz;
        this.pp = pp;
        this.qq = qq;
    }

    public static maximum_int(Integer[] inputArray)
    {
        //Sort the array in ascending order
        int temp;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i+1; j < inputArray.length; j++) {
                if(inputArray[i] > inputArray[j]) {
                    temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = inputArray;
                }
            }
        }
    }

    public static maximum_double(Double[] doubleArray)
    {
        //Sort the array in ascending order
        double temp;
        for (double i = 0; i < doubleArray.length; i++) {
            for (double j = i+1; j < doubleArray.length; j++) {
                if(doubleArray[i] > doubleArray[j]) {
                    temp = doubleArray[i];
                    doubleArray[i] = doubleArray[j];
                    doubleArray[j] = temp;
                }
            }
        }
    }
    public static maximum_string(String[] stringArray)
    {
        //Sort the array in ascending order
        String temp;
        for (String i = 0; i < stringArray.length; i++) {
            for (String j = i+1; j < stringArray.length; j++) {
                if(stringArray[i] > stringArray[j]) {
                    temp = stringArray[i];
                    stringArray[i] = stringArray[j];
                    stringArray[j] = temp;
                }
            }
        }
    }
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
            if (inputArray[3] > max)
                max = inputArray[3];
            if (inputArray[4] > max)
                max = inputArray[4];
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
            if (doubleArray[3] > max)
                max = doubleArray[3];
            if (doubleArray[4] > max)
                max = doubleArray[4];
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
            if (stringArray[3] > max)
                max = stringArray[3];
            if (stringArray[4] > max)
                max = stringArray[4];
        }
        return max;
    }
    public static void main(String[] args)
    {
        TestMaximum testMaximum_int = new TestMaximum(40,50,60,70,80).maximum_int();
        TestMaximum testMaximum_double = new TestMaximum(40.55,50.66,60.88,70.77,80.99).maximum_double();
        TestMaximum testMaximum_string = new TestMaximum("Apple","Peach","Banana","Lemon","Orange").maximum_string();
    }
}

