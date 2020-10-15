import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMax {
    Max m = new Max();
    Integer a,b,c;
    Float d,e,f;

    @Before
    public void initialize()
    {
        a=3;b=2;c=1;
        d=3.00f;e=2.00f;f=1.00f;
    }
    @Test
    public void test1MaxatfirstInt() {
        Assert.assertSame(m.FindIntMax(a, b, c), a);
    }

    @Test
    public void test2MaxatSecondInt() {
        Assert.assertSame(m.FindIntMax(b, a, c), a);
    }

    @Test
    public void test3MaxatThirdInt() {
        Assert.assertSame(m.FindIntMax(b, c, a), a);
    }
    @Test
    public void test4MaxatfirstFloat() {
        Assert.assertSame(m.FindFloatMax(d, e, f), d);
    }

    @Test
    public void test5MaxatSecondFloat() {
        Assert.assertSame(m.FindFloatMax(e, d, f), d);
    }

    @Test
    public void test6MaxatThirdFloat() {
        Assert.assertSame(m.FindFloatMax(e, f, d), d);
    }
}
