package co.edu.unbosque.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 * Clase DTO principal de usuario
 * @author Andres Espitia
 * @author Diego Forero
 * @author Esteban Mejia
 * @author Camilo Uribe
 *
 */
public class UserDTO implements Serializable{
	/**
	 * Nombre 
	 */
	private String name;
	/**
	 * Primer apellido
	 */
	private String lastname1;
	/**
	 * Segundo apellido
	 */
	private String lastname2;
	/**
	 * Nombre de usuario
	 */
	private String alias;
	/**
	 * Orientacion sexual
	 */
	private String orientation;
	/**
	 * Correo electronico
	 */
	private String email;
	/**
	 * Genero
	 */
	private boolean gender;
	/**
	 * Fecha de nacimiento
	 */
	private Date birth;
	/**
	 * Edad
	 */
	private int age;
	/**
	 * Descripcion
	 */
	private String info;
	/**
	 * Ruta de fotos
	 */
	private ArrayList<String> url_photos;
	/**
	 * Cantidad de likes recibidos
	 */
	private int likes;
	/**
	 * Cantidad de likes enviados
	 */
	private int likes_sent;
	/**
	 * Estado
	 */
	private boolean status;
	/**
	 * Cantidad de matches
	 */
	private int matches;
	/**
	 * Pais de origen
	 */
	private String origin;
	/**
	 * Pais de residencia
	 */
	private String residence;
	/**
	 * Contacto
	 */
	private String contact;
	/**
	 * Lista de likes enviados
	 */
	private ArrayList<Integer> likes_sent_list;
	/**
	 * Lista de likes recibidos
	 */
	private ArrayList<Boolean> likes_recived;
	/**
	 * Lista de matches
	 */
	private ArrayList<Integer> matches_persons;
	
