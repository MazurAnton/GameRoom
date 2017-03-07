package helmes.example.gameroom;

/**
 * Created by anton.mazur on 2/27/2017.
 */

import helmes.example.toys.Toy;

import java.util.Comparator;


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