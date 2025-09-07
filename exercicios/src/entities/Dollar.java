package entities;

public class Dollar {
	
	public static double dollar;
	
	public static double qtnDollar;
	
	public static double valorReais() {
		return dollar * qtnDollar;
	}
	
	public static double iof() {
		return valorReais() * 6/100;
	
	}
	
	public static double valorComImposto() {
		return valorReais() + iof();
	}
}
