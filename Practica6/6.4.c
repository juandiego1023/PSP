#include <sys/types.h> 
#include <unistd.h> 
#include <stdio.h>
/*
Crea un programa que simula el paso por un puente de tres procesos (donde sólo puede pasar un proceso). 
Primero deberá pasar el más joven y por último el más viejo.
Salida esperada del programa
>Creo proceso 1.
> Creo proceso 2
> Creo proceso 3
> Paso puente proceso 3 y termina.
> Paso puente proceso 2 y termina.
> Paso puente proceso 1 y termina.
*/
int main(int argc, char *argv[])
{
pid_t pid1, pid2, pid3;
int status1, status2, status3;
pid1=fork();
printf("Creo el proceso 1\n");
if ( pid1== 0 ){
	printf("Paso puente proceso 1 y termina\n");
}
pid2=fork();
printf("Creo el proceso 2\n");
if ( pid2 == 0 ){ 
	printf("Paso puente proceso 2 y termina\n");
}
pid3=fork();	
printf("Creo el proceso 3\n");
if ( pid3 == 0 ){
	printf("Paso puente proceso 3 y termina\n");
}
		
	/* Esperamos al primer hijo termine, status 0*/
	waitpid(pid3, &status1, 0);
	/* Esperamos al segundo hijo termine, status 0 */
	waitpid(pid2, &status2, 0);
	/* Esperamos al tercer hijo termine, status 0 */
	waitpid(pid1, &status3, 0);
		
return 0;
}
