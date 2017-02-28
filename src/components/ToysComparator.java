package components;

/**
 * Created by anton.mazur on 2/27/2017.
 */

import java.util.Comparator;

import java.util.Comparator;
import components.Toy;


/**
 * Created by anton.mazur on 2/27/2017.
 */
class ToysComparatorByCost implements Comparator<Toy> {
    @Override
    public int compare(Toy firstToy, Toy secondToy) {

        int costOfFirstToy = firstToy.getToyCost();
        int costOfSecondToy = secondToy.getToyCost();


        if(costOfFirstToy > costOfSecondToy) {
            return 1;
        }
        else if(costOfFirstToy < costOfSecondToy) {
            return -1;
        }
        else {
            return 0;
        }
    }
}



class ToysComparatorBySize implements Comparator<Toy>{

    @Override
    public int compare(Toy firstToy, Toy secondToy) {


        int fristToyNumericalEquivalentOfSize = numericalEquivalentOfSize(firstToy.getToyStringSize()) ;
        int secondToyNumericalEquivalentOfSize = numericalEquivalentOfSize(secondToy.getToyStringSize());


        if(fristToyNumericalEquivalentOfSize > secondToyNumericalEquivalentOfSize) {
            return 1;
        }
        else if(fristToyNumericalEquivalentOfSize < secondToyNumericalEquivalentOfSize) {
            return -1;
        }
        else {
            return 0;
        }

    }

    private int numericalEquivalentOfSize(String fromStringToInt){
        if (fromStringToInt.equals("BIG")) return 1;
        else if (fromStringToInt.equals("AVERAGE")) return 0;
        else return -1;
    }
}