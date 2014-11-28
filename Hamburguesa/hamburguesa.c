#include <sys/types.h>
#include <unistd.h>
#include <stdio.h>

int main(int argc, char *argv[])
{
pid_t pid1, pid2, pid3;
int status1, status2, status3;
int carne = 0;
pid1=fork();
if ( pid1== 0 )
    { /* salsa */
    printf("Soy la salsa, (%d, hijo de %d)\n",  getpid(), getppid());
   // carne ++;
    }
else
    {
    if ( (pid2=fork()) == 0 )
    { /* picada */
    waitpid(pid1, &status1, 0);
    printf("Soy la carne picada, (%d, hijo de %d)\n",getpid(), getppid());
   // carne ++;
    }
    else
    {

	if ( (pid3=fork()) == 0 )
	    { /* carne */
	     waitpid(pid2, &status2, 0);
  	     printf("Soy la carne, (%d, hijo de %d)\n" ,getpid(), getppid());
   	     carne=3;
   	    }

 }
}


	if(carne == 3){
         waitpid(pid3, &status3, 0);
	 printf("Caja cerrada \n");
	}

return 0;
}
