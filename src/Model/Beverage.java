package Model;

/**
 * Created by Sander on 12/20/2016.
 */
public class Beverage {                 //Beverage objekt

    private String name;                //Beverage omadused
    private double quantity;
    private double vol;

    public String getName() { return name; }                //Get annab Beverage väärtuse
                                                            //Set muudab väärtuse, return annab välja
    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getVol() {
        return vol;
    }

    public void setVol(double vol) {
        this.vol = vol;
    }

}
