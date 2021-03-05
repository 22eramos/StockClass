
public class Stock {
	private String symbol = new String();
	private String name = new String();
	private double previousClosingPrice;
	private double currentPrice;
	
	Stock(String symbol, String name){
		this.symbol = symbol;
		this.name = name;
		
	}
	
	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}
	public double getCurrentPrice() {
		return currentPrice;
	}
	public String getName() {
		return name;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	public double getChangePercent() {
		return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
	}



}
