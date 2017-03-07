package helmes.example.toys;

import helmes.example.ordertoy.factory.AverageChildrenToyFactory;
import helmes.example.utilities.RandomToyCharacteristicsUtility;


/**
 * Created by anton.mazur on 2/27/2017.
 */
public class Beanbag extends Toy {

    public static final String BEANBAG = "Beanbag";
    private String formOfBeanbag;

    public Beanbag() {
        super(BEANBAG, new AverageChildrenToyFactory());
        formOfBeanbag = RandomToyCharacteristicsUtility
                .setToysCharacteristicsRandomly(this, MaxPredictedValueOfToy.BEANBAG_MAX_PREDICTED_COST);
    }

    @Override
    public void play() {
        double toyQuality;

        super.play();
        toyQuality = getToyQuality() +
                ((double)MaxPredictedValueOfToy.BEANBAG_MAX_PREDICTED_COST /
                        (double)MaxPredictedValueOfToy.TOY_5_TIMES_MAX_PREDICTED_COST);
        setToyQuality(toyQuality);
    }

    @Override
    public String toString() {
        return "Beanbag{" +
                super.toString() +
                "formOfBeanbag='" + formOfBeanbag + '\'' +
                '}';
    }
}

