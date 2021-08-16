public class MaximumTest <T extends Comparable<T>> {
    T x,y,z,p,q;
    public MaximumTest(T x, T y, T z, T p, T q){
        this.x = x;
        this.y = y;
        this.z = z;
        this.p = p;
        this.q = q;
    }
    public T maximum()
    {
        return MaximumTest.maximum(x,y,z,p,q);
    }

    //Determine the largest of three Comparable objects.
    public static <T extends Comparable<T>> T maximum(T x,T y,T z,T p,T q)
    {
        T max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        if(p.compareTo(max) > 0){
            max = p;
        }
        if(q.compareTo(max) > 0){
            max = q;
        }
        printMax(x,y,z,p,q,max);
        return max;
    }

    public static String testMaximum(String x, String y, String z,String p,String q)
    {
        String max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        if(p.compareTo(max) > 0){
            max = p;
        }
        if(q.compareTo(max) > 0){
            max = q;
        }
        printMax(x,y,z,p,q,max);
        return max;
    }
    public static <T> void printMax(T x, T y, T z,T p,T q,T max)
    {
        System.out.println(max);
    }

    public static void main(String[] args)
    {
        Integer xInt=3, yInt=4, zInt=5, pInt=6, qInt=7;
        Float xF1=6.6f, yF1=7.7f, zF1=8.8f, pF1=9.9f, qF1=11.11f;
        String xStr="Apple", yStr="Peach", zStr="Banana", pStr="Lemon", qStr="Orange";

        MaximumTest.testMaximum(xStr, yStr, zStr, pStr, qStr);
        new MaximumTest(xInt, yInt, zInt, pInt, qInt).maximum();
        new MaximumTest(xF1, yF1, zF1, pF1, qF1).maximum();
        new MaximumTest(xStr, yStr, zStr, pStr, qStr).maximum();

    }
}
