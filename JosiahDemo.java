class Trout implements Cloneable {
    public int numOfFins;
    public int numOfTails;

    public Trout(int numOfFins, int numOfTails) {
        this.numOfFins = numOfFins;
        this.numOfTails = numOfTails;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class JosiahDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        // create new Trout object and clone it
        Trout trout1 = new Trout(3, 1);
        Trout trout2 = (Trout)trout1.clone();

        // modify trout2
        trout2.numOfFins = 4;
        trout2.numOfTails = 2;

        // print trouts
        System.out.printf("Trout1 has %d fins and %d tails\n"
        , trout1.numOfFins, trout1.numOfTails);

        System.out.printf("Trout2 has %d fins and %d tails\n"
        , trout2.numOfFins, trout2.numOfTails);
    }
}