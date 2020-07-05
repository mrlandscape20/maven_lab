import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class JenkinsDemo
{
    private Integer a = 1;
    private Integer b = 2;
    private Integer c;

    @Before
    public void calculation()
    {	
    	c = a + b;
    }

    @Test
    public void testCasePassed()
    {
        Assert.assertEquals(5, c.intValue());
        System.out.println("c is : " + c);
    }
    
    @Ignore
    @Test
    public void testCaseFailed()
    {
        Assert.assertEquals(4, c.intValue());
        System.out.println("c is : " + c);
    }

}
