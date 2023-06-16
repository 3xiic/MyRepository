package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Clase de tipo usuario mujer
 * @author Andres Espitia
 * @author Diego Forero
 * @author Camilo Uribe
 * @author Esteban Mejia
 *
 */
public class UserWomanDTO extends UserDTO {
	/**
	 * Divorcio
	 */
	private boolean divorce;
	
	/**
	 * Constructor vacio
	 */
	public UserWomanDTO() {
		
	}
	
	/**
	 * @param divorce
	 */
	public UserWomanDTO(boolean divorce) {
		this.divorce = divorce;
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
	 * @param divorce
	 */
	public UserWomanDTO(String name, String lastname1, String lastname2, String alias, String orientation, String email, boolean gender, Date birth, int age, String info,
			ArrayList<String> url_photos, int likes, int likes_sent, boolean status, int matches, String origin,
			String residence, String contact, boolean divorce) {
		super(name, lastname1, lastname2, alias, orientation, email, gender, birth, age, info, url_photos,
				likes, likes_sent, status, matches, origin, residence, contact);
		this.divorce = divorce;
	}
	@Override
	public String toString() {
		return "Name: "+getName()+" - Lastnames: "+getLastname1()+" "+getLastname2()+" - Alias: "+getAlias()+" - Orientation: "+getOrientation()+"\r\nE-mail: "+getEmail()+" - Birth: "+getBirth()+" - Age: "+getAge()+"\r\nMatches: "+num_matches()+" Origin: "+getOrigin()+" - Residence: "+getResidence()+" - Contact: "+getContact()+"\r\nDivorce: "+divorce;
	}
	/**
	 * @return the divorce
	 */
	public boolean isDivorce() {
		return divorce;
	}
	/**
	 * @param divorce the divorce to set
	 */
	public void setDivorce(boolean divorce) {
		this.divorce = divorce;
	}
	
}
