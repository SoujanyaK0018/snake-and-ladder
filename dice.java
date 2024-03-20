package dice;

public class dice {
    int MIN=1;
    int MAX=6;
    public int dice_roll(){
        double d = (Math.random()*(MAX-MIN)+MIN);
        return (int)d;

    }

}
