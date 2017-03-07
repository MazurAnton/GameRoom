package helmes.example.toys;

import helmes.example.ordertoy.factory.SmallChildrenToyFactory;
import helmes.example.utilities.RandomToyCharacteristicsUtility;


/**
 * Created by anton.mazur on 2/27/2017.
 */
public class Dinosaur extends Toy implements MaxPredictedValueOfToy {

    public static final String DINOSAUR = "Dinosaur";
    private String speciesOfDino;

    public Dinosaur() {
        super(DINOSAUR, new SmallChildrenToyFactory());
        speciesOfDino = RandomToyCharacteristicsUtility
                .setToysCharacteristicsRandomly(this, MaxPredictedValueOfToy.DINOSAUR_MAX_PREDICTED_COST);
    }

    public void play() {
        double toyQuality;

        super.play();
        toyQuality = getToyQuality() +
                ((double)MaxPredictedValueOfToy.DINOSAUR_MAX_PREDICTED_COST /
                        (double)MaxPredictedValueOfToy.TOY_5_TIMES_MAX_PREDICTED_COST);
        setToyQuality(toyQuality);
    }

    @Override
    public String toString() {
        return "Dinosaur{" +
                super.toString() +
                "speciesOfDino='" + speciesOfDino + '\'' +
                '}';
    }
}

