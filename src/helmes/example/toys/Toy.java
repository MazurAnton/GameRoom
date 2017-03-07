package helmes.example.toys;

import helmes.example.ordertoy.factory.ToyFactory;
import helmes.example.ordertoy.state.ToyState;
import helmes.example.ordertoy.use.ToyUse;

/**
 * Created by anton.mazur on 2/27/2017.
 */
abstract public class Toy {

    private static final double TOY_MAX_QUALITY = 1.0;

    /**
     * declare toys size
     */
    public enum ToySize {
        BIG, SMALL, AVERAGE
    }

    /**
     * toy's fields
     */
    protected String toyName;
    protected int toyCost;
    protected ToySize toySize;
    private ToyUse toyUse;
    private ToyState toyState;
    private double toyQuality;

    /**
     * toys constructors
     */

    public Toy(String toyName, ToyFactory toyFactory) {
        this.toyName = toyName;
        this.toyUse = toyFactory.createToyUse();
        this.toyState = toyFactory.createToyState();
        this.toyQuality = toyFactory.setQuality();
    }

    public void play() {
        toyQuality -= (1 - toyUse.learn()) * (1 - toyState.hit());
    }

    /**
     * toys methods
     */

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public String getToyName() {
        return toyName;
    }

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

    public double getToyQuality() {
        return toyQuality;
    }

    public void setToyQuality(double toyQuality) {
        this.toyQuality =
                (toyQuality > TOY_MAX_QUALITY ? TOY_MAX_QUALITY : toyQuality);
    }

    @Override
    public String toString() {
        return "Quality='" + toyQuality + '\'' +
                ", Cost=" + toyCost +
                ", Use=" + toyUse +
                ", State=" + toyState +
                ", Size='" + toySize + '\'' + ", ";
    }

}
