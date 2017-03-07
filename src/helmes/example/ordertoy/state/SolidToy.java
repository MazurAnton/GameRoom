package helmes.example.ordertoy.state;

/**
 * Created by anton.mazur on 3/2/2017.
 */
public class SolidToy implements ToyState {

    private double toyHitCoefficient = 0.35;

    @Override
    public double hit() {

        double willReturn;

        willReturn = toyHitCoefficient > ToyState.MAX_TOY_HIT_COEFFICIENT
                ? ToyState.MAX_TOY_HIT_COEFFICIENT : toyHitCoefficient;
        toyHitCoefficient += toyHitCoefficient;

        return willReturn;
    }

    @Override
    public String toString() {
        return "solid";
    }
}
