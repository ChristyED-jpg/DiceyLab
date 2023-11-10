import java.util.Random;

public class Dice {
    // create constructor (int numberOfDice)
    int numberOfDice;
    public Dice (int numberOfDice ){
        this.numberOfDice = numberOfDice;
    }
    // create method tossAndSun()
    // toss Dice & add up all the values
    // return Integer

    public Integer tossAndSum() {
        Integer sum = 0;
        Random random = new Random();

        for (int i = 0; i < this.numberOfDice; i++) ;
        sum += random.nextInt(6) + 1;
        return sum;
    }


}
