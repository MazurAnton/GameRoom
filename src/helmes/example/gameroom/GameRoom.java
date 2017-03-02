package helmes.example.gameroom;

import helmes.example.utilities.FileUtilities;
import helmes.example.toys.Toy;

import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by anton.mazur on 2/27/2017.
 */
public class GameRoom {

    private static GameRoom gameRoom;
    private static int totalMoneyOnToys;
    private static int maxAgeOfChildrens = 99;
    private static List<Toy> toysForGameRoom = new LinkedList<Toy>();

    private GameRoom()
            throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        generateToys();
    }


    public static void getInstance(int totalMoney)
            throws FileNotFoundException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        if (gameRoom == null) {
            totalMoneyOnToys = totalMoney;
            gameRoom = new GameRoom();
        }
    }

    public static void getInstance(int totalMoney, int maxAge)
            throws FileNotFoundException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        if (gameRoom == null) {
            maxAgeOfChildrens = maxAge;
            totalMoneyOnToys = totalMoney;
            gameRoom = new GameRoom();
        }
    }


    private static void generateToys()
            throws FileNotFoundException, ClassNotFoundException, IllegalAccessException, InstantiationException {

        int totalSum = 0;

        do {
            Class myClass = Class.forName("helmes.example.toys." +
                    generateToyName());
            Object myObject = myClass.newInstance();
            Toy someToyObject = (Toy) myObject;
            totalSum += someToyObject.getToyCost();
            toysForGameRoom.add(someToyObject);
        } while (totalSum <= totalMoneyOnToys);

    }

    public static String getNamesOfToysDependingOnMaxAge() throws FileNotFoundException {

        String[] nameAndCategoryOfToys = FileUtilities.read(FileUtilities.FILE_WITH_TOY_CATAGORY).split("\n");
        Integer age = new Integer("2");
        StringBuffer stringbuff = new StringBuffer();

        for (String some : nameAndCategoryOfToys) {
            if (some.matches("\\d+"))
                if (age.parseInt(some) >= maxAgeOfChildrens)
                    break;
            if (!(some.matches("\\d+")))
                stringbuff.append(some + " ");
        }
        return stringbuff.toString();
    }

    public static void seeToys() {
        sortToys();
        for (Toy toy : toysForGameRoom) {
            System.out.print(toy + "\n");
        }

    }

    public static String generateToyName() throws FileNotFoundException {

        Random random = new Random();

        String[] toysNames = getNamesOfToysDependingOnMaxAge().split(" ");
        int rangeOfName = toysNames.length;

        int randomNameIndex = random.nextInt(rangeOfName);
        return toysNames[randomNameIndex];
    }

    private static void sortToys() {
        Comparator<Toy> comparator = new ToysComparatorByCost().thenComparing(new ToysComparatorBySize());
        Collections.sort(toysForGameRoom, comparator);
    }
}
