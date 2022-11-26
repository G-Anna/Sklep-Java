import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ProductsList extends Application {

	private Button button00 = new Button("Wyjdz ze sklepu");
	private Button button0 = new Button("Wyœwietl koszyk");
	private Button button1 = new Button("Puzzle",pic("Puzzle"));
	private Button button2 = new Button("Lalka", pic("Lalka"));
	private Button button3 = new Button("Pilka",pic("Pilka"));
	private Button button4 = new Button("Miœ",pic("Miœ"));
	private Button button5 = new Button("Lego",pic("Lego"));
	private Button button6 = new Button("Szachy",pic("Szachy"));
	private Button button7 = new Button("Karty",pic("Karty"));
	private Button button8 = new Button("Kolorowanki",pic("Kolorowanki"));
	private Button button9 = new Button("Klocki",pic("Klocki"));
	private Button button10 = new Button("Resoraki",pic("Resoraki"));

	public ImageView pic(String x) {
		FileInputStream file=null;
		try {
			file = new FileInputStream("C:\\Users\\Anna\\Desktop\\projekt jp wersja2\\pliki\\"+x+".jpg");
		} catch (FileNotFoundException e) {
			
		}
		Image photo=new Image(file);
		ImageView picture = new ImageView(photo);
		picture.setFitHeight(60); 
	    picture.setFitWidth(45);
		return picture;
		
	}
	@Override
	public void start(Stage stage) throws Exception {
		
		Lists help = new Lists();
		Details detail = new Details();
		stage.setTitle("Sklep internetowy");

		TilePane tilePane=new TilePane(Orientation.VERTICAL);
		VBox vBox = new VBox();
		vBox.setSpacing(10);
		
		
		Label label1 = new Label("Produkty:");
		label1.setFont(Font.font("Calibra", FontWeight.EXTRA_LIGHT, 35));
		
		vBox.getChildren().add(label1);

		tilePane.getChildren().add(button1);
		button1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Products Puzzle = new Products("Puzzle", 20.,
						help.read("C:\\Users\\Anna\\Desktop\\projekt jp wersja2\\pliki\\Puzzle.txt"));
				try {
					detail.start(stage, Puzzle);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		tilePane.getChildren().add(button2);
		button2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Products Lalka = new Products("Lalka", 40.,
						help.read("C:\\Users\\Anna\\Desktop\\projekt jp wersja2\\pliki\\Lalka.txt"));
				try {
					detail.start(stage, Lalka);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		tilePane.getChildren().add(button3);
		button3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Products Pilka = new Products("Pilka", 60.,
						help.read("C:\\Users\\Anna\\Desktop\\projekt jp wersja2\\pliki\\Pilka.txt"));
				try {
					detail.start(stage, Pilka);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		tilePane.getChildren().add(button4);
		button4.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Products Mis = new Products("Miœ", 25.,
						help.read("C:\\Users\\Anna\\Desktop\\projekt jp wersja2\\pliki\\Miœ.txt"));
				try {
					detail.start(stage, Mis);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		tilePane.getChildren().add(button5);
		button5.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Products Lego = new Products("Lego", 120.,
						help.read("C:\\Users\\Anna\\Desktop\\projekt jp wersja2\\pliki\\Lego.txt"));
				try {
					detail.start(stage, Lego);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		tilePane.getChildren().add(button6);
		button6.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Products Szachy = new Products("Szachy", 50.,
						help.read("C:\\Users\\Anna\\Desktop\\projekt jp wersja2\\pliki\\Szachy.txt"));
				try {
					detail.start(stage, Szachy);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		tilePane.getChildren().add(button7);
		button7.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Products Karty = new Products("Karty", 8.,
						help.read("C:\\Users\\Anna\\Desktop\\projekt jp wersja2\\pliki\\Karty.txt"));
				try {
					detail.start(stage, Karty);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		tilePane.getChildren().add(button8);
		button8.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Products Kolorowanki = new Products("Kolorowanki", 20.,
						help.read("C:\\Users\\Anna\\Desktop\\projekt jp wersja2\\pliki\\Kolorowanki.txt"));
				try {
					detail.start(stage, Kolorowanki);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		tilePane.getChildren().add(button9);
		button9.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Products Klocki = new Products("Klocki", 70.,
						help.read("C:\\Users\\Anna\\Desktop\\projekt jp wersja2\\pliki\\Klocki.txt"));
				try {
					detail.start(stage, Klocki);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		tilePane.getChildren().add(button10);
		button10.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Products Resoraki = new Products("Resoraki", 20.,
						help.read("C:\\Users\\Anna\\Desktop\\projekt jp wersja2\\pliki\\Resoraki.txt"));
				try {
					detail.start(stage, Resoraki);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		vBox.getChildren().add(tilePane);
		
		vBox.getChildren().add(button0);
		button0.setStyle("-fx-font: 17 arial; -fx-base: #b6e7c9;");
		button0.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				YourBacket backet = new YourBacket("wszystko");
				try {
					backet.start(stage);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
		
		vBox.getChildren().add(button00);
		button00.setOnAction(new EventHandler<ActionEvent>() {
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

		
		
	
		button1.setPrefWidth(200);
		button2.setPrefWidth(200);
		button3.setPrefWidth(200);
		button4.setPrefWidth(200);
		button5.setPrefWidth(200);
		button6.setPrefWidth(200);
		button7.setPrefWidth(200);
		button8.setPrefWidth(200);
		button9.setPrefWidth(200);
		button10.setPrefWidth(200);
		
		tilePane.setAlignment(Pos.CENTER);
		vBox.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(vBox, 900, 700);
		stage.setScene(scene);
		stage.show();

	}

}
