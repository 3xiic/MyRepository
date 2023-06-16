package co.edu.unbosque.controller;

import java.util.Iterator;
import java.util.Scanner;

import co.edu.unbosque.model.AdministrativeDAO;
import co.edu.unbosque.model.AdministrativeDTO;
import co.edu.unbosque.model.CandidateDAO;
import co.edu.unbosque.model.CandidateDTO;
import co.edu.unbosque.model.PersonDAO;
import co.edu.unbosque.model.SecondSemesterStudentsDAO;
import co.edu.unbosque.model.SecondSemesterStudentsDTO;
import co.edu.unbosque.view.View;
/**
 * Controlador del programa
 * @author Camilo Uribe
 * @author Esteban Mejia
 *
 */
public class Controller {
	/**
	 * DAO de tipo persona que contiene los metodos para guardas los datos de tipo persona
	 */
	private PersonDAO p;
	/**
	 * DAO para los estudiantes de segundo semestre que contiene los metodo de guardado de datos
	 */
	private SecondSemesterStudentsDAO s;
	/**
	 * DAO para los administrativos que contiene los metodos de guardado de datos
	 */
	private AdministrativeDAO a;
	/**
	 * DAO para los candidatos que contiene los metodos de guardado de datos
	 */
	private CandidateDAO c;
	/**
	 * Vista interactiva
	 */
	private View v;
	
	/**
	 * Metodo constructor
	 */
	public Controller() {
		p = new PersonDAO();
		s = new SecondSemesterStudentsDAO();
		a = new AdministrativeDAO();
		c = new CandidateDAO();
		v= new View();
		p.loadData();
		s.loadData();
		c.loadData();
		a.loadData();
		int n=Integer.parseInt(v.insertInfo(v.menu()));
		while(n!=0) {
			switch(n) {
			case 1:
				s.addStudent(v.insertInfo("Ingresa el nombre"),Integer.parseInt(v.insertInfo("Ingresa la edad")) , v.insertInfo("Ingresa su comida favorito"), v.insertInfo("Ingresa su color favorito"),Integer.parseInt(v.insertInfo("Ingresa la cantidad de materias perdidas")));
				break;
			case 2:
				s.updateStudent(v.insertInfo("Ingresa el nombre"),Integer.parseInt(v.insertInfo("Ingresa la edad")) , v.insertInfo("Ingresa su comida favorito"), v.insertInfo("Ingresa su color favorito"),Integer.parseInt(v.insertInfo("Ingresa la cantidad de materias perdidas")));
				break;
			case 3:
				s.deleteStudent(v.insertInfo("Ingresa el nombre"), n);
				break;
			case 4:
				a.addAdmin(v.insertInfo("Ingresa el nombre"),Integer.parseInt(v.insertInfo("Ingresa la edad")) , v.insertInfo("Ingresa su comida favorito"), v.insertInfo("Ingresa su color favorito"),v.insertInfo("Ingresa su cargo"));
				break;
			case 5:
				a.updateAdmin(v.insertInfo("Ingresa el nombre"),Integer.parseInt(v.insertInfo("Ingresa la edad")) , v.insertInfo("Ingresa su comida favorito"), v.insertInfo("Ingresa su color favorito"),v.insertInfo("Ingresa su cargo"));
				break;
			case 6:
				a.deleteAdmin((v.insertInfo("Ingresa el nombre")), null);
				break;
			case 7:
				c.addCandidate(v.insertInfo("Ingresa el nombre"),Integer.parseInt(v.insertInfo("Ingresa la edad")) , v.insertInfo("Ingresa su comida favorito"), v.insertInfo("Ingresa su color favorito"),v.insertInfo("Ingresa la carrera a postularse"));
				break;
			case 8:
				c.updateCandidate(v.insertInfo("Ingresa el nombre"),Integer.parseInt(v.insertInfo("Ingresa la edad")) , v.insertInfo("Ingresa su comida favorito"), v.insertInfo("Ingresa su color favorito"),v.insertInfo("Ingresa la carrera a postularse"));
				break;
			case 9:
				c.deleteCandidate(v.insertInfo("Ingresa el nombre"), null);
				break;
			case 10:
				StringBuilder sb= new StringBuilder();
				for (int i = 0; i < p.getList().size(); i++) {
					sb.append(p.getList().get(i).getName()+" tiene "+p.getList().get(i).getAge()+" años"+
							", le gusta la "+p.getList().get(i).getFood()+" y su color favorito es: "+p.getList().get(i).getColor()+"\n");	
				}
				for (SecondSemesterStudentsDTO s : s.getList()) {
					sb.append("El estudiante "+s.getName()+" tiene "+s.getAge()+" años"+
							", le gusta la "+s.getFood()+" ,su color favorito es: "+s.getColor()+" y ha perdido "+s.getFailed_class()+" materias"+"\n");
				}
				for (AdministrativeDTO a : a.getList()) {
					sb.append("El Administrativo "+a.getName()+" tiene "+a.getAge()+" años"+
							", le gusta la "+a.getFood()+" ,su color favorito es: "+a.getColor()+" y trabaja como "+a.getPosition()+"\n");
				}
				for (CandidateDTO c : c.getList()) {
					sb.append("El candidato a estudiante "+c.getName()+" tiene "+c.getAge()+" años"+
							", le gusta la "+c.getFood()+" ,su color favorito es: "+c.getColor()+" y aspira a la carrera de "+c.getCareer()+"\n");
				}
				
				v.showInfo(sb);
				break;
			case 11:
				StringBuilder sbE= new StringBuilder();
				for (SecondSemesterStudentsDTO s : s.getList()) {
					sbE.append(s.getName()+" tiene "+s.getAge()+" años"+
							", le gusta la "+s.getFood()+" ,su color favorito es: "+s.getColor()+" y ha perdido "+s.getFailed_class()+" materias"+"\n");
				}
				v.showInfo(sbE);
				break;
			case 12:
				StringBuilder sbA= new StringBuilder();
				for (AdministrativeDTO a : a.getList()) {
					sbA.append(a.getName()+" tiene "+a.getAge()+" años"+
							", le gusta la "+a.getFood()+" ,su color favorito es: "+a.getColor()+" y trabaja como "+a.getPosition()+"\n");
				}
				v.showInfo(sbA);
				break;
			case 13:
				StringBuilder sbC= new StringBuilder();
				for (CandidateDTO c : c.getList()) {
					sbC.append(c.getName()+" tiene "+c.getAge()+" años"+
							", le gusta la "+c.getFood()+" ,su color favorito es: "+c.getColor()+" y aspira a la carrera de "+c.getCareer()+"\n");
				}
				v.showInfo(sbC);
				break;

			default:
				v.showInfoS("Ingresa una opcion valida");
				break;
			}
			n=Integer.parseInt(v.insertInfo(v.menu()));
		}
	}
}
