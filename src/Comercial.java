import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.swing.JOptionPane;
import java.awt.*;


public class Comercial extends Application {
    private AnchorPane pane;
    private Scene scene;
    private Button btnOk;
    private TextField teste, teste2;


    private void initComponents() {
        btnOk = new Button("Ok");
        teste = new TextField("Texto");
        teste2 = new TextField();
    }

    @Override
    public void start(Stage stage) throws Exception {
        pane = new AnchorPane();
        scene = new Scene(pane, 600, 400);
        initComponents();

      /*
       * Lambda e usado quando existem interfaces funcionais ( interfaces que
       * so tem um unico metodo no seu corpo) onde com a utilizao de lambdas pode
       * deixar a programacao mais funcional diminuindo o numero de linhas de codigo
       * desnecessarias.
       */

       /* btnOk.setOnAction(event -> JOptionPane.showInputDialog(
                null,"Valores Inseridos", "OK",
                JOptionPane.INFORMATION_MESSAGE));*/

        btnOk.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                JOptionPane.showMessageDialog(null, "Valores Inseridos", "OK",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        pane.getChildren().addAll(btnOk);
        stage.setScene(scene);
        stage.setTitle("Tela Comercial");
        stage.show();

        initLayout();

    }

    private void initLayout() {
        btnOk.setLayoutX(500);
        btnOk.setLayoutY(100);
        teste.setLocation(250, 250);
        teste.setBackground(Color.red);
    }
}

