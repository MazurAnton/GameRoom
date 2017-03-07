package helmes.example.toys;

import helmes.example.ordertoy.factory.SmallChildrenToyFactory;
import helmes.example.utilities.RandomToyCharacteristicsUtility;


/**
 * Created by anton.mazur on 2/27/2017.
 */
public class Doll extends Toy {

    public static final String DOLL = "Doll";
    private String kindOfDolle;


    public Doll() {
        super(DOLL, new SmallChildrenToyFactory());
        kindOfDolle = RandomToyCharacteristicsUtility
                .setToysCharacteristicsRandomly(this, MaxPredictedValueOfToy.DOLL_MAX_PREDICTED_COST);
    }

    public void play() {

        double toyQuality;

        super.play();
        toyQuality = getToyQuality() +
                ((double)MaxPredictedValueOfToy.DOLL_MAX_PREDICTED_COST /
                        (double)MaxPredictedValueOfToy.TOY_5_TIMES_MAX_PREDICTED_COST);
        setToyQuality(toyQuality);
    }

    @Override
    public String toString() {
        return "Doll{" +
                super.toString() +
                "kindOfDolle='" + kindOfDolle + '\'' +
                '}';
    }

}
