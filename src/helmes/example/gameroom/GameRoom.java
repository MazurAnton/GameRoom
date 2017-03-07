package helmes.example.gameroom;

import helmes.example.utilities.FileUtilities;
import helmes.example.toys.Toy;
import helmes.example.utilities.RandomToyUtility;

import java.util.*;

/**
 * Created by anton.mazur on 2/27/2017.
 */
public enum GameRoom {

    GAMEROOM;
    private static final String ARE_NUMBERS = "\\d+";


    private int totalMoneyOnToys = 500;
    private int maxAgeOfChildrens = 99;
    private List<Toy> toysForGameRoom = new LinkedList<Toy>();

    GameRoom() {
        generateToys();
    }

    public void setGameRoom(int totalMoneyOnToys, int maxAgeOfChildrens) {
        this.totalMoneyOnToys = totalMoneyOnToys;
        this.maxAgeOfChildrens = maxAgeOfChildrens;
        toysForGameRoom.clear();
        generateToys();
    }

    private void generateToys() {

        int totalSum = 0;
        String toyName = null;

        do {
            toyName = generateToyName();
            Toy someToyObject = RandomToyUtility.generateToy(toyName);
            if (someToyObject == null) {
                continue;
            }
            totalSum += someToyObject.getToyCost();
            toysForGameRoom.add(someToyObject);
        } while (totalSum <= totalMoneyOnToys);

    }

    private String getNamesOfToysDependingOnMaxAge() {

        String[] nameAndCategoryOfToys = FileUtilities.read(FileUtilities.FILE_WITH_TOY_CATAGORY).split("\n");
        Integer age = new Integer("2");
        StringBuffer stringbuff = new StringBuffer();

        for (String some : nameAndCategoryOfToys) {
            if (some.matches(ARE_NUMBERS))
                if (age.parseInt(some) >= maxAgeOfChildrens)
                    break;
            if (!(some.matches(ARE_NUMBERS)))
                stringbuff.append(some + " ");
        }
        return stringbuff.toString();
    }

    public void seeToys() {
        sortToys();
        for (Toy toy : toysForGameRoom) {
            System.out.print(toy + "\n");
        }

    }

    private String generateToyName() {

        Random random = new Random();

        String[] toysNames = getNamesOfToysDependingOnMaxAge().split(" ");
        int rangeOfName = toysNames.length;

        int randomNameIndex = random.nextInt(rangeOfName);
        return toysNames[randomNameIndex];
    }

    public void playWithToys() {
        for (Toy toy: toysForGameRoom)
        toy.play();
    }

    private void sortToys() {
        Comparator<Toy> comparator = new ToysComparatorByCost();
        comparator.thenComparing(new ToysComparatorByQuality());
        comparator.thenComparing(new ToysComparatorBySize());
        Collections.sort(toysForGameRoom, comparator);
    }
}
