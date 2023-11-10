import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class BinsTest extends TestCase {
    @Test
public void testBinsConstructor() {
        int min = 2;
        int max = 12;
        Bins bins = new Bins(min, max);
        Assert.assertNotNull(bins);
    }


    @Test
   public void testGetBin() {
        int min = 2;
        int max = 12;
        Bins bins = new Bins (min, max);
        int  actual = bins.getBin(4);

        Assert.assertEquals(0, actual);
    }
}