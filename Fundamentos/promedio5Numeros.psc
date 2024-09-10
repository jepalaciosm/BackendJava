Algoritmo promedio5Numeros
	Escribir " Bienvenido al Promediador de Numeros"
	Definir contador Como Entero;
	Definir numeros_, sumatoria Como Real;
	
	contador=1;
	sumatoria=0;
	Mientras contador<=5 Hacer
		Escribir "Por favor ingrese el numero ", contador, ":";
		Leer numeros_
		contador=contador+1;
		sumatoria=sumatoria+numeros_;
	Fin Mientras
	
	Escribir "El promedio de los 5 numeros ingresados es: ", sumatoria/5;
FinAlgoritmo
