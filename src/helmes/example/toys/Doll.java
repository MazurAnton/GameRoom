package helmes.example.toys;

import helmes.example.ordertoy.factory.SmallChildrenToyFactory;
import helmes.example.utilities.RandomToyCharacteristicsUtility;

import java.io.FileNotFoundException;

/**
 * Created by anton.mazur on 2/27/2017.
 */
public class Doll extends Toy {

    public static final String DOLL = "Doll";
    private String kindOfDolle;


    public Doll() throws FileNotFoundException {
        super(DOLL, new SmallChildrenToyFactory());
        kindOfDolle = RandomToyCharacteristicsUtility
                .setToysCharacteristicsRandomly(this, MaxPredictedValueOfToy.DOLL_MAX_PREDICTED_COST);
    }

    @Override
    public String toString() {
        return "Doll{" +
                super.toString() +
                "kindOfDolle='" + kindOfDolle + '\'' +
                '}';
    }

}
