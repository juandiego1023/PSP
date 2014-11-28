#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
int main()
{

mknod("FIFO1",S_IFIFO|0660,0);

while(TRUE)
	{
	fp=open("FIFO1",O_RDONLY);
	nbytes=read(fp,buffer,TAM_BUF-1);
	buffer[nbytes]='\0';
	printf("Cadena recibida: %s \n",buffer);
	close(fp);

}
