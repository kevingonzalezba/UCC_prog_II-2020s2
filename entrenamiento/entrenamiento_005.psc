Proceso entrenamiento_k5
	definir resp1, resp2, resp3, resp4, k Como Entero;
	
	escribir "¿bejamin franklin invento el pararrayos [0]... falso [1]...verdad?";
	leer resp1;
	escribir "¿samuel morse invento el telegrafo [0]... falso [1]...verdad?";
	leer resp2;
	escribir "¿peru es un pais suramericano [0]... falso [1]...verdad";
	leer resp3;
	escribir "¿5 es un numero primo [0]... falso [1]...verdad?";
	leer resp4;
	si (resp1 >= resp2) y (resp3 = resp4) Entonces
		k <- 1;
	SiNo
		k <- 0;
	FinSi
	
	
	
FinProceso
