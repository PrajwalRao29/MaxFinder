import java.util.ArrayList;
import java.util.Collections;

public class GMax<T>{
    T a;
    T b;
    T c;

    public static <T extends Comparable<T>> T TestMaximum(T... elements)
    {   T max=elements[0];
        ArrayList <T> arr=new ArrayList();
        for(T e:elements) {
           arr.add(e);
            }
        Collections.sort(arr);
        printMax(arr.get(arr.size()-1),elements);
        return arr.get(arr.size()-1);
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
