
public class Customer {

	private String name;
	private String surname;
	private String login;
	private String password;

	public Customer(String name, String surname, String login, String password) {
		super();
		this.name = name;
		this.surname = surname;
		this.login = login;
		this.password = password;
	}

	@Override
	public String toString() {

		return login + "\t" + password + "\t" + name + "\t" + surname;
	}

}
