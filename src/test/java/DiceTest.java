import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class DiceTest extends TestCase {
@Test
    public void testDiceConstruction(){
    int numberOfDice = 2;
    Dice dice = new  Dice(numberOfDice);

    Assert.assertNotNull(dice);
}

@Test

    public void testTossandSum (){
    int numberOfDice = 2;
    int max = numberOfDice * 6;//12
    Dice dice = new Dice(numberOfDice);
    Integer actual = dice.tossAndSum();

    Assert.assertTrue(actual <= max);
    Assert.assertTrue( actual >- numberOfDice);
}

}