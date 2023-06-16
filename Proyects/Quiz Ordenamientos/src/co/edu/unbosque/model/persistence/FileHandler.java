package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileHandler {

	private static FileInputStream fis; 
	private static ObjectInputStream ois; 
	private static FileOutputStream fos;
	private static ObjectOutputStream oos; 

	public static void writeSerializable(Object o, String filename) {
		try {
			fos = new FileOutputStream("src/co/edu/unbosque/model/persistence/" + filename);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

	
			try {
				oos = new ObjectOutputStream(fos);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				oos.writeObject(o);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	public static Object readSerializable(String filename) {
	
			try {
				fis= new FileInputStream("src/co/edu/unbosque/model/persistence/"+filename);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			try {
				ois= new ObjectInputStream(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		Object aux=null;

			try {
				aux=ois.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return aux;
	}
}
