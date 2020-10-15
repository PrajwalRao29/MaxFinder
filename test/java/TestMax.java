import org.junit.Assert;
import org.junit.Test;

public class TestMax {
Max m=new Max();

@Test
    public void test1Maxatfirst()
{
    Assert.assertSame(m.FindMax(3,2,1),3);
}
    @Test
    public void test2MaxatSecond()
    {
        Assert.assertSame(m.FindMax(2,3,1),3);
    }

}
