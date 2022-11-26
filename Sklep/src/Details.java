
import java.io.FileInputStream;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Details extends Application {

	public void start(Stage primaryStage, Products x) throws Exception {
	 Button button1 = new Button("Dodaj do koszyka");
	 Button button2 = new Button("Powrót");
		
		Image photo = new Image(
				new FileInputStream("C:\\Users\\Anna\\Desktop\\projekt jp wersja2\\pliki\\" + x.getName() + ".jpg"));
		ImageView picture = new ImageView(photo);
		picture.setFitHeight(200);
		picture.setFitWidth(250);
		picture.setPreserveRatio(true);

		primaryStage.setTitle(x.getName());
		Lists help = new Lists();

		Label text2 = new Label();
		Label text1 = new Label(x.toString());
		text1.setFont(Font.font("Calibra", FontWeight.EXTRA_LIGHT, 20));
		text1.setPrefWidth(800);
		text1.setWrapText(true);

		button1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent a) {
				YourBacket one = new YourBacket(x.getName());
				help.Save(one);
				text2.setTextFill(Color.RED);
				text2.setText("Dodano");
			}
		});

		button2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent a) {
				ProductsList products = new ProductsList();

				try {
					products.start(primaryStage);
				} catch (Exception e) {

					e.printStackTrace();
				}
			}
		});

		HBox hBox = new HBox();
		hBox.setSpacing(10);

		hBox.getChildren().add(button1);
		hBox.getChildren().add(button2);
		VBox vBox = new VBox();

		vBox.setSpacing(10);
		vBox.getChildren().add(text1);
		vBox.getChildren().add(picture);
		vBox.getChildren().add(hBox);
		vBox.getChildren().add(text2);

		vBox.setAlignment(Pos.CENTER);
		hBox.setAlignment(Pos.CENTER);

		Scene scene = new Scene(vBox, 900, 700);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub

	}

}
