Algoritmo condicional_multiple_calculadora
	Escribir "Binvenidos a la calculadore de 2 numeros";
	Repetir
		Escribir "MENU: Escriba el número de la opción necesitada (1-4)";
		Escribir "1. Suma";
		Escribir "2. Resta";
		Escribir "3. Multiplicacion";
		Escribir "4. Division";
		Leer opc
	Hasta Que opc=1  O opc=2  O opc=3  O opc=4
	
	Escribir "numero 1:";
	Leer var1;
	Repetir
		Escribir "numero 2:";
		Leer var2;
	Hasta Que var2<>0 Y opc=4
	
	Segun opc Hacer
		1:
			Escribir "El resultado es: ", var1+var2;
		2:
			Escribir "El resultado es: ",var1-var2;
		3:
			Escribir "El resultado es: ",var1*var2;
		4:
			Escribir "El resultado es: ",var1/var2;
		De Otro Modo:
			Escribir "No selecciono la opcion adecuada";
	Fin Segun
	
FinAlgoritmo
