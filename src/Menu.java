import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Menu extends Application{

	private AnchorPane pane;
	private Scene scene;
	private Button btnAgenda, btnComercial, btnFinanceiro, btnCadastro, btnLogout;
	
	private void initComponents(){
		
		btnAgenda = new Button("Agenda");
		btnComercial = new Button("Comercial");
		btnFinanceiro = new Button("Financeiro");
		btnCadastro = new Button("Cadastro");
		btnLogout = new Button("Logout");
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		pane = new AnchorPane();
		scene = new Scene(pane, 600, 400);
		initComponents();
		
		btnAgenda.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "VAI PARA AGENDA", "Agenda",
						JOptionPane.INFORMATION_MESSAGE);
				/*if(txtUser.getText().equals("admin")&& (txtPassword.getText().equals("admin"))) {
					JOptionPane.showMessageDialog(null, "Usuario Autenticado", "Autenticacao",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Usuario nao Autenticado", "Autenticacao",
							JOptionPane.ERROR_MESSAGE);
				}*/
			}
		});
		
		btnComercial.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "VAI PARA Comercial", "Comercial",
						JOptionPane.INFORMATION_MESSAGE);
				/*if(txtUser.getText().equals("admin")&& (txtPassword.getText().equals("admin"))) {
					JOptionPane.showMessageDialog(null, "Usuario Autenticado", "Autenticacao",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Usuario nao Autenticado", "Autenticacao",
							JOptionPane.ERROR_MESSAGE);
				}*/
			}
		});
		
		btnFinanceiro.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "VAI PARA Financeiro", "Financeiro",
						JOptionPane.INFORMATION_MESSAGE);
				/*if(txtUser.getText().equals("admin")&& (txtPassword.getText().equals("admin"))) {
					JOptionPane.showMessageDialog(null, "Usuario Autenticado", "Autenticacao",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Usuario nao Autenticado", "Autenticacao",
							JOptionPane.ERROR_MESSAGE);
				}*/
			}
		});
		
		btnCadastro.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "VAI PARA Cadastro", "Cadastro",
						JOptionPane.INFORMATION_MESSAGE);
				/*if(txtUser.getText().equals("admin")&& (txtPassword.getText().equals("admin"))) {
					JOptionPane.showMessageDialog(null, "Usuario Autenticado", "Autenticacao",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Usuario nao Autenticado", "Autenticacao",
							JOptionPane.ERROR_MESSAGE);
				}*/
			}
		});
		
		btnLogout.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0) {
				System.exit(0);
				
			}
			
		});
		
		pane.getChildren().addAll(btnAgenda, btnComercial, btnFinanceiro, btnCadastro, btnLogout);
		stage.setScene(scene);
		stage.setTitle("Tela de Menu");
		stage.show();

		initLayout();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	private void initLayout() {
		
		btnAgenda.setLayoutX((pane.getWidth()	-	btnAgenda.getWidth()) / 2);
		btnAgenda.setLayoutY(40);
		
		btnComercial.setLayoutX((pane.getWidth()	-	btnComercial.getWidth()) / 2);
		btnComercial.setLayoutY(40);
		
		btnFinanceiro.setLayoutX((pane.getWidth()	-	btnFinanceiro.getWidth()) / 2);
		btnFinanceiro.setLayoutY(100);
		
		btnCadastro.setLayoutX((pane.getWidth()	-	btnCadastro.getWidth()) / 2);
		btnCadastro.setLayoutY(100);
		
		btnLogout.setLayoutX((pane.getWidth()	-	btnLogout.getWidth()) / 2);
		btnLogout.setLayoutY(200);
	}

}
