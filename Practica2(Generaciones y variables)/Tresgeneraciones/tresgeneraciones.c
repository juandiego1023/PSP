#include <sys/types.h>
#include <unistd.h>
#include <stdio.h>

/*Nieto, Padre, Abuelo*/

int main(int argc, char *argv[])
{
pid_t pid1, pid2, pid3;
int status1, status2, status3;
pid1=fork();
if ( pid1== 0 )
    { /* padre */

          if((pid2=fork()) == 0)
	  {/* Nieto */

          printf("Soy el nieto (%d, hijo de %d)\n", getpid(), getppid());

	  }
	  else{
	  waitpid(pid2, &status2, 0);
          printf("Soy el padre (%d, hijo de %d)\n", getpid(), getppid());

          }
    }
else
    { /* abuelo */

 // Esperamos al primer hijo termine, status 0
   // waitpid(pid2, &status2, 0);

 // Esperamos al segundo hijo termine, status 0
    waitpid(pid1, &status1, 0);

    printf("Soy el abuelo (%d, hijo de %d)\n",getpid(), getppid());

    }
return 0;
}
