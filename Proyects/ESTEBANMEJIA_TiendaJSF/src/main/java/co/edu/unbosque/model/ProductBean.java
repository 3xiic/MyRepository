package co.edu.unbosque.model;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ProductBean {

	private String cardNumber;
	private String cardNumberC;
	private String article;
	private int quantity;
	private int value;
	private String name;
	private String lastname;
	private String cardType;

	public ProductBean() {
	}

	public int totalValue() {
		return quantity*value;
	}
	public String ip()  {
		String ip =" ";
		try {
			ip = InetAddress.getLocalHost().toString();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  ip;
	}
	public String date() {
		Date d = new Date();
		return  new SimpleDateFormat("dd/MM/yyyy").format(d);
	}
	public String card() {
		return cardNumber.substring(cardNumber.length()-4);
	}

	public String info() {
		return "Señor usuario "+name+" "+lastname+" \n"+
				"Su compra fue realizada satisfactoriamente por un valor de "+totalValue()+"$ Correspondiente a "+quantity+" "+article+" \n"+
				", el precio por unidad fue de: "+value+"$ \n"+ 
				", la compra fue realizada con la tarjeta de credito numero: **** **** **** "+card()+" de la franquicia "+cardType+", fecha de la compra: "+date()+"\n"+
				" y la direccion ip es: "+ip();

	}
	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardNumberC() {
		return cardNumberC;
	}

	public void setCardNumberC(String cardNumberC) {
		this.cardNumberC = cardNumberC;
	}

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}


	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}




}
