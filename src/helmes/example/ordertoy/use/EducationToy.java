package helmes.example.ordertoy.use;

/**
 * Created by anton.mazur on 3/2/2017.
 */
public class EducationToy implements ToyUse {

    private double toyLearnCoefficient = 0.325;

    @Override
    public double learn() {

        double willReturn;

        willReturn = toyLearnCoefficient > ToyUse.MAX_TOY_LEARN_COEFFICIENT
                ? ToyUse.MAX_TOY_LEARN_COEFFICIENT : toyLearnCoefficient;
        toyLearnCoefficient += toyLearnCoefficient;

        return willReturn;
    }

    @Override
    public String toString() {
        return "education";
    }
}
