import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by Sander on 12/29/2016.
 */
public class Stages {
    public static void addInv() {
        Stage window = new Stage();
        window.setTitle("Add Inventory");
        window.initModality(Modality.APPLICATION_MODAL);                //Uue aknaga peab enne tegelema
        GridPane pane = new GridPane();
        Scene adds = new Scene(pane);

        Label label = new Label("Beverages");
        pane.add(label, 3, 0);
        Label label2 = new Label("Minerals");
        pane.add(label2, 0, 0);
        Label label3 = new Label("Coca-Cola");
        pane.add(label3, 0, 1);
        Label label4 = new Label("Rum");
        pane.add(label4, 3, 1);
        Label label5 = new Label("Quantity");
        pane.add(label5, 1, 0);
        Label label6 = new Label("Quantity");
        pane.add(label6, 4, 0);
        Label label7 = new Label("Tonic");
        pane.add(label7, 0, 2);
        Label label8 = new Label("Cranberry juice");
        pane.add(label8, 0, 3);
        Label label9 = new Label("Gin");
        pane.add(label9, 3, 2);
        Label label10 = new Label("Vodka");
        pane.add(label10, 3, 3);

        Button submit = new Button("Submit");
        pane.add(submit, 4, 4);

        TextField cola = new TextField();
        pane.add(cola, 1, 1);
        cola.setPrefWidth(20);
        cola.setText("0");
        TextField rum = new TextField();
        pane.add(rum, 4, 1);
        rum.setPrefWidth(20);
        rum.setText("0");
        TextField tonic = new TextField();
        pane.add(tonic, 1, 2);
        tonic.setPrefWidth(20);
        tonic.setText("0");
        TextField cjuice = new TextField();
        pane.add(cjuice, 1, 3);
        cjuice.setPrefWidth(20);
        cjuice.setText("0");
        TextField gin = new TextField();
        pane.add(gin, 4, 2);
        gin.setPrefWidth(20);
        gin.setText("0");
        TextField vodka = new TextField();
        pane.add(vodka, 4, 3);
        vodka.setPrefWidth(20);
        vodka.setText("0");

        submit.setOnAction(event -> {
            Save.myMinerals.clear();
            Save.myBeverages.clear();
            Methods.addBev("Rum", Double.valueOf(rum.getText()));
            Methods.addMin("Cola", Double.valueOf(cola.getText()));
            Methods.addBev("Gin", Double.valueOf(gin.getText()));
            Methods.addMin("Tonic", Double.valueOf(tonic.getText()));
            Methods.addBev("Vodka", Double.valueOf(vodka.getText()));
            Methods.addMin("Cranberry juice", Double.valueOf(cjuice.getText()));
            window.close();
        });
        pane.setHgap(50);
        pane.setVgap(20);

        window.setScene(adds);
        window.show();
    }

    public static void viewInv() {

        Stage window = new Stage();
        window.setTitle("Viev Inventory");
        window.initModality(Modality.APPLICATION_MODAL);
        GridPane pane = new GridPane();
        Scene views = new Scene(pane);

        Label label = new Label("Beverages");
        pane.add(label, 3, 0);
        Label label2 = new Label("Minerals");
        pane.add(label2, 0, 0);
        Label label5 = new Label("Quantity");
        pane.add(label5, 1, 0);
        Label label6 = new Label("Quantity");
        pane.add(label6, 4, 0);

        Label label3 = new Label("Coca-Cola");
        pane.add(label3, 0, 1);
        Label label4 = new Label("Rum");
        pane.add(label4, 3, 1);
        Label label7 = new Label("Tonic");
        pane.add(label7, 0, 2);
        Label label8 = new Label("Cranberry juice");
        pane.add(label8, 0, 3);
        Label label9 = new Label("Gin");
        pane.add(label9, 3, 2);
        Label label10 = new Label("Vodka");
        pane.add(label10, 3, 3);

        Button exit = new Button("Exit");
        pane.add(exit, 4, 4);

        Label cola = new Label(String.valueOf(Methods.getMineral("Cola")));
        pane.add(cola, 1, 1);
        Label tonic = new Label(String.valueOf(Methods.getMineral("Tonic")));
        pane.add(tonic, 1, 2);
        Label cjuice = new Label(String.valueOf(Methods.getMineral("Cranberry juice")));
        pane.add(cjuice, 1, 3);

        Label rum = new Label(String.valueOf(Methods.getBeverage("Rum")));
        pane.add(rum, 4, 1);
        Label gin = new Label(String.valueOf(Methods.getBeverage("Gin")));
        pane.add(gin, 4, 2);
        Label vodka = new Label(String.valueOf(Methods.getBeverage("Vodka")));
        pane.add(vodka, 4, 3);

        exit.setOnAction(event -> {
            window.close();
        });

        pane.setHgap(50);
        pane.setVgap(20);

        window.setScene(views);
        window.show();
    }

