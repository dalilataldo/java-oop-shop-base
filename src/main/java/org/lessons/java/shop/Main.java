package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//aggiungete una classe Main con metodo main nella quale testate tutte le funzionalità della classe Prodotto.
	
	Prodotto prodottoA = new Prodotto ("Chair", "Una sedia a 4 gambe", 150, 22);
	
	System.out.println("Il codice è: " + prodottoA.productCode);
	System.out.println("Il nome è: " + prodottoA.productName);
	System.out.println("Il prodotto è: " + prodottoA.productDescription);
	System.out.println("Il prezzo è €: " + prodottoA.price());
	System.out.println("L'Iva è: " + prodottoA.productIva);
	System.out.println("Il prezzo comprensivo di Iva è €: " + prodottoA.priceAndIva());
	System.out.println("Il nome completo del prodotto è: " + prodottoA.nameExtended());
	
	}

}
