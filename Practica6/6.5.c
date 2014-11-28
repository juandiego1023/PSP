#include <stdio.h>
#include <signal.h>
#include <stdlib.h>
#include <fcntl.h>

/*OK
Crea un programa que permita elegir el orden de ejecución de dos procesos p1 y p2,
mediante la orden introducida en el terminal.
Ejemplo
>programa 12
> Soy proceso 1 y termino
> Soy proceso 2 y termino
>programa 21
>Soy proceso 2 y termino
>Soy proceso 1 y termino
*/
int main() {
	int pid;
	int i,x;
	int status1;
	int respuesta;

printf("Pulsa 1 para terminar proceso 1 primero\n");
printf("Pulsa 2 para terminar proceso 2 primero\n");
scanf("%d", &respuesta);
	if(respuesta == 1){

	pid = fork();
 
	switch(pid)
	{
		case -1: // Si pid es -1 quiere decir que ha habido un error
			perror("No se ha podido crear el proceso hijo\n");
			break;
		case 0: // Cuando pid es cero quiere decir que es el proceso hijo
			waitpid(pid, &status1, 0);		
			sleep(1);
			printf("Soy el proceso2 y termino\n");	
			break;
		default: // Cuando es distinto de cero es el padre	
			sleep(1);
			printf("Soy el proceso1 y termino\n");
			break;
	}
	
	}
	else if (respuesta == 2) {
	pid = fork();
 
	switch(pid)
	{
		case -1: // Si pid es -1 quiere decir que ha habido un error
			perror("No se ha podido crear el proceso hijo\n");
			break;
		case 0: // Cuando pid es cero quiere decir que es el proceso hijo		
			sleep(1);
			printf("Soy el proceso2 y termino\n");	
			break;
		default: // Cuando es distinto de cero es el padre
			waitpid(pid, &status1, 0);	
			sleep(1);
			printf("Soy el proceso1 y termino\n");
			break;
	}
	}
	else{
		printf("Has elegido mal tu respuesta\n");
		return 0;
	}

 
 
}
