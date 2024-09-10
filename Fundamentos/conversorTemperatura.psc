Algoritmo conversorTemperatura
//Para convertir de ºC a ºF use la fórmula: ºF = ºC x 1.8 + 32.
//	Para convertir de ºF a ºC use la fórmula: ºC = (ºF-32) ÷ 1.8.
//		Para convertir de K a ºC use la fórmula: ºC = K ? 273.15.
//			Para convertir de ºC a K use la fórmula: K = ºC + 273.15.
	Escribir " Bienvenido al conversor de Temperatura"
	Definir opc Como Entero;
	Definir tempInicial Como Real;

	Repetir
		Escribir "MENU: Escriba el número de la opción necesitada (1-4)";
		Escribir "1. Para convertir de ºC a ºF";
		Escribir "2. Para convertir de ºF a ºC ";
		Escribir "3. Para convertir de ºK a ºC";
		Escribir "4. Para convertir de ºC a ºK";
		Escribir "5. Para convertir de ºF a ºK";
		Escribir "6. Para convertir de ºK a ºF";
		Leer opc
	Hasta Que opc=1  O opc=2  O opc=3  O opc=4 O opc=5  O opc=6
	
	Escribir "Ingrese la temperatura a convertir:";
	Leer tempInicial;
	
	Segun opc Hacer
		1:
			Escribir tempInicial,"ºC es iagual a  ", (tempInicial * 9/5) + 32, "ºF";
		2:
			Escribir tempInicial,"ºF es iagual a  ",(tempInicial - 32) * 5/9,"ºC";
		3:
			Escribir tempInicial,"ºK es iagual a  ",tempInicial - 273.15,"ºC";
		4:
			Escribir tempInicial,"ºC es iagual a  ",tempInicial + 273.15,"ºK";
		5:
			Escribir tempInicial,"ºF es iagual a  ",(tempInicial + 459.67) * 5/9,"ºK";
		6:
			Escribir tempInicial,"ºK es iagual a  ",(tempInicial * 9/5) - 459.67,"ºF";
		De Otro Modo:
			Escribir "No selecciono la opcion adecuada";
	Fin Segun
	
FinAlgoritmo
