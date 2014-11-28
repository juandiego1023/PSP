#include <sys/types.h>
#include <unistd.h>
#include <stdio.h>

/*OK
Realice un programa en C que genere la siguiente configuración de procesos:
1 Padre y 3 hijos
Además, cada hijo deberá mostrar el mensaje "Yo soy el hijo x, mi padre es PID=Y, yo soy PID=z"
*/

int main(int argc, char *argv[])
{
pid_t pid1, pid2, pid3;
int status1, status2, status3;
pid1=fork();
if ( pid1== 0 ){ /* hijo */
	printf("Soy el hijo 1, mi padre es PID=%d, yo soy PID=%d\n", getppid(), getpid());
}
else{ /* padre */
	if ( (pid2=fork()) == 0 ){ /* segundo hijo */
		printf("Soy el hijo 2, mi padre es PID=%d, yo soy PID=%d\n", getppid(), getpid());
	}
	else{ /* padre */
			
		if ( (pid3=fork()) == 0 ){ /* tercer hijo */
			printf("Soy el hijo 3, mi padre es PID=%d, yo soy PID=%d\n", getppid(), getpid());
		}
		else{
			/* Esperamos al primer hijo termine, status 0*/
			waitpid(pid1, &status1, 0);
			/* Esperamos al segundo hijo termine, status 0 */
			waitpid(pid2, &status2, 0);
			/* Esperamos al tercer hijo termine, status 0 */
			waitpid(pid3, &status3, 0);
			printf("Soy el padre (%d, hijo de %d)\n",getpid(), getppid());
		}
	}
}
return 0;
}


