Algoritmo areaCirculo
	Definir area, radio Como Real;
	Repetir
		Escribir "Por favor ingrese el radio del circulo (valor positivo y mayor a cero)";
		Leer radio;
		si radio<0 Entonces
			Escribir "El radio debe ser un valor positivo";
		FinSi
	Hasta Que radio > 0
	
	area=pi*radio*radio;
	Escribir "El area del circulo es: ", area;
FinAlgoritmo
