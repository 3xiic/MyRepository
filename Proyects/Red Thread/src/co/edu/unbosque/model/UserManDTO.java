package co.edu.unbosque.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;

/**
 * Objeto de tipo usuario hombre
 * @author Andres Espitia
 * @author Diego Forero
 * @author Camilo Uribe
 * @author Esteban Mejia
 *
 */
public class UserManDTO extends UserDTO {
	/**
	 * Ingresos mensuales
	 */
	private float incomes;
	
	public UserManDTO() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param incomes
	 */
	public UserManDTO(float incomes) {
		this.incomes = incomes;
	}

	/**
	 * @param name
	 * @param lastname1
	 * @param lastname2
	 * @param alias
	 * @param orientation
	 * @param email
	 * @param gender
	 * @param birth
	 * @param age
	 * @param info
	 * @param url_photos
	 * @param likes
	 * @param likes_sent
	 * @param status
	 * @param matches
	 * @param origin
	 * @param residence
	 * @param contact
	 * @param incomes
	 */
	public UserManDTO(String name, String lastname1, String lastname2, String alias, String orientation, String email, boolean gender, Date birth, int age, String info,
			ArrayList<String> url_photos, int likes, int likes_sent, boolean status, int matches, String origin,
			String residence, String contact, float incomes) {
		super(name, lastname1, lastname2, alias, orientation, email, gender, birth, age, info, url_photos,
				likes, likes_sent, status, matches, origin, residence, contact);
		this.incomes = incomes;
	}
	@Override
	public String toString() {
		return "Name: "+getName()+" - Lastnames: "+getLastname1()+" "+getLastname2()+" - Alias: "+getAlias()+" - Orientation: "+getOrientation()+"\r\nE-mail: "+getEmail()+" - Birth: "+getBirth()+" - Age: "+getAge()+"\r\nMatches: "+num_matches()+" Origin: "+getOrigin()+" - Residence: "+getResidence()+" - Contact: "+getContact()+"\r\nIncomes: $"+incomes;
	}
	/**
	 * @return the incomes
	 */
	public float getIncomes() {
		return incomes;
	}

	/**
	 * @param incomes the incomes to set
	 */
	public void setIncomes(float incomes) {
		this.incomes = incomes;
	}
	

	
	
	
}
