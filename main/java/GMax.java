public class GMax<T>{
    T a;
    T b;
    T c;

    public static <T extends Comparable<T>> T TestMaximum(T a, T b, T c)
    {
        if (a.compareTo(b)>0 && a.compareTo(c)>0)
            return a;
        else if (b.compareTo(a)>0 && b.compareTo(c)>0)
            return b;
        else
            return c;
    }

    public static void main(String[] args) {

        GMax g=new GMax();
    }
}
