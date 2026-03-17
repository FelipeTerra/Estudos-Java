package Util;

public class Conversor {
	
	public static double converterDollar (double qtdDollar, double valorDollar) {
		double valorSemIOF = qtdDollar * valorDollar;
		return valorSemIOF + valorSemIOF * 0.06;
	}	

}
