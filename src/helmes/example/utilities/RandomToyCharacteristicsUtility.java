package helmes.example.utilities;

import helmes.example.toys.Toy;

import java.util.Random;

/**
 * Created by anton.mazur on 3/2/2017.
 */
public final class RandomToyCharacteristicsUtility {


    public static String setToysCharacteristicsRandomly(Toy toy, int maxPredictedCost) {

        Random random = new Random();

        int randomCost = random.nextInt(maxPredictedCost) + 1;
        int randomSize = random.nextInt(3) + 1;

        setToySizeByNumber(toy, randomSize);
        toy.setToyCost(randomCost);
        return setSpecialityRandomly(toy);
    }

    private static void setToySizeByNumber(Toy toy, int number) {
        if (number == 1) {
            toy.setToySize(Toy.ToySize.SMALL);
        } else if (number == 2) {
            toy.setToySize(Toy.ToySize.AVERAGE);
        } else if (number == 3) {
            toy.setToySize(Toy.ToySize.BIG);
        }
    }


    private static String setSpecialityRandomly(Toy toy) {

        Random random = new Random();

        String[] possibleToySpeciality = getAllCharacteristicsOfToy(toy).split(" ");
        int randomizeToySpeciality = random.nextInt(possibleToySpeciality.length) + 1;

        return possibleToySpeciality[randomizeToySpeciality - 1];
    }

    private static String getAllCharacteristicsOfToy(Toy toy) {

        String[] allToyCharacteristics = getAllKindsOfToysAndTheirCharacteristics(toy).split(" ");
        StringBuilder stringBuilder = new StringBuilder();


        for (int i = 1; i < allToyCharacteristics.length; i++) {
            stringBuilder.append(allToyCharacteristics[i] + " ");
        }
        return stringBuilder.toString();

    }

    private static String getAllKindsOfToysAndTheirCharacteristics(Toy toy) {

        String[] allKindsOfToysAndTheirCharacteristics =
                FileUtilities.read(FileUtilities.FILE_WITH_TOYS_NAME).split("\n");
        int indexOfToy = 0;


        for (int i = 0; i < allKindsOfToysAndTheirCharacteristics.length; i++)
            if (allKindsOfToysAndTheirCharacteristics[i].startsWith(toy.getToyName())) {
                indexOfToy = i;
                break;
            }

        return allKindsOfToysAndTheirCharacteristics[indexOfToy];
    }
}
