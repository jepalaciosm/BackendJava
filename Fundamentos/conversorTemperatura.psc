Algoritmo conversorTemperatura
//Para convertir de �C a �F use la f�rmula: �F = �C x 1.8 + 32.
//	Para convertir de �F a �C use la f�rmula: �C = (�F-32) � 1.8.
//		Para convertir de K a �C use la f�rmula: �C = K ? 273.15.
//			Para convertir de �C a K use la f�rmula: K = �C + 273.15.
	Escribir " Bienvenido al conversor de Temperatura"
	Definir opc Como Entero;
	Definir tempInicial Como Real;

	Repetir
		Escribir "MENU: Escriba el n�mero de la opci�n necesitada (1-4)";
		Escribir "1. Para convertir de �C a �F";
		Escribir "2. Para convertir de �F a �C ";
		Escribir "3. Para convertir de �K a �C";
		Escribir "4. Para convertir de �C a �K";
		Escribir "5. Para convertir de �F a �K";
		Escribir "6. Para convertir de �K a �F";
		Leer opc
	Hasta Que opc=1  O opc=2  O opc=3  O opc=4 O opc=5  O opc=6
	
	Escribir "Ingrese la temperatura a convertir:";
	Leer tempInicial;
	
	Segun opc Hacer
		1:
			Escribir tempInicial,"�C es iagual a  ", (tempInicial * 9/5) + 32, "�F";
		2:
			Escribir tempInicial,"�F es iagual a  ",(tempInicial - 32) * 5/9,"�C";
		3:
			Escribir tempInicial,"�K es iagual a  ",tempInicial - 273.15,"�C";
		4:
			Escribir tempInicial,"�C es iagual a  ",tempInicial + 273.15,"�K";
		5:
			Escribir tempInicial,"�F es iagual a  ",(tempInicial + 459.67) * 5/9,"�K";
		6:
			Escribir tempInicial,"�K es iagual a  ",(tempInicial * 9/5) - 459.67,"�F";
		De Otro Modo:
			Escribir "No selecciono la opcion adecuada";
	Fin Segun
	
FinAlgoritmo
