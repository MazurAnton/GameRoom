package components;

import toysnamefile.WorkInFile;

import java.io.FileNotFoundException;
import java.util.Random;

/**
 * Created by anton.mazur on 2/27/2017.
 */
abstract public class Toy  {



    /**
     * declare toys size
     */
    private enum ToySize  {BIG, SMALL, AVERAGE};
    /**
     *  toy's fields
     */
    protected String toyName;
    protected int toyCost;
    protected ToySize toySize;

    /**
     * toys constructors
     */

    public Toy() {
    }

    public Toy(String toyName) {
        this.toyName = toyName;
    }

    public Toy(String toyName, int toyCost, ToySize toySize) {
        this.toyCost = toyCost;
        this.toyName = toyName;
        this.toySize = toySize;
    }

    /**
     *
     * toys methods
     */


    @Override
    public String toString() {
        return "toyName='" + toyName + '\'' +
                ", toyCost=" + toyCost +
                ", toySize='" + toySize + '\'' +", ";
    }


    public void setToysCharacteristicsRandomly (int maxPredictedCost) throws FileNotFoundException {

        Random random = new Random();

        int randomCost = random.nextInt(maxPredictedCost) + 1;
        int randomSize = random.nextInt(3) + 1;

        this.setToySizeByNumber(randomSize);
        this.setToyCost(randomCost);
    }

    private void setToySizeByNumber(int number){
        if (number==1) toySize = ToySize.SMALL;
        else if (number==2) toySize = ToySize.AVERAGE;
        else if (number==3) toySize = ToySize.BIG;
    }

    public String getAllCharacteristicsOfToy (Toy toy) throws FileNotFoundException {

        String [] allToyCharacteristics = getAllKindsOfToysAndTheirCharacteristics(toy).split(" ");
        StringBuffer stringBuffer = new StringBuffer();


        for (int i=1 ; i < allToyCharacteristics.length; i++) {
            stringBuffer.append(allToyCharacteristics[i] + " ");
        }
        return stringBuffer.toString();

    }

    public String getAllKindsOfToysAndTheirCharacteristics(Toy toy) throws FileNotFoundException{

        String[] allKindsOfToysAndTheirCharacteristics =
                WorkInFile.read(WorkInFile.FILE_WITH_TOYS_NAME).split("\n");
        int indexOfToy = 0;


        for (int i=0 ; i < allKindsOfToysAndTheirCharacteristics.length; i++)
            if (allKindsOfToysAndTheirCharacteristics[i].startsWith(toy.getToyName())){
                indexOfToy = i;  break;}

                return allKindsOfToysAndTheirCharacteristics[indexOfToy];
    }
    /**
     * getters and setters
     * @param name
     * @param cost
     * @param size
     */
    public void setToyName(String toyName) {
        this.toyName = toyName;
    }


    public String getToyName() { return toyName; }

    public void setToyCost(int toyCost) {
        this.toyCost = toyCost;
    }

    public int getToyCost() {
        return toyCost;
    }

    public ToySize getToyEnumSize() {
        return toySize;
    }

    public String getToyStringSize() {
        return toySize.toString();
    }

    public void setToySize(ToySize toySize) {
        this.toySize = toySize;
    }

    public int getMaxPredictedCost(){ return 0;}



}
