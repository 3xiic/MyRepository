package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Date;
/**
 * DAO de Usuario
 * @author Andres Espitia
 * @author Diego Forero
 * @author Esteban Mejia
 * @author Camilo Uribe
 *
 */
public interface UserDAO {
	/**
	 * Metodo para crear usuario
	 * @param u
	 */
	public abstract void createUser(UserDTO u, String password);
	/**
	 * Metodo para actualizar el usuario
	 * @param index index
	 * @param new_orientation orientacion
	 * @return actualizacion exitosa
	 */
	public abstract boolean updateUserOrientation(int index, String new_orientation);
	/**
	 * Metodo para actualizar el usuario
	 * @param index index
	 * @param new_alias alias
	 * @return actualizacion exitosa
	 */
	public abstract boolean updateUserAlias(int index, String new_alias);
	/**
	 * Metodo para actualizar el usuario
	 * @param index index 
	 * @param new_origin origen
	 * @return actualizacion exitosa
	 */
	public abstract boolean updateUserOrigin(int index, String new_origin);
	/**
	 * Metodo para actualizar el usuario
	 * @param index index
	 * @param new_residence residencia
	 * @return actualizacion exitosa
	 */
	public abstract boolean updateUserResidence(int index, String new_residence);
	/**
	 * Metodo para actualizar el usuario
	 * @param index index
	 * @param new_contact contacto
	 * @return actualizacion exitosa
	 */
	public abstract boolean updateUserContact(int index, String new_contact);
	/**
	 * Metodo para actualizar el email
	 * @param index index
	 * @param new_email email
	 * @return actualizacion exitosa
	 */
	public abstract boolean updateUserEmail(int index, String new_email);
	/**
	 * Mostrar los compatibles
	 * @param index index
	 * @return Compatibles
	 */
	public abstract ArrayList<UserDTO> showCompatibles(int index);
	/**
	 * Metodo que se usa para buscar un usuario especifico
	 * @param username username
	 * @return usuario
	 */
	public abstract boolean userExist(String username);
}