    public static void addRec() {
        Stage window = new Stage();
        window.setTitle("Add Recipe");
        window.initModality(Modality.APPLICATION_MODAL);
        GridPane pane = new GridPane();
        Scene adds = new Scene(pane);

        Label label = new Label("Beverages");
        pane.add(label, 3, 0);
        Label label2 = new Label("Minerals");
        pane.add(label2, 0, 0);
        Label label5 = new Label("Quantity");
        pane.add(label5, 1, 0);
        Label label6 = new Label("Quantity");
        pane.add(label6, 4, 0);
        Label label7 = new Label("Recipe name");
        pane.add(label7, 0, 4);

        Label label3 = new Label("Coca-Cola");
        pane.add(label3, 0, 1);
        Label label4 = new Label("Rum");
        pane.add(label4, 3, 1);
        Label label8 = new Label("Tonic");
        pane.add(label8, 0, 2);
        Label label9 = new Label("Cranberry juice");
        pane.add(label9, 0, 3);
        Label label10 = new Label("Gin");
        pane.add(label10, 3, 2);
        Label label11 = new Label("Vodka");
        pane.add(label11, 3, 3);

        Button submit = new Button("Submit");
        pane.add(submit, 4, 4);

        TextField cola = new TextField();
        pane.add(cola, 1, 1);
        cola.setPrefWidth(20);
        cola.setText("0");
        TextField rum = new TextField();
        pane.add(rum, 4, 1);
        rum.setPrefWidth(20);
        rum.setText("0");
        TextField tonic = new TextField();
        pane.add(tonic, 1, 2);
        tonic.setPrefWidth(20);
        tonic.setText("0");
        TextField cjuice = new TextField();
        pane.add(cjuice, 1, 3);
        cjuice.setPrefWidth(20);
        cjuice.setText("0");
        TextField gin = new TextField();
        pane.add(gin, 4, 2);
        gin.setPrefWidth(20);
        gin.setText("0");
        TextField vodka = new TextField();
        pane.add(vodka, 4, 3);
        vodka.setPrefWidth(20);
        vodka.setText("0");

        TextField rename = new TextField();
        rename.setPromptText("Name");
        pane.add(rename, 1, 4);
        rename.setPrefWidth(35);

        submit.setOnAction(event -> {                           //Submit nupp võtab rename lahtrist nime, jookide kogused vastavatest lahtritest
            Methods.addRec(rename.getText(), Double.valueOf(rum.getText()), Double.valueOf(cola.getText()), Double.valueOf(gin.getText()), Double.valueOf(tonic.getText()), Double.valueOf(vodka.getText()), Double.valueOf(cjuice.getText()));
            window.close();
        });
        pane.setHgap(50);
        pane.setVgap(20);

        window.setScene(adds);
        window.show();
    }

    public static void viewRec() {
        Stage window = new Stage();
        window.setTitle("View Recipe");
        window.initModality(Modality.APPLICATION_MODAL);
        GridPane pane = new GridPane();
        //pane.setGridLinesVisible(true);
        Scene views = new Scene(pane);

        Label label = new Label("Name");
        pane.add(label, 0, 0);
        Label label2 = new Label("Ingredients");
        pane.add(label2, 1, 0);
        Label label3 = new Label("Vol %");
        pane.add(label3, 2, 0);
        Label label4 = new Label("x250 ml");
        pane.add(label4, 3, 0);
        Button exit = new Button("Exit");
        pane.add(exit, 3, Save.myRecipes.size() + 2);

        String[] name = new String[Save.myRecipes.size()];
        String[] ing = new String[Save.myRecipes.size()];
        Double[] vol = new Double[Save.myRecipes.size()];
        Double[] glass = new Double[Save.myRecipes.size()];

        for (int i = 0; i < Save.myRecipes.size(); i++) {
            name[i] = Save.myRecipes.get(i).getName();
            vol[i] = 0.0;
            double qbev1 = Save.myRecipes.get(i).getBev1().getQuantity();
            double qbev2 = Save.myRecipes.get(i).getBev2().getQuantity();
            double qbev3 = Save.myRecipes.get(i).getBev3().getQuantity();

            pane.add(new Label(name[i]), 0, i + 1);
                                                                                                                                    //Näitab koostisosade suhet
            ing[i] = Save.myRecipes.get(i).getBev1().getName() + "-" + Save.myRecipes.get(i).getBev1().getQuantity() + "L, "
                    + Save.myRecipes.get(i).getMin1().getName() + "-" + Save.myRecipes.get(i).getMin1().getQuantity() + "L, " +
                    Save.myRecipes.get(i).getBev2().getName() + "-" + Save.myRecipes.get(i).getBev2().getQuantity() + "L, "
                    + Save.myRecipes.get(i).getMin2().getName() + "-" + Save.myRecipes.get(i).getMin2().getQuantity() + "L, " +
                    Save.myRecipes.get(i).getBev3().getName() + "-" + Save.myRecipes.get(i).getBev3().getQuantity() + "L, "
                    + Save.myRecipes.get(i).getMin3().getName() + "-" + Save.myRecipes.get(i).getMin3().getQuantity() + "L, ";
            pane.add(new Label(ing[i]), 1, i + 1);

            if (qbev1 > 0) {
                vol[i] = (Save.myRecipes.get(i).getBev1().getQuantity() * (Save.vol * 0.01)) /                                          //Arvutab kokteili kanguse
                        (Save.myRecipes.get(i).getMin1().getQuantity() + (Save.myRecipes.get(i).getBev1().getQuantity())) * 100;
            }
            if (qbev2 > 0) {
                vol[i] = (Save.myRecipes.get(i).getBev2().getQuantity() * (Save.vol * 0.01)) /
                        (Save.myRecipes.get(i).getMin2().getQuantity() + (Save.myRecipes.get(i).getBev2().getQuantity())) * 100;
            }
            if (qbev3 > 0) {
                vol[i] = (Save.myRecipes.get(i).getBev3().getQuantity() * (Save.vol * 0.01)) /
                        (Save.myRecipes.get(i).getMin3().getQuantity() + (Save.myRecipes.get(i).getBev3().getQuantity())) * 100;
            }

            pane.add(new Label(String.valueOf((Math.round(vol[i])))), 2, i + 1);

            glass[i] = Methods.calc(Save.myRecipes.get(i));
            pane.add(new Label(String.valueOf((Math.round(glass[i])))), 3, i + 1);
        }
        exit.setOnAction(event -> {
            window.close();
        });
        pane.setHgap(50);
        pane.setVgap(20);
        window.setScene(views);
        window.show();
    }
}
