package components;

import java.io.FileNotFoundException;
import java.util.Random;

/**
 * Created by anton.mazur on 2/27/2017.
 */
public class Mosaic extends Toy {


    private static final int MOSAIC_MAX_PREDICTED_COST = 30;
    private  String colorOfMosaic;

    public Mosaic() throws FileNotFoundException {
        super("Mosaic");
        this.setToysCharacteristicsRandomly(MOSAIC_MAX_PREDICTED_COST);
    }

    @Override
    public void setToysCharacteristicsRandomly(int maxPredictedCost) throws FileNotFoundException {

        super.setToysCharacteristicsRandomly(maxPredictedCost);
        colorOfMosaic = setMosaicColorRandomly();

    }


    public String setMosaicColorRandomly() throws FileNotFoundException {
        Random random = new Random();

        String[] possibleColorOfMosaic = super.getAllCharacteristicsOfToy(this).split(" ");
        int randomizeColor = random.nextInt(possibleColorOfMosaic.length) + 1;

        return possibleColorOfMosaic[randomizeColor-1];

    }


    @Override
    public String toString() {
        return "Mosaic{" +
                super.toString() +
                "colorOfMosaic='" + colorOfMosaic + '\'' +
                '}';
    }


    public int getMaxPredictedCost() {return MOSAIC_MAX_PREDICTED_COST;}
}
