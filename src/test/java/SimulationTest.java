import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;


public class SimulationTest extends TestCase {
    public void testSimulationConstructor(){
        int numberOfDies = 2;
        int numberOfTosses = 10;
        Simulation simulation = new Simulation( numberOfDies, numberOfTosses);
        Assert.assertNotNull(simulation);
    }

public void testRunSimulation(){
        int numberOfDies = 2;
        int numberOfTosses = 10;
        Simulation simulation = new Simulation(numberOfDies, numberOfTosses);
}

    Simulation.runSimulation();
}