package components;

import java.io.FileNotFoundException;
import java.util.Random;

/**
 * Created by anton.mazur on 2/27/2017.
 */
public class Doll extends Toy {

    private static final int DOLL_MAX_PREDICTED_COST = 60;
    private String kindOfDolle;


    public Doll() throws FileNotFoundException {
        super("Doll");
        this.setToysCharacteristicsRandomly(DOLL_MAX_PREDICTED_COST);

    }


    @Override
    public void setToysCharacteristicsRandomly(int maxPredictedCost) throws FileNotFoundException {

        super.setToysCharacteristicsRandomly(maxPredictedCost);
        kindOfDolle = setKindOfDollRandomly();

    }

    public String setKindOfDollRandomly() throws FileNotFoundException {
        Random random = new Random();

        String[] possiblekindOfDoll= super.getAllCharacteristicsOfToy(this).split(" ");
        int randomizeKindOfDoll = random.nextInt(possiblekindOfDoll.length) + 1;

        return possiblekindOfDoll[randomizeKindOfDoll-1];

    }


    @Override
    public String toString() {
        return "Doll{" +
                super.toString() +
                "kindOfDolle='" + kindOfDolle + '\'' +
                '}';
    }

    public int getMaxPredictedCost(int Max_Predicted_Cost) {return DOLL_MAX_PREDICTED_COST;}
}
