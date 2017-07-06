package CurrencyConvertor;


public class PLZtoINR {
  
	private final long id;
	private final double PLN;
	private final double INR;
	
	public PLZtoINR ( long id , double PLN,double INR){
		this.id = id;
		this.INR = INR;
		this.PLN = PLN;
	}

	public long getId() {
		return id;
	}

	public double getPLN() {
		return PLN;
	}

	public double getINR() {
		return INR;
	}

}

