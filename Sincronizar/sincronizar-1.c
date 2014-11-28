#include <stdio.h>
#include <signal.h>
#include <stdlib.h>
#include <fcntl.h>

/*--------------------------------------------------------------*/
/*gestion de señales con proceso hijo (handler)*/
void manejador (int segnal) 
{
	printf ("Hijo recibe señal...%d\n",segnal);
}

int main()
{
	int pid_hijo,pid_padre;
	pid_padre=getpid();
	pid_hijo=fork(); //creamos hijo
	switch (pid_hijo)
		{
		case -1:
			printf ("ERROR al crear hijo.. \n");
			exit(-1);
		
		case 0: //hijo
			signal (SIGUSR1,manejador); //establezco manejador señal en hijo
			while(1){
				};
			break;
		default:
			sleep(1);
			kill(pid_hijo,SIGUSR1); //envia señal a hijo
			sleep(1);
			printf("Me suicidoooooo..\n");	
			kill(pid_padre,SIGKILL);//me suicido
			sleep(1);
			kill(pid_hijo,SIGUSR1); //envia señal a hijo
			sleep(1);	
			kill(pid_hijo,SIGKILL); //Envia la señal de matar el proceso
		break;
		}
return 0;
}
