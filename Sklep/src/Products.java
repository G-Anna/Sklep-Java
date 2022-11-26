
public class Products {

	private String name;
	private Double price;
	private String description;

	public Products(String name, Double price, String description) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {

		return "Nazwa produktu: " + name + "\r\n" + "Cena: " + price + " z³" + "\r\n" + "Opis: " + description;
	}

}
