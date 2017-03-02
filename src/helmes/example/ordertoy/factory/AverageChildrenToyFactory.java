package helmes.example.ordertoy.factory;

import helmes.example.ordertoy.state.SolidToy;
import helmes.example.ordertoy.state.ToyState;
import helmes.example.ordertoy.use.EntertainmentToy;
import helmes.example.ordertoy.use.ToyUse;

/**
 * Created by anton.mazur on 3/2/2017.
 */

public class AverageChildrenToyFactory implements ToyFactory {

    @Override
    public ToyState createToyState() {
        return new SolidToy();
    }

    @Override
    public ToyUse createToyUse() {
        return new EntertainmentToy();
    }
}
