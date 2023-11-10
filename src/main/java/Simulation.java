import java.sql.SQLOutput;

public class Simulation {

// Create construction (int numberOfDies, int numberOfTosses)
    int numberOfDies;
    int numberOfTosses;
public Simulation(int numberOfDies, int numberOfTosses){
    this.numberOfDies = numberOfDies;
    this.numberOfTosses = numberOfDies;
}

    // create runSimulation method
    // use the value in constructor
    // to simulate the toss throwing.

    public void runSimulation (){
    Dice dice = new Dice (this.numberOfDies);
    Bins bins = new Bins (this.numberOfDies, this.numberOfDies * 6);

    for( int i = 0; i< this.numberOfTosses; i++){
        bins.incrementBin(dice.tossAndSum());

    }
    for(int i = 2; i < numberOfDies * 6; i++ ){
        System.out.println("value of bin number" + i + ":" +bins.getBin(i));
    }
    }

}
