

import org.junit.Assert;
import org.junit.Test;

public class CDelieveryjtest {
    CDelivery Cobj = new CDelivery();

    @Test
    public void PriceForDistanceLessThan10KM() {
        Assert.assertEquals(10, Cobj.PriceForDistance(8));

    }
    @Test
    public void PriceForDistanceGreaterThan10KM() {
        Assert.assertEquals(25, Cobj.PriceForDistance(12));
    }
    
    @Test
    public void PriceForDistanceLessThan10KWithStairs() {
        Assert.assertEquals(20, Cobj.PriceForDistanceAndStairs(8));
    }
    
    public void PriceForDistanceGreaterThan10KWithStairs() {
        Assert.assertEquals(35, Cobj.PriceForDistanceAndStairs(30));
    }
    public void PriceForWeekend() {
        Assert.assertEquals(50, Cobj.Weekend());
    }
}