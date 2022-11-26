import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MakeAccount extends Application {

	private TextField username = new TextField();
	private TextField password = new TextField();
	private TextField name = new TextField();
	private TextField surname = new TextField();
	private Button button1 = new Button("Zapisz");
	private Button button2 = new Button("Powrót");

	public static void main(String[] args) {
		launch(args);
	}

	public String getUsername() {
		String stringUsername = username.getText();
		return stringUsername;
	}

	public String getPassword() {
		String stringPassword = password.getText();
		return stringPassword;
	}

	public String getName() {
		String stringName = name.getText();
		return stringName;
	}

	public String getSurname() {
		String stringSurname = surname.getText();
		return stringSurname;
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle("Rejestracja:");
		Text text1 = new Text("Zarejestruj siê:");
		text1.setFont(Font.font("Calibra", FontWeight.BOLD, 30));

		button1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent a) {
				Lists help = new Lists();
				Customer m = new Customer(getName(), getSurname(), getUsername(), getPassword());
				help.Save(m);
				Login login = new Login();

				try {
					login.start(primaryStage);
				} catch (Exception e) {

					e.printStackTrace();
				}

			}
		});

		button2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent a) {
				Start start = new Start();

				try {
					start.start(primaryStage);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		VBox vBox = new VBox();
		vBox.setPadding(new Insets(10));
		vBox.setSpacing(8);

		Label label1 = new Label("Wpisz login:");
		label1.setFont(Font.font("Calibra", FontWeight.EXTRA_LIGHT, 20));
		Label label2 = new Label("Wpisz has³o:");
		label2.setFont(Font.font("Calibra", FontWeight.EXTRA_LIGHT, 20));
		Label label3 = new Label("Wpisz imie:");
		label3.setFont(Font.font("Calibra", FontWeight.EXTRA_LIGHT, 20));
		Label label4 = new Label("Wpisz nazwisko:");
		label4.setFont(Font.font("Calibra", FontWeight.EXTRA_LIGHT, 20));

		vBox.getChildren().add(text1);
		vBox.getChildren().add(label1);
		vBox.getChildren().add(username);
		username.setMaxSize(300,30);
		vBox.getChildren().add(label2);
		vBox.getChildren().add(password);
		password.setMaxSize(300, 30);
		vBox.getChildren().add(label3);
		vBox.getChildren().add(name);
		name.setMaxSize(300, 30);
		vBox.getChildren().add(label4);
		vBox.getChildren().add(surname);
		surname.setMaxSize(300, 30);

		HBox hBox = new HBox();
		hBox.setSpacing(10);

		hBox.getChildren().add(button1);
		hBox.getChildren().add(button2);
		vBox.getChildren().add(hBox);
		vBox.setAlignment(Pos.CENTER);
		hBox.setAlignment(Pos.CENTER);

		Scene scene = new Scene(vBox, 900, 700);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
