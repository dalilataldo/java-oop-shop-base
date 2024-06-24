package org.lessons.java.shop;

import java.util.Random;

/*
Creare la classe Prodotto che gestisce i prodotti dello shop.
Un prodotto è caratterizzato da:
codice (numero intero)
nome
descrizione
prezzo
iva
 */

public class Prodotto {

	int productCode;
	String productName;
	String productDescription;
	int productPrice;
	int productIva;
	
public Prodotto(String productName, String productDescription, int productPrice, int productIva ) {
		
	Random random = new Random ();
		
	this.productCode = random.nextInt(99999);
	this.productName = productName;
	this.productDescription = productDescription;
	this.productPrice = productPrice;
	this.productIva = productIva;
		
	}
	
/*Usate opportunamente costruttori, attributi ed eventuali altri metodi di “utilità” per fare in modo che:
alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
il prodotto esponga un metodo per avere il prezzo base
il prodotto esponga un metodo per avere il prezzo comprensivo di iva
il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome*/
	
	public int price () {
		return productPrice;
	}
	
	public int priceAndIva () {
		int priceIva = productPrice + ((productPrice * productIva)/100);
		return priceIva;
	}
	
	public String nameExtended () {
		String fullName = productCode + " " + productName;
		return fullName;
	}

}





