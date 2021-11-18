package com.app;

public class CurrencyConverter {
	
	
	public int rupee = 63;

	public int dirham = 3; // UAE

	public int real = 3;  // brazilian     

	public int chilean_peso = 595;

	public int mexican_peso = 18;       

	public int _yen = 107;

	public int $australian = 2;  // australian dollar

	public int dollar;

	public int Rupee = 63;
	
	public void printCurrencies() {
		
		   System.out.println("rupee: " + rupee);   
           System.out.println("dirham: " + dirham);
		

		   System.out.println("real: " + real);
		   System.out.println("chilean_peso: " + chilean_peso);   

		   System.out.println("chilean_peso: " + chilean_peso);
		   System.out.println("_yen: " + _yen);   

		   System.out.println("$australian: " + $australian);
		   System.out.println("dollar: " + dollar);   

		   System.out.println("Rupee: " + Rupee);
	}

	public static void main(String[] args) {
		
		CurrencyConverter cc = new CurrencyConverter();
		cc.printCurrencies();
		
		
		
	}

}
