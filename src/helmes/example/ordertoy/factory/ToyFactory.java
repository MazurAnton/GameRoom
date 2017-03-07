package helmes.example.ordertoy.factory;

import helmes.example.ordertoy.state.ToyState;
import helmes.example.ordertoy.use.ToyUse;

/**
 * Created by anton.mazur on 3/2/2017.
 */
public interface ToyFactory {

    ToyState createToyState();
    ToyUse createToyUse();
    double setQuality();
}
