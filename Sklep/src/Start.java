import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Start extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Sklep internetowy");
		Button button1 = new Button("Zaloguj siê");
		Button button2 = new Button("Zarejestruj siê");
		Text text1 = new Text("Witamy w sklepie internetowym!");
		text1.setFont(Font.font("Calibra", FontWeight.LIGHT, 40));

		button1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
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
			public void handle(ActionEvent event) {
				MakeAccount make = new MakeAccount();

				try {
					make.start(primaryStage);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		HBox hBox = new HBox();
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);

		hBox.getChildren().add(button2);
		hBox.getChildren().add(button1);

		VBox vBox = new VBox();
		vBox.setSpacing(10);

		vBox.getChildren().add(text1);
		vBox.getChildren().add(hBox);
		vBox.setAlignment(Pos.CENTER);

		Scene scene = new Scene(vBox, 900, 700);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
