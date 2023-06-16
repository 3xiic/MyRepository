package co.edu.unbosque.view;

public class Preguntas {
	String pregunta1="¿Según el artículo 3 en el reglamento estudiantil con cuál de las siguientes opciones alguien"+"\n"+
					"pierde su calidad de estudiante?"+"\n"+
					"1. Cuando ha finalizado el programa académico y ha obtenido el título correspondiente."+"\n"+
					"2. No hace uso del derecho de renovación de matrícula, en los plazos señalados por la Institución."+"\n"+
					"3. A solicitud propia, cancele el semestre o periodo académico para el cual se matriculó."+"\n"+
					"4. Todas las mencionadas."+"\n"+
					"5. Incumpla los Estatutos, Reglamentos y demás disposiciones y decisiones emitidas por los"+"\n"+
					 "órganos de dirección y gobierno de la Universidad, previa aplicación del régimen disciplinario de"+"\n"+
					 "que trata el presente Reglamento.";
	
	String pregunta2="¿Según el artículo 24, a cuantas horas de trabajo equivale un crédito?"+"\n"+
			"1. 24 horas"+"\n"+
			"2. 12 horas"+"\n"+
			"3. 72 horas"+"\n"+
			"4. 48 horas";
	
	String pregunta3="Según el artículo 28, el total de créditos de los programas de pregrado, con excepción del"+"\n"+
			"Programa de Medicina que puede ser hasta de 300, se establece entre un mínimo de __ y un"+"\n"+
			"máximo de __. ¿De cuánto son los valores?"+"\n"+
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
