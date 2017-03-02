package helmes.example.toys;

import helmes.example.ordertoy.factory.SmallChildrenToyFactory;
import helmes.example.utilities.RandomToyCharacteristicsUtility;

import java.io.FileNotFoundException;

/**
 * Created by anton.mazur on 2/27/2017.
 */
public class Crossword extends Toy {

    public static final String CROSSWORD = "Crossword";
    private String difficultOfCrossword ;

    public Crossword() throws FileNotFoundException {
        super(CROSSWORD, new SmallChildrenToyFactory());
        difficultOfCrossword = RandomToyCharacteristicsUtility
                .setToysCharacteristicsRandomly(this, MaxPredictedValueOfToy.DOLL_MAX_PREDICTED_COST);
    }

    @Override
    public String toString() {
        return "Crossword{" +
                super.toString() +
                "difficultOfCrossword='" + difficultOfCrossword + '\'' +
                '}';
    }
}
