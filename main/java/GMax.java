public class GMax<T>{
    T a;
    T b;
    T c;

    public static <T extends Comparable<T>> T TestMaximum(T... elements)
    {   T max=elements[0];
        for(T e:elements) {
            if (max.compareTo(e) < 0) {
                max = e;
            }
        }
        printMax(max,elements);
        return max;
    }
    public static <T> void printMax(T max,T... elements)
    {
        System.out.println("The maximum among the parameters ");
        for(T e:elements)
        {
            System.out.println(e+" ");
        }
        System.out.println("is "+ max );
    }
    public static void main(String[] args) {

        GMax g=new GMax();
    }
}
