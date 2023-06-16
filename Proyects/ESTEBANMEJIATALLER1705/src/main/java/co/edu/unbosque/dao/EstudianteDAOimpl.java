package co.edu.unbosque.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import co.edu.unboque.dto.EstudianteDTO;




public class EstudianteDAOimpl implements EstudianteDAO{
	private List <EstudianteDTO> listaEstudiantes;

	private void listarEstudiantes(List <EstudianteDTO> listaEstudiantes) {
		System.out.println(" --- Listado Estudiante");
		for (EstudianteDTO estudiante : listaEstudiantes) {
			System.out.println(estudiante);
		}
	}
	@Override
	public String agregar(Object registro) {
		String resultado;
		SessionFactory miFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(EstudianteDTO.class)
				.buildSessionFactory();

		Session miSession = miFactory.openSession();
		try {
			miSession.beginTransaction();
			miSession.save((EstudianteDTO)registro);
			miSession.getTransaction().commit();
			resultado = "OK";
			miSession.close();
		} catch (Exception e) {
			resultado = e.toString();
		} finally {
			miFactory.close();
		}
		return resultado;
	}

	@Override
	public Object consultar() {
		SessionFactory miFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(EstudianteDTO.class)
				.buildSessionFactory();
		Session miSession = miFactory.openSession();
		try {
			miSession.beginTransaction();
			listaEstudiantes = miSession.createQuery("from EstudianteDTO").getResultList();
			listarEstudiantes(listaEstudiantes);
			miSession.getTransaction().commit();
			miSession.close();
		} catch (Exception e) {
			listaEstudiantes=null;
			//resultado = e.toString();
		} finally {
			miFactory.close();
		}		
		return listaEstudiantes;
	}
	



}
