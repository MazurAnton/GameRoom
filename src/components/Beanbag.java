package components;

import java.io.FileNotFoundException;
import java.util.Random;

/**
 * Created by anton.mazur on 2/27/2017.
 */
public class Beanbag extends Toy{


    private static final int BEANBAG_MAX_PREDICTED_COST = 20;
    private String formOfBeanbag;

    public Beanbag() throws FileNotFoundException {
        super("Beanbag");
       this.setToysCharacteristicsRandomly(BEANBAG_MAX_PREDICTED_COST);
    }

    @Override
    public void setToysCharacteristicsRandomly(int maxPredictedCost) throws FileNotFoundException {

        super.setToysCharacteristicsRandomly(maxPredictedCost);
        formOfBeanbag = setFormOfBeanbagRandomly();

    }


    public String setFormOfBeanbagRandomly() throws FileNotFoundException {
        Random random = new Random();

        String[] possibleFormOfBeanbag = super.getAllCharacteristicsOfToy(this).split(" ");
        int randomizeFormOfBeanbag = random.nextInt(possibleFormOfBeanbag.length) + 1;

        return possibleFormOfBeanbag[randomizeFormOfBeanbag-1];

    }


    @Override
    public String toString() {
        return "Beanbag{" +
                super.toString() +
                "formOfBeanbag='" + formOfBeanbag + '\'' +
                '}';
    }


    public int getMaxPredictedCost() {return BEANBAG_MAX_PREDICTED_COST;}
}

