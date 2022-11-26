
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login extends Application {

	private static TextField username = new TextField();
	private TextField password = new TextField();
	private Button button1 = new Button("Zaloguj");
	private Button button2 = new Button("Powrót");
	final Text action = new Text();
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Logowanie do sklepu");
		Text text1 = new Text("Logowanie:");
		text1.setFont(Font.font("Calibra", FontWeight.BOLD, 30));
		
		button1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent a) {
				Lists list = new Lists();
				for (int i = 0; i < list.loginList().size(); i++) {
					if (getUsername().equals(list.loginList().get(i))) {
						if (getPassword().equals(list.passwordList().get(i))) {
							ProductsList productsList = new ProductsList();

							try {
								productsList.start(stage);
							} catch (Exception e) {
								e.printStackTrace();
							}
							
						}
					}
				}
				action.setFill(Color.RED);
		        action.setText("Spróbuj jeszcze raz");
			}

		});

		button2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent a) {
				Start start = new Start();
				try {
					start.start(stage);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		VBox vBox = new VBox();
		vBox.setSpacing(8);

		Label label1 = new Label("Wpisz login:");
		label1.setFont(Font.font("Calibra", FontWeight.EXTRA_LIGHT, 20));
		Label label2 = new Label("Wpisz has³o:");
		label2.setFont(Font.font("Calibra", FontWeight.EXTRA_LIGHT, 20));

		vBox.getChildren().add(text1);
		vBox.getChildren().add(label1);
		vBox.getChildren().add(username);
		username.setMaxSize(300, 30);
		vBox.getChildren().add(label2);
		vBox.getChildren().add(password);
		password.setMaxSize(300, 30);
		

		HBox hBox = new HBox();
		hBox.setSpacing(10);

		hBox.getChildren().add(button1);
		hBox.getChildren().add(button2);
		vBox.getChildren().add(hBox);
		vBox.getChildren().add(action);
		vBox.setAlignment(Pos.CENTER);
		hBox.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(vBox, 900, 700);
		stage.setScene(scene);
		stage.show();

	}

	public final String getUsername() {
		String stringUsername = username.getText();
		return stringUsername;
	}

	public String getPassword() {
		String stringPassword = password.getText();
		return stringPassword;
	}

}
