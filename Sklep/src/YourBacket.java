import java.io.File;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class YourBacket extends Application {
	
	private String products;

	public YourBacket(String products) {
		super();
		this.products = products;
	}

	@Override
	public String toString() {
		return products;
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		 Button button1 = new Button("Kup zawartoœæ koszyka");
		 Button button2 = new Button("Powrót");
		 Button button0 = new Button("Zrezygnuj z zakupów i wyjdz");
		
		primaryStage.setTitle("Koszyk");
		Lists help = new Lists();
		
		Label text0= new Label("Zawartoœæ koszyka: ");
		Label text1 = new Label(help.read("C:\\Users\\Anna\\Desktop\\projekt jp wersja2\\pliki\\Koszyk.txt"));
		text0.setFont(Font.font("Calibra", FontWeight.BOLD,35));
		text1.setFont(Font.font("Calibra", FontWeight.EXTRA_LIGHT, 25));
		text1.setPrefWidth(800);
		text1.setWrapText(true);

		button1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent a) {
				Login login = new Login();
				Transactions transaction = new Transactions(login.getUsername(), help.read("C:\\Users\\Anna\\Desktop\\projekt jp wersja2\\pliki\\Koszyk.txt"));
				help.Save(transaction);
				Thanks thanks = new Thanks();
				try {
					thanks.start(primaryStage);
				} catch (Exception e) {
					e.printStackTrace();
				}
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

		button0.setOnAction(new EventHandler<ActionEvent>() {
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

		HBox hBox = new HBox();
		hBox.setSpacing(10);

		hBox.getChildren().add(button1);
		button1.setStyle("-fx-font: 17 arial; -fx-base: #b6e7c9;");
		hBox.getChildren().add(button2);
		hBox.getChildren().add(button0);
		VBox vBox = new VBox();
		vBox.setSpacing(10);
		vBox.getChildren().add(text0);
		vBox.getChildren().add(text1);
		vBox.getChildren().add(hBox);
		//vBox.getChildren().add(button0);
		
		Scene scene = new Scene(vBox, 900, 700);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
