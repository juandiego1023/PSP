#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define TRUE 1

int main()
{
  int contador=0;
  while(TRUE)
	{
  int result = 1;
  int fp;
  char frase[80];
  fp=open("FIFO1",1);
  int longituddecomparacion = 1;
  char salida[]="0";


if (fp==-1)
	{
	printf ("ERROR AL ABRIR ARCHIVO\n");
	exit(1);
	}
	
	printf ("Escribe la frase al consumidor o 0 para salir\n");
	scanf("%s", frase);
	result = strncmp(frase, salida, longituddecomparacion);

	if(result == 0)
		{
		printf("Saliste del bucle\n");
		return 0;
		}


	printf ("mandando frase al consumidor...\n");
	write (fp,frase,strlen(frase));
	close(fp);
	//return 0;
	}//While
}
