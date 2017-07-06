package CurrencyConvertor;

public class INRtoPLZ {
	private final long id;
	private final double PLN;
	private final double INR;
	
	public INRtoPLZ ( long id , double INR,double PLN){
		this.id = id;
		
		this.PLN = PLN;
		this.INR = INR;
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
