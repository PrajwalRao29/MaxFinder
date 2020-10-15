public class Max {

    public Integer FindMax(Integer a,Integer b,Integer c)
    {
        if (a >= b && a >= c)
           return a;
        else if (b >= a && b >= c)
            return b;
        else
            return c;
    }

    public static void main(String[] args) {
        Max m=new Max();
        System.out.println(m.FindMax(1,2,3));
    }
}
