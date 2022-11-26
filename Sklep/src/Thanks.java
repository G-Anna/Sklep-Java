import java.io.File;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Thanks extends Application {

	

	@Override
	public void start(Stage primaryStage) throws Exception {
	    Button button1 = new Button("Powrót do zakupów");
	    Button button2 = new Button("Wyjdz");
		
		primaryStage.setTitle("Dziêkujemy");
		Label text1 = new Label("Dziêkujemy za dokonanie u nas zakupów!");
		text1.setFont(Font.font("Calibra", FontWeight.EXTRA_LIGHT, 40));

		HBox hBox = new HBox();
		hBox.setSpacing(8);

		hBox.getChildren().add(button1);
		hBox.getChildren().add(button2);
		hBox.setAlignment(Pos.CENTER);
		
		VBox vBox = new VBox();
		vBox.setSpacing(8);

		vBox.getChildren().add(text1);
		vBox.getChildren().add(hBox);

		button2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try {
					File file = new File("C:\\Users\\Anna\\Desktop\\projekt jp wersja2\\pliki\\Koszyk.txt");
					file.delete();

				} catch (Exception e) {
					e.printStackTrace();
				}
				Platform.exit();
			}
		});

		button1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try {
					File file = new File("C:\\Users\\Anna\\Desktop\\projekt jp wersja2\\pliki\\Koszyk.txt");
					file.delete();

				} catch (Exception e) {
					e.printStackTrace();
				}

				ProductsList list = new ProductsList();
				try {
					list.start(primaryStage);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		vBox.setAlignment(Pos.CENTER);
		Scene scene = new Scene(vBox, 900, 700);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
