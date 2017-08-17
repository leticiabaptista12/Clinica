import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Login  extends Application{

	private AnchorPane pane;
	private Scene scene;
	private Label lblUser, lblPassword;
	private TextField txtUser;
	private PasswordField txtPassword;
	private Button btnLogin, btnExit;
	
	private void initComponents(){
		lblUser = new Label("Usuario");
		lblPassword = new Label("Senha");
		
		txtUser = new TextField();
		txtPassword = new PasswordField();
		
		lblUser.setFont(new Font(18));
		lblPassword.setFont(new Font(18));
		
		txtUser.setPromptText("Digite aqui seu login...");
		txtPassword.setPromptText("Digite aqui sua senha...");
		
		btnLogin = new Button("Entrar");
		btnExit = new Button("Sair");
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		pane = new AnchorPane();
		scene = new Scene(pane, 600, 400);
		initComponents();
		
		btnLogin.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0) {
				if(txtUser.getText().equals("admin")&& (txtPassword.getText().equals("admin"))) {
					JOptionPane.showMessageDialog(null, "Usuario Autenticado", "Autenticacao",
							JOptionPane.INFORMATION_MESSAGE);
					
					
				} else {
					JOptionPane.showMessageDialog(null, "Usuario nao Autenticado", "Autenticacao",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		btnExit.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0) {
				System.exit(0);
				
			}
			
		});
		
		pane.getChildren().addAll(lblUser, lblPassword, txtUser, txtPassword, btnLogin, btnExit);
		stage.setScene(scene);
		stage.setTitle("Tela de Login");
		stage.show();
		
		initLayout();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	private void initLayout() {
		
		lblUser.setLayoutX((pane.getWidth()	-	lblUser.getWidth()) / 2);
		lblUser.setLayoutY(40);
		
		txtUser.setLayoutX((pane.getWidth()	-	txtUser.getWidth()) / 2);
		txtUser.setLayoutY(80);
		
		lblPassword.setLayoutX((pane.getWidth()	-	lblPassword.getWidth()) / 2);
		lblPassword.setLayoutY(120);
		
		txtPassword.setLayoutX((pane.getWidth()	-	txtPassword.getWidth()) / 2);
		txtPassword.setLayoutY(160);
		
		btnLogin.setLayoutX((pane.getWidth()	-	btnLogin.getWidth()) / 2);
		btnLogin.setLayoutY(220);
		
		btnExit.setLayoutX((pane.getWidth()	-	btnExit.getWidth()) / 2);
		btnExit.setLayoutY(250);
	}
}
