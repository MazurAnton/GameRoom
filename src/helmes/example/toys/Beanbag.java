package helmes.example.toys;

import helmes.example.ordertoy.factory.AverageChildrenToyFactory;
import helmes.example.utilities.RandomToyCharacteristicsUtility;

import java.io.FileNotFoundException;

/**
 * Created by anton.mazur on 2/27/2017.
 */
public class Beanbag extends Toy {

    public static final String BEANBAG = "Beanbag";
    private String formOfBeanbag;

    public Beanbag() throws FileNotFoundException {
        super(BEANBAG, new AverageChildrenToyFactory());
        formOfBeanbag = RandomToyCharacteristicsUtility
                .setToysCharacteristicsRandomly(this, MaxPredictedValueOfToy.DOLL_MAX_PREDICTED_COST);
    }


    @Override
    public String toString() {
        return "Beanbag{" +
                super.toString() +
                "formOfBeanbag='" + formOfBeanbag + '\'' +
                '}';
    }
}

