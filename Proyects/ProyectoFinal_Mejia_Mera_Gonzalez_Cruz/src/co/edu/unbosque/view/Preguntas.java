package co.edu.unbosque.view;

public class Preguntas {
	String pregunta1="�Seg�n el art�culo 3 en el reglamento estudiantil con cu�l de las siguientes opciones alguien"+"\n"+
					"pierde su calidad de estudiante?"+"\n"+
					"1. Cuando ha finalizado el programa acad�mico y ha obtenido el t�tulo correspondiente."+"\n"+
					"2. No hace uso del derecho de renovaci�n de matr�cula, en los plazos se�alados por la Instituci�n."+"\n"+
					"3. A solicitud propia, cancele el semestre o periodo acad�mico para el cual se matricul�."+"\n"+
					"4. Todas las mencionadas."+"\n"+
					"5. Incumpla los Estatutos, Reglamentos y dem�s disposiciones y decisiones emitidas por los"+"\n"+
					 "�rganos de direcci�n y gobierno de la Universidad, previa aplicaci�n del r�gimen disciplinario de"+"\n"+
					 "que trata el presente Reglamento.";
	
	String pregunta2="�Seg�n el art�culo 24, a cuantas horas de trabajo equivale un cr�dito?"+"\n"+
			"1. 24 horas"+"\n"+
			"2. 12 horas"+"\n"+
			"3. 72 horas"+"\n"+
			"4. 48 horas";
	
	String pregunta3="Seg�n el art�culo 28, el total de cr�ditos de los programas de pregrado, con excepci�n del"+"\n"+
			"Programa de Medicina que puede ser hasta de 300, se establece entre un m�nimo de __ y un"+"\n"+
			"m�ximo de __. �De cu�nto son los valores?"+"\n"+
			"1. 120 y 170"+"\n"+
			"2. 60 y 80"+"\n"+
			"3. 100 y 200"+"\n"+
			"4. 140 y 190" 
;
	String pregunta4;
	String pregunta5;
	String pregunta6;
	String pregunta7;
	String pregunta8;
	String pregunta9;
	String pregunta10;
	String pregunta11;
	String pregunta12;
	String pregunta13;
	String pregunta14;
	String pregunta15;
	String pregunta16;
	String pregunta17;
	String pregunta18;
	public String Dado1(){
		String pregunta = "";
		int numeroD1=(int) ((Math.random()*3)+1);
		if(numeroD1==1) {
			pregunta=pregunta1;
		}
		else if(numeroD1==2) {
			pregunta=pregunta2;
		}
		else {
			pregunta=pregunta3;
		}
		return pregunta;
	}
	

}
