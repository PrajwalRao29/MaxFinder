import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMax {
    Max m = new Max();
    GMax g = new GMax();
    Integer a, b, c, j;
    Float d, e, f, k;
    String x, y, z, l;

    @Before
    public void initialize() {
        a = 3;
        b = 2;
        c = 1;
        j = 4;
        d = 3.00f;
        e = 2.00f;
        f = 1.00f;
        k = 0.00f;
        x = "Hi";
        y = "World";
        z = "Prajwal";
        l = "alright";
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

    @Test
    public void test7MaxatfirstString() {
        Assert.assertSame(m.FindStringMax(z, x, y), y);
    }

    @Test
    public void test8MaxatSecondString() {
        Assert.assertSame(m.FindStringMax(x, z, y), y);
    }

    @Test
    public void test9MaxatThirdString() {
        Assert.assertSame(m.FindStringMax(x, y, z), y);
    }

    @Test
    public void test10MaxatSecondGeneric() {
        Assert.assertSame(m.FindGenericMax(b, a, c), a);
    }

    @Test
    public void test11MaxatfirstGeneric() {
        Assert.assertSame(m.FindGenericMax(d, e, f), d);
    }

    @Test
    public void test12MaxatThirdGeneric() {
        Assert.assertSame(m.FindGenericMax(x, y, z), y);
    }

    @Test
    public void test13GenericClassMax() {
        Assert.assertSame(g.TestMaximum(a, b, c, j), j);
    }

    @Test
    public void test14GenericClassMax() {
        Assert.assertSame(g.TestMaximum(d, e, f, k), d);
    }
    @Test
    public void test15GenericClassMax() {
        Assert.assertSame(g.TestMaximum(d, e), d);
    }

}
