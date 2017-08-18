import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.swing.*;

public class Financeiro extends Application {

    private AnchorPane pane;
    private Scene scene;
    private Button btnDespesas, btnFluxoDeCaixa, btnVoltar;

    private void initComponents() {
        btnDespesas = new Button("Despesas");
        btnFluxoDeCaixa = new Button("Fluxo de Caixa");
        btnVoltar = new Button("Voltar");
    }

    @Override
    public void start(Stage stage) throws Exception {
        pane = new AnchorPane();
        scene = new Scene(pane, 600, 400);
        initComponents();

        btnDespesas.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                JOptionPane.showMessageDialog(null, "VAI para DESPESAS", "Despesas",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        btnFluxoDeCaixa.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {


                JOptionPane.showMessageDialog(null, "VAI para FLUXO DE CAIXA", "Fluxo de Caixa",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        btnVoltar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                JOptionPane.showMessageDialog(null, "VOLTA para tela anterior", "Voltar",
                        JOptionPane.WARNING_MESSAGE);
            }
        });

        pane.getChildren().addAll(btnDespesas, btnFluxoDeCaixa, btnVoltar);
        stage.setScene(scene);
        stage.setTitle("Tela Financeira");
        stage.show();

        initLayout();
    }

    private void initLayout() {

        btnDespesas.setLayoutX(80);
        btnDespesas.setLayoutY(50);

        btnFluxoDeCaixa.setLayoutX(80);
        btnFluxoDeCaixa.setLayoutY(100);

        btnVoltar.setLayoutX(500);
        btnVoltar.setLayoutY(350);
    }

    public static void main(String[] args) {
        launch(args);
    }

}
