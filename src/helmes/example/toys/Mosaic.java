package helmes.example.toys;

import helmes.example.ordertoy.factory.AverageChildrenToyFactory;
import helmes.example.utilities.RandomToyCharacteristicsUtility;

import java.io.FileNotFoundException;

/**
 * Created by anton.mazur on 2/27/2017.
 */
public class Mosaic extends Toy {

    public static final String MOSAIC = "Mosaic";
    private  String colorOfMosaic;

    public Mosaic() throws FileNotFoundException {
        super(MOSAIC, new AverageChildrenToyFactory());
        colorOfMosaic = RandomToyCharacteristicsUtility
                .setToysCharacteristicsRandomly(this, MaxPredictedValueOfToy.DOLL_MAX_PREDICTED_COST);
    }

    @Override
    public String toString() {
        return "Mosaic{" +
                super.toString() +
                "colorOfMosaic='" + colorOfMosaic + '\'' +
                '}';
    }
}