	/**
	 * metodo constructor
	 */
	public UserDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param name nombre
	 * @param lastname1 apellido1
	 * @param lastname2 apellido2
	 * @param alias alias
	 * @param orientation orientacion
	 * @param email correo
	 * @param gender genero
	 * @param birth fecha
	 * @param age edad
	 * @param info info
	 * @param url_photos fotos
	 * @param likes likes
	 * @param likes_sent likes enviados
	 * @param status estado
	 * @param matches matches
	 * @param origin origen
	 * @param residence residencia
	 * @param contact contacto
	 */
	public UserDTO(String name, String lastname1, String lastname2, String alias, String orientation, String email, boolean gender, Date birth, int age, String info,
			ArrayList<String> url_photos, int likes, int likes_sent, boolean status, int matches, String origin,
			String residence, String contact) {
		super();
		this.name = name;
		this.lastname1 = lastname1;
		this.lastname2 = lastname2;
		this.alias = alias;
		this.orientation = orientation;
		this.email = email;
		this.gender = gender;
		this.birth = birth;
		this.age = age;
		this.info = info;
		this.url_photos = url_photos;
		this.likes = likes;
		this.likes_sent = likes_sent;
		this.status = status;
		this.matches = matches;
		this.origin = origin;
		this.residence = residence;
		this.contact = contact;
		this.likes_sent_list = new ArrayList<>();
		this.likes_recived = new ArrayList<>();
		for(int i=0; i<1000; i++) {
			this.likes_recived.add(false);
		}
		this.matches_persons = new ArrayList<>();
	}
	@Override
	public String toString() {
		return "Name: "+name+" - Lastnames: "+lastname1+" "+lastname2+" - Alias: "+alias+" - Orientation: "+orientation+" \n E-mail: "+email+" - Birth: "+birth+" - Age: "+age+" - Matches: "+num_matches()+" \nOrigin: "+origin+" - Residence: "+residence+" - Contact: "+contact;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the lastname1
	 */
	public String getLastname1() {
		return lastname1;
	}
	/**
	 * @param lastname1 the lastname1 to set
	 */
	public void setLastname1(String lastname1) {
		this.lastname1 = lastname1;
	}
	/**
	 * @return the lastname2
	 */
	public String getLastname2() {
		return lastname2;
	}
	/**
	 * @param lastname2 the lastname2 to set
	 */
	public void setLastname2(String lastname2) {
		this.lastname2 = lastname2;
	}
	/**
	 * @return the alias
	 */
	public String getAlias() {
		return alias;
	}
	/**
	 * @param alias the alias to set
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}
	/**
	 * @return the orientation
	 */
	public String getOrientation() {
		return orientation;
	}
	/**
	 * @param orientation the orientation to set
	 */
	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the gender
	 */
	public boolean isGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	/**
	 * @return the birth
	 */
	public Date getBirth() {
		return birth;
	}
	/**
	 * @param birth the birth to set
	 */
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the info
	 */
	public String getInfo() {
		return info;
	}
	/**
	 * @param info the info to set
	 */
	public void setInfo(String info) {
		this.info = info;
	}
	/**
	 * @return the url_photos
	 */
	public ArrayList<String> getUrl_photos() {
		return url_photos;
	}
	/**
	 * @param url_photos the url_photos to set
	 */
	public void setUrl_photos(ArrayList<String> url_photos) {
		this.url_photos = url_photos;
	}
	/**
	 * @return the likes
	 */
	public int getLikes() {
		return likes;
	}
	/**
	 * @param likes the likes to set
	 */
	public void setLikes(int likes) {
		this.likes = likes;
	}
	/**
	 * @return the likes_sent
	 */
	public int getLikes_sent() {
		return likes_sent;
	}
	/**
	 * @param likes_sent the likes_sent to set
	 */
	public void setLikes_sent(int likes_sent) {
		this.likes_sent = likes_sent;
	}
	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
	/**
	 * @return the matches
	 */
	public int getMatches() {
		return matches;
	}
	/**
	 * @param matches the matches to set
	 */
	public void setMatches(int matches) {
		this.matches = matches;
	}
	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}
	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	/**
	 * @return the residence
	 */
	public String getResidence() {
		return residence;
	}
	/**
	 * @param residence the residence to set
	 */
	public void setResidence(String residence) {
		this.residence = residence;
	}
	/**
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}
	/**
	 * @param contact the contact to set
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}

	/**
	 * @return the likes_sent_list
	 */
	public ArrayList<Integer> getLikes_sent_list() {
		return likes_sent_list;
	}


	/**
	 * @param likes_sent_list the likes_sent_list to set
	 */
	public void setLikes_sent_list(ArrayList<Integer> likes_sent_list) {
		this.likes_sent_list = likes_sent_list;
	}


	/**
	 * @return the likes_recived
	 */
	public ArrayList<Boolean> getLikes_recived() {
		return likes_recived;
	}


	/**
	 * @param likes_recived the likes_recived to set
	 */
	public void setLikes_recived(ArrayList<Boolean> likes_recived) {
		this.likes_recived = likes_recived;
	}


	/**
	 * @return the matches_persons
	 */
	public ArrayList<Integer> getMatches_persons() {
		return matches_persons;
	}


	/**
	 * @param matches_persons the matches_persons to set
	 */
	public void setMatches_persons(ArrayList<Integer> matches_persons) {
		this.matches_persons = matches_persons;
	}
	
	/**
	 * Metodo para los likes recibidos
	 * @return likes recibidos
	 */
	public int likes_Recived() {
		int c = 0;
		for (int i = 0; i < likes_recived.size(); i++) {
			if(likes_recived.get(i)) c++;
		}
		this.likes = c;
		return c;
	}
	
	/**
	 * Metodo para los likes enviados
	 * @return likes enviados
	 */
	public int likes_Sent() {
		this.likes_sent = likes_sent_list.size();
		return likes_sent_list.size();
	}
	
	/**
	 * Metodo para los matches
	 * @return Numero de matches
	 */
	public int num_matches() {
		this.matches = matches_persons.size();
		return this.matches;
	}
}
