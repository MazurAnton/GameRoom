package helmes.example.toys;

import helmes.example.ordertoy.factory.SmallChildrenToyFactory;
import helmes.example.utilities.RandomToyCharacteristicsUtility;

import java.io.FileNotFoundException;

/**
 * Created by anton.mazur on 2/27/2017.
 */
public class Dinosaur extends Toy implements MaxPredictedValueOfToy {

    public static final String DINOSAUR = "Dinosaur";
    private String speciesOfDino;

    public Dinosaur() throws FileNotFoundException {
        super(DINOSAUR, new SmallChildrenToyFactory());
        speciesOfDino = RandomToyCharacteristicsUtility
                .setToysCharacteristicsRandomly(this, MaxPredictedValueOfToy.DOLL_MAX_PREDICTED_COST);
    }

    @Override
    public String toString() {
        return "Dinosaur{" +
                super.toString() +
                "speciesOfDino='" + speciesOfDino + '\'' +
                '}';
    }
}

