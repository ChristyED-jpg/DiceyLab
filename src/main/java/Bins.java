
public class Bins {

    // create a constructor (int min, int max)
    int min;
    int max;
    int [] Pvalue;

    public Bins(int min, int max) {
        this.min = min;
        this.max = max;
        Pvalue = new int[max - min + 1];// size 11
    }

//create getBin(int binnumber)
// find the value at binnumber
// return value

    public int  getBin(int binnumber) {

        return this.Pvalue[binnumber - this.min];
    }
// create increment (int binnumber)
//


}