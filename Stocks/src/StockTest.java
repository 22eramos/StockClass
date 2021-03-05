
public class StockTest {

	public static void main(String[] args) {
		Stock stock1 = new Stock("A15", "S1");
		stock1.setPreviousClosingPrice(34.5);
		stock1.setCurrentPrice(34.35);
		
		System.out.print("The stock named " + stock1.getName() + " with the symbol " + stock1.getSymbol() + " has changed by " + stock1.getChangePercent() +"%.");
	}
}
