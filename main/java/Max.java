public class Max {

    public Integer FindIntMax(Integer a,Integer b,Integer c)
    {
        if (a.compareTo(b)>0 && a.compareTo(c)>0)
           return a;
        else if (b.compareTo(a)>0 && b.compareTo(c)>0)
            return b;
        else
            return c;
    }

    public Float FindFloatMax(Float a,Float b,Float c)
    {
        if (a.compareTo(b)>0 && a.compareTo(c)>0)
            return a;
        else if (b.compareTo(a)>0 && b.compareTo(c)>0)
            return b;
        else
            return c;
    }

    public String FindStringMax(String a,String b,String c)
    {
       Integer g=a.length();
        Integer h=b.length();
        Integer i=c.length();
        if((g.compareTo(FindIntMax(g,h,i))==0))
            return a;
        else if ((h.compareTo(FindIntMax(g,h,i))==0))
            return b;
        else
            return c;
    }
    public static void main(String[] args) {
        Max m=new Max();
    }
}
