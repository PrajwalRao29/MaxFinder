public class GMax<T>{
    T a;
    T b;
    T c;

    public static <T extends Comparable<T>> T TestMaximum(T... elements)
    {   T max=elements[0];
        for(T e:elements)
        {
            if(max.compareTo(e)<0)
            {
                max=e;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        GMax g=new GMax();
    }
}
