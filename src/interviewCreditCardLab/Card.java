package interviewCreditCardLab;

public abstract class Card {
	
	protected int interestRate;// interest rate
	protected int startInvest;// the starting interest amount
	protected int interestEarned;// the amount of interest earned
	protected int resultInvest; //need to change to newinvesting amount
	private String brand; //discover, mastercard, visa
	private int time; //amount of time invested
	
	public Card() {}
	
	public Card(String brand, int interestRate, int startInvest) {
		this.brand = brand;
		this.interestRate = interestRate;
		this.startInvest = startInvest;
	}
	
	public String getBrand() {
		return this.brand;
	}
	public int getInterestRate() {
		return this.interestRate;
	}
	public int getStartInvest() {
		return this.startInvest;
	}
	public int getInterestEarned() {
		return this.interestEarned;
	}
	public int getResultInterest() {
		return this.resultInvest;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}
	public void setStartInvest(int startInvest) {
		this.startInvest = startInvest;
	}
	public void setInterestEarned(int interestRate, int startInvest) {
		this.interestEarned = startInvest * interestRate;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
