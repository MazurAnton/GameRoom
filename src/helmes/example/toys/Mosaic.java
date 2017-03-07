package helmes.example.toys;

import helmes.example.ordertoy.factory.AverageChildrenToyFactory;
import helmes.example.utilities.RandomToyCharacteristicsUtility;


/**
 * Created by anton.mazur on 2/27/2017.
 */
public class Mosaic extends Toy {

    public static final String MOSAIC = "Mosaic";
    private  String colorOfMosaic;

    public Mosaic() {
        super(MOSAIC, new AverageChildrenToyFactory());
        colorOfMosaic = RandomToyCharacteristicsUtility
                .setToysCharacteristicsRandomly(this, MaxPredictedValueOfToy.MOSAIC_MAX_PREDICTED_COST);
    }

    public void play() {
        double toyQuality;

        super.play();
        toyQuality = getToyQuality() +
                ((double)MaxPredictedValueOfToy.MOSAIC_MAX_PREDICTED_COST /
                        (double)MaxPredictedValueOfToy.TOY_5_TIMES_MAX_PREDICTED_COST);
        setToyQuality(toyQuality);
    }

    @Override
    public String toString() {
        return "Mosaic{" +
                super.toString() +
                "colorOfMosaic='" + colorOfMosaic + '\'' +
                '}';
    }
}
