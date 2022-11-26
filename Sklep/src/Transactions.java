import java.util.Date;

public class Transactions {

	private String user;
	private String product;
	
	
	public Transactions(String user, String product) {
		super();
		this.user = user;
		this.product = product;
	}


	@Override
	public String toString() {
		Date data=new Date();
		return user+", kupi³: "+product+" "+data.toString();
	}
	
	


}
