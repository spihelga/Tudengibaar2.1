import Model.Beverage;
import Model.Mineral;
import Model.Recipe;

/**
 * Created by Sander on 12/29/2016.
 */
public class Methods {
    public static double calc(Recipe recipe) {                              // Kontrollib kumma järgi peab klaaside kogust arvutama
        double g = 0;
        double g2 = 0;
        double bev = recipe.getBev1().getQuantity();                        //Alko kogus retsetpi järgi
        double bev2 = recipe.getBev2().getQuantity();
        double bev3 = recipe.getBev3().getQuantity();
        double min = recipe.getMin1().getQuantity();                        //Pikendaja kogus retsetpti järgi
        double min2 = recipe.getMin2().getQuantity();
        double min3 = recipe.getMin3().getQuantity();
        double k = min / bev;
        double k3 = min2 /bev2;
        double k4 = min3 / bev3;
        double bevinv = getBeverage(recipe.getBev1().getName());            //Palju on praegu tegelikult alkot
        double bevinv2 = getBeverage(recipe.getBev2().getName());
        double bevinv3 = getBeverage(recipe.getBev3().getName());
        double mininv = getMineral(recipe.getMin1().getName());             //Palju on tegelikult pikendajat
        double mininv2 = getMineral(recipe.getMin2().getName());
        double mininv3 = getMineral(recipe.getMin3().getName());
        double k2 = mininv / bevinv;
        double k5 = mininv2 / bevinv2;
        double k6 = mininv3 / bevinv3;
        if (k > k2 && k > 0) {                                                       //Arvutab klaaside kogused selle järgi mida on vöhem
            g = (mininv / (k) + mininv) / Save.glasssize;
        }
        if (k3 > k5 && k3 > 0) {
            g = (mininv2 / (k3) + mininv2) / Save.glasssize;
           }
        if (k4 > k6 && k4 > 0) {
            g = (mininv3 / (k4) + mininv3) / Save.glasssize;
        }
        if (k < k2 && k > 0) {
            g = (bevinv * (k) + bevinv) / Save.glasssize;
        }
        if (k3 < k5 && k3 > 0) {
            g = (bevinv2 * (k3) + bevinv2) / Save.glasssize;
        }
        if (k4 < k6 && k4 > 0) {
            g = (bevinv3 * (k4) + bevinv3) / Save.glasssize;
        }
        return g;
    }

    public static void addRec(String name, double bev, double min, double gin, double ton, double vod, double cjui) {

        Beverage beverage = new Beverage();                                 //Loob uue beverage
        beverage.setName("Rum");
        beverage.setQuantity(bev);
        beverage.setVol(Save.vol);

        Beverage beverage2 = new Beverage();
        beverage2.setName("Gin");
        beverage2.setQuantity(gin);
        beverage2.setVol(Save.vol);

        Beverage beverage3 = new Beverage();
        beverage3.setName("Vodka");
        beverage3.setQuantity(vod);
        beverage3.setVol(Save.vol);

        Mineral mineral = new Mineral();                                    //Loob uue mineraali
        mineral.setName("Cola");
        mineral.setQuantity(min);
        Mineral mineral2 = new Mineral();
        mineral2.setName("Tonic");
        mineral2.setQuantity(ton);
        Mineral mineral3 = new Mineral();
        mineral3.setName("Cranberry juice");
        mineral3.setQuantity(cjui);

        Recipe recipe = new Recipe();                                       //Loob uue receipe ja määrab väärtused
        recipe.setName(name);
        recipe.setBev1(beverage);
        recipe.setBev2(beverage2);
        recipe.setBev3(beverage3);
        recipe.setMin1(mineral);
        recipe.setMin2(mineral2);
        recipe.setMin3(mineral3);

        Save.myRecipes.add(recipe);
    }

    public static double getMineral(String minname) {                           //Annab mineraali koguse
        double quantity = 0;
        int min = Save.myMinerals.size();
        if (min > 0) {
            for (int i = 0; i < min; i++) {
                if (Save.myMinerals.get(i).getName().equals(minname)) {         //Otsib niikaua kui leiab vastava nime ja sealt võtab koguse
                    quantity = Save.myMinerals.get(i).getQuantity();
                }
            }
        }
        return quantity;
    }

    public static double getBeverage(String bevname) {                          //Annab beverage koguse
        double quantity = 0;
        int bev = Save.myBeverages.size();
        if (bev > 0) {
            for (int i = 0; i < bev; i++) {
                if (Save.myBeverages.get(i).getName().equals(bevname)) {        //Otsib niikaua kui leiab vastava nime ja sealt võtab koguse
                    quantity = Save.myBeverages.get(i).getQuantity();
                }
            }
        }
        return quantity;
    }

    public static void addBev(String bevname, Double bevquantity) {             //Esmalt kustutab eelnevalt lisatud samanimelise beverage omadused kui sellenimeline asi juba oemas on ja siis lisab uued väärtused beveragele
        int bev = Save.myBeverages.size();
        if (bev > 0) {
            for (int i = 0; i < bev; i++) {
                if (Save.myBeverages.get(i).getName().equals(bevname)) {
                    Save.myBeverages.remove(i);
                }
            }
        }
        double bevvol = Save.vol;
        Beverage b = new Beverage();
        b.setName(bevname);
        b.setQuantity(bevquantity);
        b.setVol(bevvol);
        Save.myBeverages.add(b);
    }

    public static void addMin(String minname, Double minquantity) {             //Esmalt kustutab eelnevalt lisatud samanimelise beverage omadused kui sellenimeline asi juba oemas on ja siis lisab uued väärtused beveragele
        int min = Save.myMinerals.size();
        if (min > 0) {
            for (int i = 0; i < min; i++) {
                if (Save.myMinerals.get(i).getName().equals(minname)) {
                    Save.myMinerals.remove(i);
                }
            }
        }
        Mineral m = new Mineral();
        m.setName(minname);
        m.setQuantity(minquantity);
        Save.myMinerals.add(m);
    }
}
